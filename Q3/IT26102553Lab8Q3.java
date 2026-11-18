import java.util.Scanner;

public class Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];

        for (int i = 0; i < 6; ) {

            System.out.print("Enter a positive number: ");
            int num = input.nextInt();

            if (num > 0) {
                myArray[i] = num;
                i++;
            }
            else {
                System.out.println("Error! Enter a positive number.");
            }
        }

        int max = myArray[0];

        for (int i = 1; i < 6; i++) {
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("Maximum number is: " + max);

    }
}