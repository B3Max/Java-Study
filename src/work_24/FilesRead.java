package work_24;

import javax.swing.*;
import java.io.FileReader;
import java.io.IOException;

public class FilesRead extends JFrame {

    public FilesRead() {
        JFrame f = new JFrame("Your text");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setSize(1280, 720);
        //f.setLocation(250, 150);

        JTextArea txt = new JTextArea();
        txt.setLineWrap(true);

        try (FileReader reader = new
                FileReader("src/work_24/text.txt")) {
            int c;
            StringBuilder text = new StringBuilder();
            while ((c = reader.read()) != -1) {
                text.insert(text.length(), (char) c);
            }
            txt.setText(String.valueOf(text));
        } catch (IOException ex) {
            txt.setText(ex.getMessage());
        }

        f.add(new JScrollPane(txt));
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new FilesRead();
    }
}