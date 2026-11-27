import java.util.Scanner;

public class IT26101727Lab8Q1A {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = new int[5];

        getNumbers(myArray);
        displayReverse(myArray);

    }

    
    public static void getNumbers(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();

        }
    }

    
    public static void displayReverse(int[] myArray) {

        System.out.println("Numbers in reverse order:");

        for (int i = myArray.length - 1; i >= 0; i--) {

            System.out.println(myArray[i]);

        }
    }
}
