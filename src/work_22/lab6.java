package work_22;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

public class lab6 extends JFrame {

    private lab6(){
        setSize(720, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JTextArea ta = new JTextArea();
        ta.setFont(new Font("Times New Roman", Font.PLAIN, 20));

        String[] colors = {"Черный", "Красный", "Синий"};
        JComboBox<String> cols = new JComboBox<>(colors);
        cols.setSelectedIndex(0);

        String[] f = {"Times New Roman", "MS Sans Serif", "Courier New"};
        JComboBox<String> fonts = new JComboBox<>(f);
        fonts.setSelectedIndex(0);

        fonts.addItemListener(e -> ta.setFont(new Font(f[fonts.getSelectedIndex()], Font.PLAIN, 20)));

        cols.addItemListener(e -> {
            Color c = switch (cols.getSelectedIndex()) {
                case 1 -> Color.RED;
                case 2 -> Color.BLUE;
                default -> Color.BLACK;
            };
            ta.setForeground(c);
        });

        getContentPane().add(cols, BorderLayout.NORTH);
        getContentPane().add(fonts, BorderLayout.SOUTH);
        getContentPane().add(ta);

    }

    public static void main(String[] args) {
        new lab6().setVisible(true);
    }
}