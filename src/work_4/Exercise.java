package work_4;

import javax.swing.*;
import java.awt.*;
public class Exercise extends JFrame {
    JButton button1 = new JButton("AC Milan");
    JButton button2 = new JButton("Real Madrid");
    JLabel lbl1 = new JLabel("Result: 0 X 0");
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner: DRAW");
    JPanel[] pnl = new JPanel[9];
    int score1, score2;

    public Exercise() {
        setSize(500,300);
        setLayout(new GridLayout(3,3));
        for(int i = 0 ; i < pnl.length ; i++) {
            pnl[i] = new JPanel();
            pnl[i].setLayout(new BorderLayout());
            add(pnl[i]);
        }
        pnl[0].add(button1, BorderLayout.CENTER);
        pnl[2].add(button2, BorderLayout.CENTER);

        pnl[1].add(lbl1, BorderLayout.CENTER);
        pnl[4].add(lbl2, BorderLayout.CENTER);
        pnl[7].add(lbl3, BorderLayout.CENTER);

        button1.addActionListener(ae -> {
            lbl1.setText("Result: " + (score1 += 1) + " X " + score2);
            lbl2.setText("Last Scorer: AC Milan");
            if (score1 > score2) lbl3.setText("Winner: AC Milan");
            else if (score1 < score2) lbl3.setText("Winner: Real Madrid");
            else lbl3.setText("Winner: DRAW");
        });
        button2.addActionListener(ae -> {
            lbl1.setText("Result: "+ score1 +" X "+(score2 += 1));
            lbl2.setText("Last Scorer: Real Madrid");
            if (score1 > score2) lbl3.setText("Winner: AC Milan");
            else if (score1 < score2) lbl3.setText("Winner: Real Madrid");
            else lbl3.setText("Winner: DRAW");
        });
    }


    public static void main(String[]args)
    {
        new Exercise().setVisible(true);
    }
}
