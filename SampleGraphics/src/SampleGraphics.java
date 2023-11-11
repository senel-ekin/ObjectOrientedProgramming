import javax.swing.*;
import java.awt.*;

class Panel extends JPanel{
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(30,40,100,30);
        g.setColor(Color.BLACK);
        g.fillRect(150,100,100,30);
    }
}
public class SampleGraphics {
    public static void main(String[] args){
        Panel screen = new Panel();
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame panel = new JFrame("Rectangle");
        panel.setSize(300,200);
        panel.setLocation(300,300);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.WHITE);
        panel.add(screen);
        panel.setVisible(true);
    }
}
