// Q1B

import java.util.Scanner;

public class IT26300584Lab8Q1B
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int myArray[] = new int [5];
		int evenArray[] = new int [5];
		int evenCount = 0;
		
		System.out.println("Enter 5 Numbers : ");
		
		for(int count = 0; count < myArray.length; count++)
		{
			System.out.print("Enter Number " + (count + 1) + ": ");
			myArray[count] = input.nextInt();
		}
		
		for(int count = 0; count < myArray.length ; count++)
		{
			if(myArray[count] % 2 == 0)
			{
				evenArray[evenCount] = myArray[count];
				evenCount++;
			}
				
		}
		
		System.out.println("Array in Reverse Order: ");
		
		for(int count = 4; count >= 0; count--)
		{
			System.out.print(myArray[count] + " ");
		}
		
		System.out.println();
		
		System.out.println("evenArray Contents: ");
		
		for(evenCount = 0; evenCount < myArray.length; evenCount++)
		{
			System.out.print(evenArray[evenCount] + " ");
		}
		
	}
}