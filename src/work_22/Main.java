package work_22;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {

    public Main() {
        JFrame f = new JFrame("Choose your destiny");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(500, 500);
        f.setLocation(750, 300);
        f.setResizable(false);

        JTextArea text = new JTextArea("\n\n\nЯ вас категорически приветствую. \n");
        text.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        text.setLineWrap(true);

        JMenuBar bar = new JMenuBar();

        JMenu colours = new JMenu("Colours");
        JMenuItem blue = new JMenuItem("Синий");
        colours.add(blue);
        JMenuItem red = new JMenuItem("Красный");
        colours.add(red);
        JMenuItem black = new JMenuItem("Черный");
        colours.add(black);

        blue.addActionListener(e -> text.setForeground(Color.BLUE));
        red.addActionListener(e -> text.setForeground(Color.RED));
        black.addActionListener(e -> text.setForeground(Color.BLACK));

        JMenu fonts = new JMenu("Fonts");
        JMenuItem Times = new JMenuItem("Times New Roman");
        fonts.add(Times);
        JMenuItem MS = new JMenuItem("MS Sans Serif");
        fonts.add(MS);
        JMenuItem Courier = new JMenuItem("Courier New");
        fonts.add(Courier);

        Times.addActionListener(e -> text.setFont(new Font("Times New Roman", Font.PLAIN, 20)));
        MS.addActionListener(e -> text.setFont(new Font("MS Sans Serif", Font.PLAIN, 20)));
        Courier.addActionListener(e -> text.setFont(new Font("Courier New", Font.PLAIN, 20)));

        bar.add(colours);
        bar.add(fonts);
        f.setJMenuBar(bar);
        f.add(new JScrollPane(text));

        f.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
