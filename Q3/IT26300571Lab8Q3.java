import java.util.Scanner;

public class IT26300571Lab8Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numberArray = new int[6];
        int count = 0;
        int userInput;

        while (count < 6) {
            System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
            userInput = input.nextInt();

            if (userInput > 0) {
                numberArray[count] = userInput;
                count++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        // displaying the array contents
        System.out.println();
        System.out.println("Array Contents:");
        for (int i = 0; i < numberArray.length; i++) {
            System.out.print(numberArray[i] + " ");
        }
        System.out.println();

        // finding the maximum number in the array
        int maxNum = numberArray[0];

        for (int i = 1; i < numberArray.length; i++) {
            if (numberArray[i] > maxNum) {
                maxNum = numberArray[i];
            }
        }

        System.out.println("The Maximum Number Entered: " + maxNum);
    }
}