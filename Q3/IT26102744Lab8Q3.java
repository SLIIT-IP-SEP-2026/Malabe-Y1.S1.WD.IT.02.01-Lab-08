import java.util.Scanner;

public class IT26102744Lab8Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[6];
        int i = 0;

        while (i < numbers.length) {
            System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
            int value = sc.nextInt();

            if (value <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                numbers[i] = value;
                i++;
            }
        }

        int max = numbers[0];
        System.out.println();
        System.out.println("Array Contents:");
        for (int n : numbers) {
            System.out.print(n + " ");
            if (n > max) {
                max = n;
            }
        }

        System.out.println();
        System.out.println("The Maximum Number Entered: " + max);
        sc.close();
    }
}
