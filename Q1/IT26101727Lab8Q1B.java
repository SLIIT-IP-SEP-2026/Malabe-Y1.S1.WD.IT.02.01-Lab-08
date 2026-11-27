import java.util.Scanner;

public class IT26101727Lab8Q1B {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        getNumbers(myArray);

        int count = findEvenNumbers(myArray, evenArray);

        displayEvenNumbers(evenArray, count);
    }

    
    public static void getNumbers(int[] myArray) {

        for (int i = 0; i < myArray.length; i++) {

            System.out.print("Enter number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }
    }

    
    public static int findEvenNumbers(int[] myArray, int[] evenArray) {

        int count = 0;

        for (int i = 0; i < myArray.length; i++) {

            if (myArray[i] % 2 == 0) {

                evenArray[count] = myArray[i];
                count++;
            }
        }

        return count;
    }

    
    public static void displayEvenNumbers(int[] evenArray, int count) {

        System.out.println("Even numbers:");

        for (int i = 0; i < count; i++) {

            System.out.println(evenArray[i]);
        }
    }
}
