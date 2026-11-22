import java.util.Scanner;

public class Lab8Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        int evenCount = 0;

        // Reading 5 numbers
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }

        // Display the original array
        System.out.println("\nMy array contents:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        // Copying the even numbers into evenArray
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[evenCount] = myArray[i];
                evenCount++;
            }
        }

        // Display only the stored even numbers
        System.out.println("\nEven array contents:");
        for (int i = 0; i < evenCount; i++) {
            System.out.println(evenArray[i]);
        }
    }
}