import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TimePlanner {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Zaman Planlayıcı");
        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JLabel activityLabel = new JLabel("Aktiviteler:");
        JTextField activityField = new JTextField(15);

        JLabel timeLabel = new JLabel("Süre (dk):");
        JTextField timeField = new JTextField(5);

        JButton addButton = new JButton("Ekle");

        DefaultListModel<String> activityListModel = new DefaultListModel<>();
        JList<String> activityList = new JList<>(activityListModel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String activity = activityField.getText();
                String timeText = timeField.getText();

                if (!activity.isEmpty() && timeText.matches("\\d+")) {
                    int minutes = Integer.parseInt(timeText);
                    String entry = activity + " - " + minutes + "dakika";
                    activityListModel.addElement(entry);
                    activityField.setText("");
                    timeField.setText("");
                } else {
                    JOptionPane.showMessageDialog(frame, "Lütfen geçerli bir aktivite ve süre girin.");
                }
            }
        });

        JPanel inputPanel = new JPanel();
        inputPanel.add(activityLabel);
        inputPanel.add(activityField);
        inputPanel.add(timeLabel);
        inputPanel.add(timeField);
        inputPanel.add(addButton);

        JScrollPane scrollPane = new JScrollPane(activityList);

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.add(inputPanel, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
