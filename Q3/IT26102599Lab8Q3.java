import java.util.Scanner;

public class IT26102599Lab8Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] myArray = new int[6];
        int i = 0;

        while (i < 6) {
            System.out.print("Enter a Positive Number (" 
                             + (i + 1) + "/6): ");

            int num = input.nextInt();

            if (num > 0) {
                myArray[i] = num;
                i++;
            } else {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
        }

        int max = myArray[0];

        System.out.println("\nArray Contents:");

        for (i = 0; i < 6; i++) {
            System.out.print(myArray[i] + " ");

            if (myArray[i] > max) {
                max = myArray[i];
            }
        }

        System.out.println("\nThe Maximum Number Entered: " + max);

        input.close();
    }
}