import java.util.Scanner;

public class IT26101727Lab8Q4 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        int[] studentsArray = new int[8];

        getStudentIDs(studentsArray);

        System.out.print("Enter Student ID to search: ");
        int searchID = input.nextInt();

        boolean found = searchStudent(studentsArray, searchID);

        if (found) {
            System.out.println("Student is Available");
        }
        else {
            System.out.println("Student is Not Available");
        }
    }

    
    public static void getStudentIDs(int[] studentsArray) {

        int count = 0;

        while (count < studentsArray.length) {

            System.out.print("Enter Student ID " + (count + 1) + ": ");
            int id = input.nextInt();

            if (id > 0) {

                studentsArray[count] = id;
                count++;

            }
            else {
                System.out.println("Error! Student ID must be positive.");
            }
        }
    }

    
    public static boolean searchStudent(int[] studentsArray, int searchID) {

        for (int i = 0; i < studentsArray.length; i++) {

            if (studentsArray[i] == searchID) {
                return true;
            }
        }

        return false;
    }
}
