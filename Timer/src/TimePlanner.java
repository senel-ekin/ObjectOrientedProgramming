import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimePlanner {
    static DefaultListModel<String> activityListModel = new DefaultListModel<>();
    static JList<String> activityList = new JList<>(activityListModel);
    static Timer timer;
    static int remainingSeconds;
    static int originalSeconds;
    static JLabel timerLabel = new JLabel("Süre: 00:00");
    static int selectedIndex = -1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zaman Planlayıcı");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel activityLabel = new JLabel("Aktiviteler:");
        JTextField activityField = new JTextField(15);

        JLabel timeLabel = new JLabel("Süre (dk):");
        JTextField timeField = new JTextField(5);

        JButton addButton = new JButton("Ekle");
        JButton startButton = new JButton("Başlat");
        JButton stopButton = new JButton("Durdur");
        JButton resetButton = new JButton("Sıfırla");
        JButton deleteButton = new JButton("Sil");
        JButton upButton = new JButton("Yukarı Taşı");
        JButton downButton = new JButton("Aşağı Taşı");

        JPanel inputPanel = new JPanel();
        inputPanel.add(activityLabel);
        inputPanel.add(activityField);
        inputPanel.add(timeLabel);
        inputPanel.add(timeField);
        inputPanel.add(addButton);

        JPanel controlPanel = new JPanel();
        controlPanel.add(startButton);
        controlPanel.add(stopButton);
        controlPanel.add(resetButton);
        controlPanel.add(timerLabel);
        controlPanel.add(deleteButton);
        controlPanel.add(upButton);
        controlPanel.add(downButton);

        JScrollPane scrollPane = new JScrollPane(activityList);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> {
            String raw = activityField.getText().trim();
            String timeText = timeField.getText().trim();

            if (!raw.isEmpty() && timeText.matches("\\d+")) {
                String activity = raw.substring(0, 1).toUpperCase() + raw.substring(1).toLowerCase();

                int minutes = Integer.parseInt(timeText);
                String entry = activity + " - " + minutes + " dakika";
                activityListModel.addElement(entry);

                activityField.setText("");
                timeField.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Lütfen geçerli bir aktivite ve süre girin.");
            }
        });

        startButton.addActionListener(e -> {
            if (timer != null && timer.isRunning()) {
                return;
            }

            if (activityListModel.isEmpty()) {
                JOptionPane.showMessageDialog(frame, "Lütfen önce en az bir aktivite ekleyin.");
                return;
            }

            selectedIndex = 0;
            activityList.setSelectedIndex(selectedIndex);

            setTimerForSelectedActivity();

            timerLabel.setText("Süre: " + formatTime(remainingSeconds));

            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e1) {
                    remainingSeconds--;
                    timerLabel.setText("Süre: " + formatTime(remainingSeconds));
                    if (remainingSeconds <= 0) {
                        timer.stop();

                        if (selectedIndex < activityListModel.size()) {
                            String finishedActivity = activityListModel.get(selectedIndex);
                            JOptionPane.showMessageDialog(frame, "Zaman doldu, " + finishedActivity + " bitti.");
                            activityListModel.remove(selectedIndex);
                        }

                        if (!activityListModel.isEmpty()) {
                            if (selectedIndex >= activityListModel.size()) {
                                selectedIndex = activityListModel.size() - 1;
                            }
                            activityList.setSelectedIndex(selectedIndex);

                            setTimerForSelectedActivity();
                            timerLabel.setText("Süre: " + formatTime(remainingSeconds));
                            JOptionPane.showMessageDialog(frame, "Sıradaki başlıyor: " + activityListModel.get(selectedIndex));
                            timer.start();
                        } else {
                            selectedIndex = -1;
                            timerLabel.setText("Süre: 00:00");
                            JOptionPane.showMessageDialog(frame, "Tüm aktiviteler tamamlandı!");
                        }
                    }
                }
            });

            timer.setInitialDelay(0);
            timer.start();
        });

        stopButton.addActionListener(e -> {
            if (timer != null && timer.isRunning()) {
                timer.stop();
                timerLabel.setText("Süre durdu: " + formatTime(remainingSeconds));
            }
        });

        resetButton.addActionListener(e -> {
            int index = activityList.getSelectedIndex();
            if (index != -1 && originalSeconds > 0) {
                remainingSeconds = originalSeconds;
                timerLabel.setText("Süre: " + formatTime(remainingSeconds));
            } else {
                timerLabel.setText("Süre: 00:00");
            }
        });

        deleteButton.addActionListener(e -> {
            int index = activityList.getSelectedIndex();
            if (index != -1) {
                activityListModel.remove(index);
            }
        });

        upButton.addActionListener(e -> {
            int index = activityList.getSelectedIndex();
            if (index > 0) {
                String selected = activityListModel.get(index);
                activityListModel.remove(index);
                activityListModel.add(index - 1, selected);
                activityList.setSelectedIndex(index - 1);
            }
        });

        downButton.addActionListener(e -> {
            int index = activityList.getSelectedIndex();
            if (index < activityListModel.getSize() - 1 && index != -1) {
                String selected = activityListModel.get(index);
                activityListModel.remove(index);
                activityListModel.add(index + 1, selected);
                activityList.setSelectedIndex(index + 1);
            }
        });

        //Aktiviteleri sürek-bırak için
        activityList.setDragEnabled(true);
        activityList.setDropMode(DropMode.INSERT);
        activityList.setTransferHandler(new TransferHandler() {
            private int fromIndex = -1;

            @Override
            public int getSourceActions(JComponent c) {
                return MOVE;
            }

            @Override
            protected Transferable createTransferable(JComponent c) {
                fromIndex = activityList.getSelectedIndex();
                if (fromIndex < 0) return null;
                String value = activityList.getSelectedValue();
                return new StringSelection(value);
            }

            @Override
            public boolean canImport(TransferSupport support) {
                if (!support.isDataFlavorSupported(DataFlavor.stringFlavor)) {
                    return false;
                }
                JList.DropLocation dropLocation = (JList.DropLocation) support.getDropLocation();
                return dropLocation.getIndex() != -1;
            }

            @Override
            public boolean importData(TransferSupport support) {
                if (!canImport(support)) {
                    return false;
                }
                try {
                    Transferable t = support.getTransferable();
                    String data = (String) t.getTransferData(DataFlavor.stringFlavor);
                    JList.DropLocation dropLocation = (JList.DropLocation) support.getDropLocation();
                    int toIndex = dropLocation.getIndex();

                    if (fromIndex < 0 || toIndex < 0 || fromIndex == toIndex) {
                        return false;
                    }

                    activityListModel.remove(fromIndex);

                    if (toIndex > fromIndex) toIndex--;
                    activityListModel.add(toIndex, data);

                    activityList.setSelectedIndex(toIndex);
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return false;
            }
        });

        frame.setVisible(true);
    }

    private static void setTimerForSelectedActivity() {
        String selected = activityListModel.get(selectedIndex);
        String[] parts = selected.split("-");
        String timePartRaw = parts[1].trim();
        String timeDigits = timePartRaw.replaceAll("[^0-9]", "");
        originalSeconds = Integer.parseInt(timeDigits) * 60;
        remainingSeconds = originalSeconds;
    }

    private static String formatTime(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
