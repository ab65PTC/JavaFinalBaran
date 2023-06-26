import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomNumberStats {
    public static void main(String[] args) {
        // Generate 100 random numbers between 1 and 1000
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(1000) + 1;
            numbers.add(randomNumber);
        }

        // Calculate average value
        double average = calculateAverage(numbers);

        // Find minimum value
        int min = Collections.min(numbers);

        // Find maximum value
        int max = Collections.max(numbers);

        // Calculate standard deviation
        double standardDeviation = calculateStandardDeviation(numbers, average);

        // Find mode
        int mode = findMode(numbers);

        // Print the results
        System.out.println("Average: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
        System.out.println("Standard Deviation: " + standardDeviation);
        System.out.println("Mode: " + mode);
    }

    private static double calculateAverage(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.size();
    }

    private static double calculateStandardDeviation(List<Integer> numbers, double average) {
        double sum = 0;
        for (int number : numbers) {
            sum += Math.pow(number - average, 2);
        }
        double variance = sum / numbers.size();
        return Math.sqrt(variance);
    }

    private static int findMode(List<Integer> numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = 0;
        for (int number : numbers) {
            int frequency = frequencyMap.getOrDefault(number, 0) + 1;
            frequencyMap.put(number, frequency);
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = number;
            }
        }
        return mode;
    }
}
