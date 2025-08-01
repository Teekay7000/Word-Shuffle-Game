import java.io.*;
import java.util.*;

public class TestProgram {
    public static void main(String[] args) {
        String word = getRandomWord("words.txt");
        System.out.println("Word from file: " + word);

        MyArrayList<CharacterWrapper> wordList = Wordload.loadWord(word);

        System.out.print("Hidden word: ");
        for (int i = 0; i < wordList.size(); i++) {
            System.out.print(wordList.get(i) + " ");
        }
        System.out.println();

        int index = (int)(Math.random() * wordList.size());
        wordList.get(index).setWord(true);

        System.out.print("Word with hint: ");
        for (int i = 0; i < wordList.size(); i++) {
            System.out.print(wordList.get(i) + " ");
        }
        System.out.println();

        // Special Cases
        MyArrayList<CharacterWrapper> emptyTest = Wordload.loadWord("");
        System.out.println("Empty input test: " + emptyTest.size());

        
        try {
            MyArrayList<CharacterWrapper> nullTest = Wordload.loadWord(null);
            System.out.println("Null input test: " + nullTest.size());
        } catch (Exception e) {
            System.out.println("Null input error: " + e.getMessage());
        }

        
        try {
            CharacterWrapper wrongIndex = wordList.get(999);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Invalid index error: " + e.getMessage());
        }
    }

    private static String getRandomWord(String fileName) {
        ArrayList<String> words = new ArrayList<>();

        try {
            Scanner scan = new Scanner(new File(fileName));
            while (scan.hasNext()) {
                words.add(scan.next().trim());
            }
            scan.close();
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        if (words.isEmpty()) {
            return "Beginner";
        }

        Random rand = new Random();
        return words.get(rand.nextInt(words.size()));
    }
}
