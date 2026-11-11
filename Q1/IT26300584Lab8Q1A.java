// Q1A

import java.util.Scanner;

public class IT26300584Lab8Q1A
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int myArray[] = new int [5];
		
		System.out.println("Enter 5 Numbers : ");
		
		for(int i = 0; i < myArray.length; i++)
		{
			System.out.print("Enter Number " + (i + 1) + ": ");
			myArray[i] = input.nextInt();
		}
		
		System.out.println("Array in Reverse Order: ");
		System.out.print(myArray[0] + " "+ myArray[1] + " "+ myArray[2] + " "+ myArray[3] + " "+ myArray[4]);
	}
}
		
		