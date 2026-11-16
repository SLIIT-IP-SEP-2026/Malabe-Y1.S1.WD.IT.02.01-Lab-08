import java.util.Scanner;

public class IT26101664Lab8Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] studentsArray = new int[8];
        int id;

        // Input 8 positive Student IDs
        for (int i = 0; i < 8; i++) {
            System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
            id = input.nextInt();

            // Check for negative or zero input
            if (id <= 0) {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--; // Repeat the prompt for the same student
            } else {
                studentsArray[i] = id;
            }
        }

        // Ask user for a Student ID to search
        System.out.print("\nEnter a Student ID to Search: ");
        int searchID = input.nextInt();

        boolean isAvailable = false;

        // Search through the array
        for (int i = 0; i < 8; i++) {
            if (studentsArray[i] == searchID) {
                isAvailable = true;
                break;
            }
        }

        // Display Search Results
        if (isAvailable) {
            System.out.println("\nStudent is Available");
        } else {
            System.out.println("\nStudent is Not Available");
        }

        input.close();
    }
}