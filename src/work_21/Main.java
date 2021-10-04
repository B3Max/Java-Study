package work_21;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Main extends JComponent implements KeyListener, ActionListener {
    Image grass = new ImageIcon("work_21/pictures/0.png").getImage();

    public void paint (Graphics g) {
        Graphics2D gr = (Graphics2D)g;
        gr.drawImage(grass, 0, 0, null);
    }

    public static void main(String[] args) {
        Main t = new Main();
        JFrame f = new JFrame("Gr test");
        f.setSize(530, 520);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.addKeyListener(t);
        f.add(new Main());
        f.add(t);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
