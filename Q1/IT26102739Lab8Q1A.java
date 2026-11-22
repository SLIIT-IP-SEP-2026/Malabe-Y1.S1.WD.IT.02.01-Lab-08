import java.util.Scanner;

public class IT26102739Lab8Q1A
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		int myArray[] = new int[5]; // 1D Array
		System.out.println("Enter 5 Numbers: ");
		
		// This loop repeats 5 times (i = 1, 2, 3, 4, 5)
		for(int i = 0; i < myArray.length; i++){
			System.out.print("Enter Number " + (i + 1) + ": ");
			myArray[i] = input.nextInt(); // to input user data values
		}
		System.out.println();
		System.out.println("Array in Reverse Order: ");
		
		//This loop function in reverse
		for(int i = myArray.length - 1; i >= 0; i--){
			System.out.print(myArray[i] + " "); // It counts & prints backwards
		}
		System.out.println();
	}
}
			