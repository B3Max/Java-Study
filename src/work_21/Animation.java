package work_21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation extends JComponent implements ActionListener {
    Image image = new ImageIcon("src/work_21/pictures/0.png").getImage();
    Timer t;

    Animation() {
        t = new Timer(100, this);
        t.start();
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(image, 0, 0, null);
    }

    public static void main(String[] args) {
        Animation animation = new Animation();
        JFrame f = new JFrame("Animation");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(415, 340);
        f.setLocation(750, 300);
        f.setResizable(false);
        f.add(new Animation());
        f.add(animation);
        f.setVisible(true);
    }

    int count = 1;

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (count) {
            case (0) -> image = new ImageIcon("src/work_21/pictures/0.png").getImage();
            case (1) -> image = new ImageIcon("src/work_21/pictures/1.png").getImage();
            case (2) -> image = new ImageIcon("src/work_21/pictures/2.png").getImage();
            case (3) -> image = new ImageIcon("src/work_21/pictures/3.png").getImage();
            case (4) -> image = new ImageIcon("src/work_21/pictures/4.png").getImage();
            case (5) -> image = new ImageIcon("src/work_21/pictures/5.png").getImage();
            case (6) -> image = new ImageIcon("src/work_21/pictures/6.png").getImage();
            case (7) -> image = new ImageIcon("src/work_21/pictures/7.png").getImage();
            case (8) -> image = new ImageIcon("src/work_21/pictures/8.png").getImage();
            case (9) -> image = new ImageIcon("src/work_21/pictures/9.png").getImage();
            case (10) -> image = new ImageIcon("src/work_21/pictures/10.png").getImage();

        }
        count++;
        if (count == 11)
            count = 0;
        repaint();
    }
}
