package work_12._5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class Words {

    // Путь к файлу в виде: C:\Users\B3dMa\IdeaProjects\Study\src\work_12\_5\words
    public static void main(String[] args) {
        System.out.print("Введите путь к файлу: ");

        String fileName;
        String content;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error. Invalid file name.");
            return;
        }
        try {
            content = Files.readString(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("Error. Invalid file.");
            return;
        }
        String[] words = content.split(" ");

        String result = getLine(words);
        System.out.println(result);
    }


    public static String getLine(String... words) {
        if (words == null || words.length == 0 || words[0].equals(""))
            return "";
        if (words.length == 1)
            return words[0];
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(words));
        StringBuilder result = new StringBuilder();
        while (wordsList.contains(""))
            wordsList.remove("");
        result.append(wordsList.remove(0));
        while (!isContinues(wordsList, result)) {
            Collections.shuffle(wordsList);
        }
        return result.toString();
    }


    public static boolean isContinues(ArrayList<String> wordsList, StringBuilder result) {
        String firstWord = result.toString().toLowerCase();
        for (int i = 0; i < wordsList.size() - 1; ++i) {
            String secondWord = wordsList.get(i).toLowerCase();
            if (firstWord.toLowerCase().charAt(firstWord.length() - 1) != secondWord.toLowerCase().charAt(0))
                return false;
            firstWord = secondWord;
            result.append(" ").append(wordsList.remove(0));
            i--;
        }
        return true;
    }
}
