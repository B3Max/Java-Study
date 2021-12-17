package work_10;

import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.atomic.AtomicReference;

public class MainUI extends JFrame {

    static JFrame f = new JFrame();
    static JTextArea area = new JTextArea();

    private static String readFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void workWithTextFile(JFrame f, String path) throws IOException {
        f.add(area, BorderLayout.CENTER);
        String text = readFile(path);
        area.setText(text);
        if (text.isEmpty())
            area.setText("Введите свой текст");
    }

    public static void main(String[] args) {

        AbstractFactory factory1 = new FactoryText();
        AbstractFactory factory2 = new FactoryImg();
        AbstractFactory factory3 = new FactoryMusic();
        AtomicReference<String> file_name = new AtomicReference<>("defaultName");

        f.setSize(800, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setLayout(new BorderLayout());

        JMenuBar bar = new JMenuBar();
        JMenu file_menu = new JMenu("File");
        JMenu window_menu = new JMenu("Window");
        bar.add(file_menu);
        bar.add(window_menu);

        // Создание файла
        JMenu new_menu = new JMenu("New");
        JMenuItem text_menu_item = new JMenuItem("Text");
        text_menu_item.addActionListener(e -> {
            JFrame f2 = new JFrame();
            f2.setSize(100, 100);
            f2.setLocationRelativeTo(null);
            f2.setLayout(new GridLayout(2, 1));
            JTextField field = new JTextField("Enter_file_name");
            f2.add(field);
            JButton butOK = new JButton("ОК");
            f2.add(butOK);
            butOK.addActionListener(e1 -> {
                try {
                    f2.dispose();
                    file_name.set(field.getText());
                    factory1.createNew(file_name.get());
                    workWithTextFile(f, System.getProperty("user.dir") + "\\src\\work_10\\" + file_name + ".txt");
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
            f2.setVisible(true);
        });

        // Здесь можно будет создать изображение
        JMenuItem img_menu_item = new JMenuItem("Image");
        img_menu_item.addActionListener(e -> {
            JFrame f2 = new JFrame();
            f2.setSize(100, 100);
            f2.setLocationRelativeTo(null);
            f2.setLayout(new GridLayout(2, 1));
            JTextField field = new JTextField("Enter_file_name");
            f2.add(field);
            JButton butOK = new JButton("ОК");
            f2.add(butOK);
            butOK.addActionListener(e1 -> {
                try {
                    f2.dispose();
                    file_name.set(field.getText());
                    factory2.createNew(file_name.get());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
            f2.setVisible(true);
        });

        // Здесь можно будет создать аудио
        JMenuItem music_menu_item = new JMenuItem("Music");
        music_menu_item.addActionListener(e -> {
            JFrame f2 = new JFrame();
            f2.setSize(100, 100);
            f2.setLocationRelativeTo(null);
            f2.setLayout(new GridLayout(2, 1));
            JTextField field = new JTextField("Enter_file_name");
            f2.add(field);
            JButton butOK = new JButton("ОК");
            f2.add(butOK);
            butOK.addActionListener(e1 -> {
                try {
                    f2.dispose();
                    file_name.set(field.getText());
                    factory3.createNew(file_name.get());
                } catch (IOException ioException) {
                    ioException.printStackTrace();
                }
            });
            f2.setVisible(true);
        });

        file_menu.add(new_menu);
        new_menu.add(text_menu_item);
        new_menu.add(music_menu_item);
        new_menu.add(img_menu_item);

        // Открытие файла
        JMenuItem open_menu_item = new JMenuItem("Open recent");
        open_menu_item.addActionListener(e -> {
            final String[] path_file = {""};
            //указание пути
            JFrame f1 = new JFrame();
            f1.setSize(350, 100);
            f1.setLocationRelativeTo(null);
            f1.setLayout(new GridLayout(2, 1));
            JTextField field = new JTextField(System.getProperty("user.dir") + "\\src\\work_10\\" + file_name + ".txt");
            f1.add(field);
            JButton butOK = new JButton("ОК");
            f1.add(butOK);
            butOK.addActionListener(e1 -> {
                path_file[0] = field.getText();
                f1.setVisible(false);
                if (path_file[0].contains(".txt")) {
                    try {
                        workWithTextFile(f, path_file[0]);
                    } catch (IOException ioException) {
                        ioException.printStackTrace();
                    }
                }
            });
            f1.setVisible(true);

        });

        // Сохранение файла
        JMenuItem save_menu_item = new JMenuItem("Save");
        save_menu_item.addActionListener(e -> {
            if (area.isVisible()) {
                try (FileWriter writer = new FileWriter(System.getProperty("user.dir") + "\\src\\work_10\\" + file_name + ".txt", false)) {
                    writer.write(area.getText());
                    writer.flush();
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        });


        // Выход
        JMenuItem exit_menu_item = new JMenuItem("Close");
        exit_menu_item.addActionListener(e -> {
            f.getContentPane().removeAll();
            f.setJMenuBar(bar);
        });
        file_menu.add(open_menu_item);
        file_menu.add(save_menu_item);
        window_menu.add(exit_menu_item);

        f.setJMenuBar(bar);
        f.setVisible(true);
    }
}

