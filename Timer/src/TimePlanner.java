import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimePlanner {
    static DefaultListModel<String> activityListModel = new DefaultListModel<>();
    static JList<String> activityList = new JList<>(activityListModel);
    static Timer timer;
    static int remainingSeconds;
    static JLabel timerLabel = new JLabel("Süre: 00:00");
    static int selectedIndex = -1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Zaman Planlayıcı");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel activityLabel = new JLabel("Aktiviteler:");
        JTextField activityField = new JTextField(15);

        JLabel timeLabel = new JLabel("Süre (dk):");
        JTextField timeField = new JTextField(5);

        JButton addButton = new JButton("Ekle");
        JButton startButton = new JButton("Başlat");
        JButton stopButton = new JButton("Durdur");

        JPanel inputPanel = new JPanel();
        inputPanel.add(activityLabel);
        inputPanel.add(activityField);
        inputPanel.add(timeLabel);
        inputPanel.add(timeField);
        inputPanel.add(addButton);

        JPanel controlPanel = new JPanel();
        controlPanel.add(startButton);
        controlPanel.add(stopButton);
        controlPanel.add(timerLabel);

        JScrollPane scrollPane = new JScrollPane(activityList);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        addButton.addActionListener(e -> {
            String activity = activityField.getText();
            String timeText = timeField.getText();

            if (!activity.isEmpty() && timeText.matches("\\d+")) {
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
            selectedIndex = activityList.getSelectedIndex();
            if (selectedIndex == -1) {
                JOptionPane.showMessageDialog(frame, "Lütfen bir aktivite seçin.");
                return;
            }
            String selected = activityListModel.get(selectedIndex);
            String[] parts = selected.split("-");
            String timePart = parts[1].trim().split(" ")[0];
            remainingSeconds = Integer.parseInt(timePart) * 60;

            timerLabel.setText("Süre: " + formatTime(remainingSeconds));

            if (timer != null && timer.isRunning()) {
                timer.stop();
            }

            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    remainingSeconds--;
                    timerLabel.setText("Süre: " + formatTime(remainingSeconds));
                    if (remainingSeconds <= 0) {
                        timer.stop();
                        JOptionPane.showMessageDialog(frame, "Zaman doldu: " + activityListModel.get(selectedIndex));
                    }
                }
            });
            timer.start();
        });

        startButton.addActionListener(e -> {
            if (timer != null && timer.isRunning()) {
                timer.stop();
                timerLabel.setText("Süre durdu");
            }
        });

        frame.setVisible(true);
    }

    private static String formatTime(int totalSeconds) {
        int minutes = totalSeconds / 60;
        int seconds = totalSeconds % 60;
        return String.format("%02d:%02d", minutes, seconds);
    }
}
