import java.util.Scanner;
public class IT26102411Lab8Q4{
	public static void main(String[] args){
		int[] studentarr = new int[8];
		int numcheck = 0;
		int userIn = 0;
		int mysrch = 0;
		int result = 0;
		Scanner input = new Scanner(System.in);
		
		
		while (numcheck < 8 ){
			
			System.out.println("Enter Student ID Num (" + (numcheck+1) + "/8) ");
			userIn = input.nextInt();
			if (userIn > 0 ){
				studentarr[numcheck] = userIn;
				numcheck++;
			
			}
			
			else{
				System.out.println("Error : Enter positive Num Only:");
			}	
		}
		
		System.out.println("Enter Student ID to search :");
		mysrch = input.nextInt();
		
		
		
		
		for(int i = 0 ; i < 8 ; i++){
			if (studentarr[i] == mysrch){
				result = 1;
				break;
				
			}
			else{
				result = 0;
			}
			
		}
		
		System.out.println(" ");
		if (result == 1){
			System.out.println("Student is Available");
		}
		else{
			System.out.println("Student is Not Available");
		}
	}
}