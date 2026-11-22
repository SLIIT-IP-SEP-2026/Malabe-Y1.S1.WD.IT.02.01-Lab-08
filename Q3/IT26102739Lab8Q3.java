import java.util.Scanner;

public class IT26102739Lab8Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int numbers[] = new int[6]; //Creating an aray of size 6
		int i = 0; // i = number count
		int userInput;
		
		//To input 6 Positive Numbers by the user
		while(i < 6){
			System.out.print("Enter a Positive Number (" + (i + 1) + "/6 ): ");
			userInput = input.nextInt();
			
			//To check whether the Entered Number is Positive
			if(userInput > 0){
				numbers[i] = userInput; //To store the Positive Numbers
				i++;
			}
			else{
				System.out.println("Error: Please Enter ONLY Positive Numbers");
			}
		}
		
		//To find the Maximum Number in the Array
		int maxNumber = numbers[0];
		
		for(i = 0; i < numbers.length; i++){
			if(numbers[i] > maxNumber){
				maxNumber = numbers[i];
			}
		}
		
		//To display the Array contents
		System.out.println("\nArray Contents: ");
		for(i = 0; i < numbers.length; i++){
			System.out.print(numbers[i] + " ");
		}
		System.out.print("\n");
		System.out.println("The Maximum Number Entered: " + maxNumber);
	}
}
