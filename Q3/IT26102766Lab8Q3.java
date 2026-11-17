import java.util.Scanner;
public class IT26102766Lab8Q3{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		int[] myArray = new int[6];
		
		for(int i = 0; i < 6; i++){
			System.out.print("Enter a Positive Number (" + (i+1) + "/6): ");
			myArray[i] = input.nextInt();
			
			if (myArray[i] <= 0){
				System.out.println("Error: Please Enter ONLY Positive Numbers");
				i--;
			}
		}
		
		System.out.println();
		System.out.println("Array Constents:");
		for(int i = 0; i < 6; i++){
			System.out.print(myArray[i] + " ");
		}
		
		int max = myArray[0];
		
		for(int i = 1; i < 6; i ++){
			if(myArray[i] > max){
				max = myArray[i];
			}
		}
		
		System.out.println();
		System.out.println("The Maximum Number Entered: " + max);
				
	}
}