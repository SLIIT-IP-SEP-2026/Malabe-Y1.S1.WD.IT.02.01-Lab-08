import java.util.Scanner;

public class IT26102744Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];
        int i = 0;

        while (i < studentsArray.length) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[i] = id;
                i++;
            }
        }

        System.out.println();
        System.out.print("Enter a Student ID to Search: ");
        int search = sc.nextInt();

        boolean found = false;
        for (int id : studentsArray) {
            if (id == search) {
                found = true;
                break;
            }
        }

        System.out.println();
        if (found) {
            System.out.println("Student is Available");
        } else {
            System.out.println("Student is Not Available");
        }
        sc.close();
    }
}
