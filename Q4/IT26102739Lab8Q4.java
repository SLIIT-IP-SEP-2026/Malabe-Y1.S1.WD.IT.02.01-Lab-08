import java.util.Scanner;

public class IT26102739Lab8Q4
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int[] studentsArray = new int[8]; //Creating an aray of size 8
		
		for(int i = 0; i < 8; i++){
			System.out.print("Enter Student ID for Student " + (i + 1) + ": ");
			int ID = input.nextInt();
		
			//To check whether the ID is Positive
			if(ID <= 0){
				System.out.print("Error: Please Enter ONLY Positive Numbers");
				System.out.println();
				i--; //To repeat the same position, if an invalid ID is entered
			}
			else{
				studentsArray[i] = ID; //To store the student IDs
			}
		}
		System.out.println();
		System.out.print("Enter a Student ID to Search: ");
		int searchID = input.nextInt();
		
		boolean found = false; // Initially we assume that the searched ID is not available
		
		for(int i = 0; i < 8; i++){
			if(studentsArray[i] == searchID){
				found = true;
				break; // Stops the searching loop once the required ID is found
			}
		}
		
		System.out.println();
		
		//Displaying the Search Result
		if(found){
			System.out.println("Student is Available");
		}
		else{
			System.out.println("Student is Not Available");
		}
	}
}
			