import java.util.Scanner;

public class IT26101727Lab8Q3 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] numbers = new int[6];

        getNumbers(numbers);

        int maximum = findMaximum(numbers);

        System.out.println("Maximum number: " + maximum);

    }

    
    public static void getNumbers(int[] numbers) {

        int count = 0;

        while (count < numbers.length) {

            System.out.print("Enter positive number " + (count + 1) + ": ");
            int num = input.nextInt();

            if (num > 0) {

                numbers[count] = num;
                count++;

            }
            else {

                System.out.println("Error! Please enter a positive number.");
            }
        }
    }

    
    public static int findMaximum(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        return max;
    }
}
