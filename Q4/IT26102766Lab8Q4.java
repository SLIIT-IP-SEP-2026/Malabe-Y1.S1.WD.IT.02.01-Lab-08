import java.util.Scanner;
public class IT26102766Lab8Q4{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int[] studentsArray = new int[8];
		
		System.out.println();
		
		for(int i = 0; i < 8; i++){
			System.out.print("Enter Student ID for Student " + (i+1) + ": ");
			studentsArray[i] = input.nextInt();
			
			if(studentsArray[i] <= 0){
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				i--;
			}
		}
		
		System.out.println();
		System.out.print("Enter a Student ID to Search: ");
		int search = input.nextInt();
		
		int count = 0;
		
		for(int i = 0; i < 8; i++){
			if(search == studentsArray[i]){
			count = 1;
		    }
		}
		
		if(count == 1){
		    System.out.println();
			System.out.print("Student is Available");
		}
		else{
			System.out.println();
			System.out.print("Student is not Available");
		}
		
		System.out.println();
	
}
}