import java.util.Scanner;

public class Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[6];

        // Read 6 positive numbers
        for (int i = 0; i < numbers.length; i++) {
            int value;
            while (true) {
                System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
                value = input.nextInt();

                if (value > 0) {
                    break;                      
                }
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
            numbers[i] = value;
        }

        // Display array contents and find the maximum
        int max = numbers[0];
        System.out.println("\nArray Contents:");
        for (int n : numbers) {
            System.out.print(n + " ");
            if (n > max) {
                max = n;
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);
    }
}