package work_21;

import javax.swing.*;
import java.awt.*;

public class Animation extends JComponent {
    Image image = new ImageIcon("work_21/pictures/0.png").getImage();

    public void paint (Graphics g) {
        Graphics2D g2 = (Graphics2D)g;
        g2.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        Animation animation = new Animation();
        JFrame f = new JFrame("Animation");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(410, 310);
        f.setLocation(750, 300);
        f.setVisible(true);
        f.add(animation);
        //f.addKeyListener(animation);
    }
}
