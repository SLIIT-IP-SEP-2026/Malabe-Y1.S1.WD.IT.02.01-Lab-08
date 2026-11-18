import java.util.Scanner;

public class IT26102763Lab8Q4
{
	public static void main(String [] args)
	{
		int studentsArray[] = new int [8];
		Scanner input= new Scanner(System.in);
		boolean found = false;
		
		for (int i=0 ; i<studentsArray.length ; i++)
		{
			System.out.print("Enter student ID for Student " + (i+1) +" : ");
			int num = input.nextInt();
			
			while(num<=0)
			{
				System.out.println("Error: Please enter ONLY positive numbers");
				System.out.print("Enter student ID for Student " + (i+1) +" : ");
				num = input.nextInt();
			}
			
			studentsArray[i] = num;
		}
		
		System.out.println();
		
		System.out.print("Enter a student ID to search : ");
		int numToBeSearched = input.nextInt();
		
		for (int i=0 ; i<studentsArray.length ; i++)
		{
			if (numToBeSearched == studentsArray[i])
			{
				found = true;
			}
		}
		
		System.out.println();
		
		if (found == true)
		{
			System.out.println("Student is Available");
		}
		else
		{
			System.out.println("Student is not Available");
		}
	}
}