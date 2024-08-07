import java.util.Arrays;
import java.util.Random;

public class NthSmallestNumber {
    public static void main(String[] args) {
        int n = 12; // Change this value to get the nth smallest number
        int[] randomNumbers = new int[500];
        Random random = new Random();

        // Generate 500 random numbers
        for (int i = 0; i < 500; i++) {
            randomNumbers[i] = random.nextInt(1000) + 1; // Random numbers between 1 and 1000
        }

        // Sort the array of random numbers
        Arrays.sort(randomNumbers);

        // Find the nth smallest number
        int nthSmallestNumber = randomNumbers[n - 1]; // n-1 because array index starts from 0

        System.out.println("The " + n + "th smallest number is: " + nthSmallestNumber);
    }
}
