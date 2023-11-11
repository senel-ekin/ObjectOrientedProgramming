import javax.swing.*;
import java.awt.*;

public class Rectangle {
    public static void main(String[] args){
        JFrame screen;
        Container contentPane;
        Graphics g;

        screen = new JFrame("My first rectangle");
        screen.setSize(300, 200);
        screen.setLocation(300,300);
        screen.setVisible(true);

        contentPane = screen.getContentPane();
        g = contentPane.getGraphics();
        g.drawRect(80,50,100,30);
    }
}
