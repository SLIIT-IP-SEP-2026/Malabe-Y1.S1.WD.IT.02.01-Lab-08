// Q3

import java.util.Scanner;

public class IT26300584Lab8Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		
		int Numbers[] = new int[6];
		int maxNumber;
		
		int count = 0;
		int userInput;
		
		while(count < 6)
		{
			System.out.print("Enter a Positive Number (" + (count + 1) + "/6): ");
			userInput = input.nextInt();
			
			if(userInput <= 0)
			{
				System.out.println("Error : Please Enter ONLY Positive Numbers");
			}
			else
			{
				Numbers[count] = userInput;
				count++;
			}
		}			
				
		System.out.println("\nArray Contents : ");
		
		for(count = 0; count < Numbers.length; count++)
		{
			System.out.print(Numbers[count] + " ");
		}
	
		maxNumber = Numbers[0];
		
		for(count = 0; count < Numbers.length ; count++)
		{
			if(Numbers[count] > maxNumber)
			{
				maxNumber = Numbers[count];
			}
		}
	
		System.out.print("\nThe Maximum Number Entered: " + maxNumber);
	}
}	