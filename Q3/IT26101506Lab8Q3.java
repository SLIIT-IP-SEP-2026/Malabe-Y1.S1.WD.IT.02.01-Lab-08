import java.util.Scanner;
public class IT26101506Lab8Q3 {
	public static void main(String[] args){
		
		int numberArray[] = new int[6];
		int nummberCount = 0;
		int userInput;
		
		Scanner input = new Scanner (System.in);
		
		while (nummberCount < 6){
			
		System.out.print("Enter a Postive Number (" + (nummberCount + 1) + "/6)");
		userInput = input.nextInt();
		
		if(userInput > 0){
			numberArray[nummberCount] = userInput;// Store the Positive Number
			nummberCount++;
		}
		else{
			System.out.println("Error: Please Enter ONLY Positive Numbers");
		}
	}
	//Find the Maximum Number in the Array
	int maxNumber = numberArray[0];
	
	for(int count = 0; count < numberArray.length; count++){
		if(numberArray[count] > maxNumber){
			maxNumber = numberArray[count];
		}
	}
	
	//Print Number Array
	System.out.println("\nArray Contents:");
	for (int count = 0; count < numberArray.length; count++){
		System.out.print(numberArray[count] + " ");
	}
	
	System.out.println();
	System.out.println("The Maximum Number Entered: " + maxNumber);
	}
}
	