// Q4

import java.util.Scanner;

public class IT26300584Lab8Q4
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		int studentsArray[] = new int[8];
		int student = 0;
		int userInput;
		
		while(student < 8)
		{
			System.out.print("Enter Student ID for Student " + (student + 1) + " : ");
			userInput = sc.nextInt();
			
			if(userInput <= 0)
			{
				System.out.println("Error : Please Enter ONLY Positive Numbers");
			}
			else
			{
				studentsArray[student] = userInput;
				student++;
			}
		}
		
		System.out.print("\nEnter Student to Search: ");
		int stuID = sc.nextInt();
		
		int found = 0;
		
		for(student = 0; student < studentsArray.length; student++)
		{
			if(studentsArray[student] == stuID)
			{
				found = 1;
				break;
			}
		}
			
			if(found == 1)
			{
				System.out.println("\nStudent is Available");
			}
			else
			{
				System.out.println("\nStudent is Not Available");
			}
				
		
	}
}
		