import javax.swing.JFrame;
import java.awt.Color;

public class Main {
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Snake game ");
        frame.setBounds(10, 10, 1366, 768);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GamePanel panel = new GamePanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.add(panel);
 
        frame.setVisible(true);
    }
}
