import java.util.Scanner;

public class IT26102739Lab8Q1B
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int myArray[] = new int[5]; // 1D Array
		int evenArray[] = new int[5]; // 1D Array
		int evenNum = 0;
		System.out.println("Enter 5 Numbers: ");
		
		// This loop repeats 5 times (i = 1, 2, 3, 4, 5)
		for(int i = 0; i < myArray.length; i++){
			System.out.print("Enter Number " + (i + 1) + ": ");
			myArray[i] = input.nextInt(); // to input user data values
		}
		//Displaying the contents in myArray
		System.out.println();
		System.out.println("myArray Contents: ");
		for(int i = 0; i < myArray.length; i++){
			System.out.print(myArray[i] + " ");
		}
		
		System.out.println();
	
		for(int i = 0; i < myArray.length; i++){
			if(myArray[i] % 2 == 0){ // to check if divided by 2 and it leaves 0 as the remainder, then its an even number.
				evenArray[evenNum] = myArray[i]; //to store even numbers in the 'evenArray'
				evenNum++;
			}
		}
		
		//Displaying the contents in evenArray
		System.out.println();
		System.out.println("evenArray Contents: ");
		for(int i = 0; i < evenArray.length; i++){
			System.out.print(evenArray[i] + " ");
		}
		System.out.println();
	}
}
