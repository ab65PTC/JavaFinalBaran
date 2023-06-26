import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        File file = new File("../Final/FileIO1Project/raven.txt");
        String[] wordsToCount = {"Raven", "nevermore", "it"};

        try {
            Scanner scanner = new Scanner(file);
            int[] wordCounts = new int[wordsToCount.length];

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                for (int i = 0; i < wordsToCount.length; i++) {
                    wordCounts[i] += countWord(line, wordsToCount[i]);
                }
            }

            for (int i = 0; i < wordsToCount.length; i++) {
                System.out.println(wordsToCount[i] + ": " + wordCounts[i]);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    private static int countWord(String line, String word) {
        int count = 0;
        String[] words = line.split("\\W+");
        for (String w : words) {
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        return count;
    }
}
