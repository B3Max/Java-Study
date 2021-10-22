package work_7;

import java.util.ArrayDeque;
import java.util.Deque;

public class DrunkGame {

    Deque<Integer> player1, player2;

    public DrunkGame(String deck1, String deck2) {
        this.player1 = new ArrayDeque<>();
        this.player2 = new ArrayDeque<>();
        if (deck1.length() != 5 || deck2.length() != 5) {
            System.out.println("Ошибка! По условию игрок имеет 5 карт.");
        }
        for (int i = 0; i < 5; i++) {
            this.player1.addLast(Integer.parseInt(deck1.substring(i, i + 1)));
            this.player2.addLast(Integer.parseInt(deck2.substring(i, i + 1)));
        }
        begin();
    }

    public void begin() {
        int count = 0;
        while (!player1.isEmpty() && !player2.isEmpty() && count < 106) {
            if (((player1.peekFirst() > player2.peekFirst()) && (player1.peekFirst() != 9 || player2.peekFirst() != 0))
                    || player1.peekFirst() == 0 && player2.peekFirst() == 9) {
                player1.addLast(player1.removeFirst());
                player1.addLast(player2.removeFirst());
            } else {
                player2.addLast(player1.removeFirst());
                player2.addLast(player2.removeFirst());
            }
            count++;
        }
        String win = null;
        if (player1.isEmpty()) win = "second ";
        else if (player2.isEmpty()) win = "first ";
        if (count >= 106) {
            System.out.println("botva");
        }
        else
            System.out.println(win + count);
        //System.out.println(player1);
    }

    public static void main(String[] args) {
        new DrunkGame("12345", "67890");
        new DrunkGame("67890", "12345"); // 61728394 05 - 72839460 15
        new DrunkGame("13570", "24689");
        new DrunkGame("14739", "25860");
        new DrunkGame("19283", "45670"); // 958730 1426
        new DrunkGame("13570", "24689");
    }
}