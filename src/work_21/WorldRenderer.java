package work_21;

import java.awt.Graphics;
import java.awt.Image;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WorldRenderer extends JPanel {


    private static final int HEIGHT = 760;
    private static final int WIDTH = 500;

    private Image image;
    public WorldRenderer() {
        JFrame frame = new JFrame("Application name");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(WIDTH, HEIGHT);
        frame.add(this);
        frame.setVisible(true);
        image =  new ImageIcon("res/angle_LD.png").getImage();
        count = 0;
        Timer timer = new Timer();
        timer.schedule(animate, 1,200);
    }

    private int count;
    TimerTask animate = new TimerTask() {

        @Override
        public void run() {
            switch (count) {
                case 0 -> image = new ImageIcon("work_21/pictures/0.png").getImage();
                case 1 -> image = new ImageIcon("work_21pictures/1.png").getImage();
                case 2 -> image = new ImageIcon("work_21pictures/2.png").getImage();
                case 3 -> image = new ImageIcon("work_21pictures/3.png").getImage();
                case 4 -> image = new ImageIcon("work_21pictures/4.png").getImage();
                case 5 -> image = new ImageIcon("work_21pictures/5.png").getImage();
                case 6 -> image = new ImageIcon("work_21pictures/6.png").getImage();
                case 7 -> image = new ImageIcon("work_21pictures/7.png").getImage();
                case 8 -> image = new ImageIcon("work_21pictures/8.png").getImage();
                case 9 -> image = new ImageIcon("work_21pictures/9.png").getImage();
                case 10 -> image = new ImageIcon("work_21pictures/10.png").getImage();
                default -> {
                }
            }
            count++;
            if (count == 10) {
                count = 0;
            }
            repaint();
        }
    };

    public void paint(Graphics canvas) {
        canvas.drawImage(image, 0, 0,  null);
    }

}