import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//Panel
public class XOX extends JPanel implements MouseListener {
    private int[][] board = new int[3][3];
    private boolean xTurn = true; //İlk oyuncu X olacak şekilde ayarlandı

    public XOX(){
        addMouseListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;

        g2.setStroke(new BasicStroke(3));

        g2.setColor(Color.BLACK);

        int width = getWidth();
        int height = getHeight();
        int cellWidth = width/3;
        int cellHeight = height/3;

        //Dikey Çizgiler
        g2.drawLine(cellWidth, 0, cellWidth, height);
        g2.drawLine(cellWidth * 2, 0, cellWidth * 2, height);

        //Yatay Çizgiler
        g2.drawLine(0, cellHeight, width, cellHeight);
        g2.drawLine(0, cellHeight *2 , width, cellHeight * 2);

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                int x = col * cellWidth;
                int y = row * cellHeight;
                if (board[row][col] == 1) {
                    drawX(g2, x, y, cellWidth, cellHeight);
                } else if (board[row][col] == 2) {
                    drawO(g2, x, y, cellWidth, cellHeight);
                }
            }
        }
    }

    private void drawX(Graphics2D g2, int x, int y, int w, int h) {
        g2.setColor(Color.RED);
        g2.setStroke(new BasicStroke(5));
        g2.drawLine(x + 10, y + 10, x + w - 10, y + h - 10);
        g2.drawLine(x + w - 10, y + 10, x + 10, y + h - 10);
    }

    private void drawO(Graphics2D g2, int x, int y, int w, int h) {
        g2.setColor(Color.BLUE);
        g2.setStroke(new BasicStroke(5));
        g2.drawOval(x + 10, y + 10, w - 20, h - 20);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        int cellWidth = getWidth() / 3;
        int cellHeight = getHeight() / 3;
        int col = e.getX() / cellWidth;
        int row = e.getY() / cellHeight;

        if(row < 3 && col < 3 && board[row][col] == 0) {
            board[row][col] = xTurn ? 1:2;
            xTurn = !xTurn;
            repaint();

            int winner = checkWinner();
            if (winner != 0) {
                String message = (winner == 1) ? "X WIN!" : "O WIN!";
                JOptionPane.showMessageDialog(this, message);
                resetBoard();
            } else if (checkDraw()) {
                JOptionPane.showMessageDialog(this, "No winner!");
                resetBoard();
            }
        }
    }

    private boolean checkDraw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    private int checkWinner() {
        //Satır için;
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 &&
                    board[i][0] == board[i][1]&&
                    board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }

        //Sütun için;
        for (int i = 0; i < 3; i++) {
            if (board[0][i] != 0 &&
                    board[0][i] == board[1][i] &&
                    board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        //Çapraz kontrol;
        if (board[0][0] != 0 &&
                board[0][0] == board[1][1] &&
                board[1][1] == board[2][2]) {
            return board[0][0];
        }
        if (board[0][2] != 0 &&
                board[0][2] == board[1][1] &&
                board[1][1] == board[2][0]) {
            return board[0][2];
        }

        //Kazanan yoksa eğer
        return 0;
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 0;
            }
        }
        xTurn = true;
        repaint();
    }

    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public static void main(String[] args){
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame panel = new JFrame("XOX");
        panel.setSize(500,500);
        panel.setLocation(20,20);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setBackground(Color.WHITE);

        XOX screen = new XOX();
        panel.add(screen);

        panel.setVisible(true);
    }
}

