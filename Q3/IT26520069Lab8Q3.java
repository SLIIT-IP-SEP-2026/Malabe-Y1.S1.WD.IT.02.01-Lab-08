 import java.util.Scanner;

public class IT26520069Lab8Q3
{
	public static void main(String [] args)
	{
		int numbers[] = new int[6];
		Scanner input= new Scanner(System.in);
		
		for (int i=0 ; i<6 ; i++)
		{
			System.out.println("Enter num (" + (i+1) +"/6) : ");
			int num = input.nextInt();
			
			while(num<=0)
			{
				System.out.println("Error: Please enter ONLY positive numbers");
				System.out.println("Enter num (" + (i+1) +"/6) : ");
				num = input.nextInt();
			}
			
			numbers[i] = num;
		}
		
		int larg= numbers[0];
		
		for (int i=0 ; i<5 ; i++)
		{
			if (numbers[i+1] > larg)
			{
				larg = numbers[i+1];
			}
			
		}
		
		System.out.println();
		
		System.out.println("Array Contents:");
		
		for (int i=0 ; i<6 ; i++)
		{
			System.out.print(numbers[i]+ " ");
		}
		
		System.out.println();
		
		System.out.println("The largest number is " + larg);
	}
} 
    

