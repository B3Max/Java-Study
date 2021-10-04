//package work_21;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.io.IOException;
//import java.net.URL;
//import java.util.TimerTask;
//
//public class Animation extends JComponent {
//
//    public static void main(String[] args) {
//        ImageFrame f = new ImageFrame();
//        f.setTitle("Animation");
//        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(410, 310);
//        f.setLocation(750, 300);
//        f.setVisible(true);
//    }
//}
//
//class ImageFrame extends JFrame {
//    public ImageFrame() {
//        ImageComponent component = new ImageComponent();
//        add(component);
//    }
//}
//
//class ImageComponent extends JComponent {
//    String filename = "https://storage.vsemayki.ru/images/0/2/2882/2882139/previews/people_4_manshortfull_front_white_500.jpg";
//    Image image;
//
//    public ImageComponent() {
//        // Получаем изображения.
//        try {
//            image = ImageIO.read(new URL(filename));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public void paintComponent(Graphics g) {
//        if (image == null) return;
//        g.drawImage(image, 0, 0, null);
//    }
//
//}
//
//    int count;
//    TimerTask animate = new TimerTask() {
//
//        public void run() {
//            switch (count) {
//                case 0 -> image = new ImageIcon("work_21/pictures/0.png").getImage();
//                case 1 -> image = new ImageIcon("work_21pictures/1.png").getImage();
//                case 2 -> image = new ImageIcon("work_21pictures/2.png").getImage();
//                case 3 -> image = new ImageIcon("work_21pictures/3.png").getImage();
//                case 4 -> image = new ImageIcon("work_21pictures/4.png").getImage();
//                case 5 -> image = new ImageIcon("work_21pictures/5.png").getImage();
//                case 6 -> image = new ImageIcon("work_21pictures/6.png").getImage();
//                case 7 -> image = new ImageIcon("work_21pictures/7.png").getImage();
//                case 8 -> image = new ImageIcon("work_21pictures/8.png").getImage();
//                case 9 -> image = new ImageIcon("work_21pictures/9.png").getImage();
//                case 10 -> image = new ImageIcon("work_21pictures/10.png").getImage();
//                default -> {
//                }
//            }
//            count++;
//            if (count == 10) {
//                count = 0;
//            }
//            repaint();
//        }
//
//    };