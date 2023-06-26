import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {
        File file = new File("../Final/FileIO1Project/raven.txt");

        try (// Ask the user for words to replace in the poem
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter an animal: ");
            String animal = scanner.nextLine();
            System.out.print("Enter a girl's name: ");
            String girlName = scanner.nextLine();
            System.out.print("Enter a weird word: ");
            String weirdWord = scanner.nextLine();

            try {
                Scanner fileScanner = new Scanner(file);

                // Replace the words in the poem (ignoring case)
                StringBuilder poem = new StringBuilder();
                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    line = replaceIgnoreCase(line, "raven", animal);
                    line = replaceIgnoreCase(line, "Lenore", girlName);
                    line = replaceIgnoreCase(line, "nevermore", weirdWord);
                    poem.append(line).append("\n");
                }

                // Display the modified poem
                System.out.println("Modified Poem:");
                System.out.println(poem);

                fileScanner.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
            }
        }
    }

    private static String replaceIgnoreCase(String line, String target, String replacement) {
        return line.replaceAll("(?i)" + target, replacement);
    }
}
