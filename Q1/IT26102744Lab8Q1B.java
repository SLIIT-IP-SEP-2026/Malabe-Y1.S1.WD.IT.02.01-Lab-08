import java.util.Scanner;

public class IT26102744Lab8Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5];
        int[] evenArray = new int[5];

        System.out.println("Enter 5 Numbers:");
        for (int i = 0; i < myArray.length; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }

        int count = 0;
        for (int num : myArray) {
            if (num % 2 == 0) {
                evenArray[count] = num;
                count++;
            }
        }

        System.out.println();
        System.out.println("myArray Contents:");
        for (int num : myArray) {
            System.out.print(num + " ");
        }

        System.out.println("\n");
        System.out.println("evenArray Contents:");
        for (int num : evenArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        sc.close();
    }
}
