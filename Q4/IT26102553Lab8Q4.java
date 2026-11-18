import java.util.Scanner;

public class Lab8Q4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] studentsArray = new int[8];

         for (int i = 0; i < 8; ) {

            System.out.print("Enter Student ID: ");
            int id = input.nextInt();

            if (id > 0) {
                studentsArray[i] = id;
                i++;
            } 
            else {
                System.out.println("Error! Invalid Student ID.");
            }
        }
        System.out.print("Enter Student ID to search: ");
        int searchID = input.nextInt();
        boolean found = false;

        for (int i = 0; i < 8; i++) {

            if (studentsArray[i] == searchID) {
                found = true;
                break;
            }
        }
        if (found == true ) {
            System.out.println("Student is Available");
        } 
        else {
            System.out.println("Student is Not Available");
        }
    }
}