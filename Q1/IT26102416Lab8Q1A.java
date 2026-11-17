import java.util.Scanner;

public class IT26102416Lab8Q1A {

    public static void inputNumbers(int[] myArray) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 5 Numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = input.nextInt();
        }
    }

    public static void printReverse(int[] myArray) {

        System.out.println();
        System.out.println("Array in Reverse Order:");

        for (int i = 4; i >= 0; i--) {
            System.out.print(myArray[i] + " ");
        }
    }

    public static void main(String[] args) {

        int[] myArray = new int[5];

        inputNumbers(myArray);
        printReverse(myArray);
    }
}