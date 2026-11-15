
  
import java.util.Scanner;

public class IT26102493Lab8Q1A {
    public static void main(String[] args) {

        int numberCount = 0;
        int[] myArray = new int[5];
        int userInput;
        Scanner input = new Scanner(System.in);

        while (numberCount < 5) {
            System.out.print("Enter number " + (numberCount + 1)+" : " );
            userInput = input.nextInt();
            myArray[numberCount] = userInput;
            numberCount++;
        }

        System.out.println("\nArray in reverse order:");
        for (int count = myArray.length - 1; count >= 0; count--) {
            System.out.print(myArray[count] + " ");
        }
        System.out.println();
    }
}
	