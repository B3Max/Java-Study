package work_4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TextAreaExample extends JFrame
{
    JTextArea txtArea = new JTextArea(20,25);
    JButton button = new JButton("Add some Text");
    JScrollPane jScroll = new JScrollPane(txtArea);
    public TextAreaExample()
    {
        super("Example");
        setSize(500,500);
        setLayout(new FlowLayout());
        //add(txtArea);
        add(jScroll); // we add the scrollPane and not the text area.
        add(button);
        button.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent ae)
            {
                String txt = JOptionPane.showInputDialog(null,"Insert some text");
                txtArea.append(txt);
            }
        });
    }

    public static void main(String[]args)
    {
        new TextAreaExample().setVisible(true);
    }
}