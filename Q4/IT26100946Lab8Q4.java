import java.util.Scanner;
public class IT26100946Lab8Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] studentsArray = new int[8];

        int count = 0;
        while (count < studentsArray.length) {
            System.out.print("Enter Student ID for Student " + (count + 1) + ": ");
            int id = sc.nextInt();

            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            } else {
                studentsArray[count] = id;
                count++;
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int search = sc.nextInt();

        boolean find = false;
        for (int i = 0; i < studentsArray.length; i++) {
            if (studentsArray[i] == search) {
                find = true;
                break;
            }
        }

        if (find) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }

        sc.close();
    }
}