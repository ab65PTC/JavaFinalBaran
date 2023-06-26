import java.util.Scanner;

public class QuizGrader {
    public static void main(String[] args) {
        String answerKey = "ADDBDCCDBABC";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter your answers: ");
            String studentAnswers = scanner.nextLine();

            int correctCount = 0;
            StringBuilder incorrectQuestions = new StringBuilder();

            for (int i = 0; i < answerKey.length(); i++) {
                if (i < studentAnswers.length()) {
                    if (studentAnswers.charAt(i) == answerKey.charAt(i)) {
                        correctCount++;
                    } else {
                        incorrectQuestions.append(i + 1).append(" ");
                    }
                }
            }

            int totalQuestions = answerKey.length();
            int incorrectCount = totalQuestions - correctCount;

            System.out.println("Score: " + correctCount + "/" + totalQuestions + " correct");

            if (incorrectCount > 0) {
                System.out.println("Incorrect question(s): " + incorrectQuestions);
            }
        }
    }
}
