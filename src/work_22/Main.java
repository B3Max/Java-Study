package work_22;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main extends JFrame {
    //Font font1 = new Font("Times New Roman",);

    public Main() {
        JFrame f = new JFrame("Choose your colour");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(300, 170);
        f.setLocation(750, 300);
        f.setResizable(false);
        f.setVisible(true);
        JTextArea text = new JTextArea("Я вас категорически приветствую");
        f.add(text);
    }

    public static void main(String[] args) {
        new Main();
    }
}
