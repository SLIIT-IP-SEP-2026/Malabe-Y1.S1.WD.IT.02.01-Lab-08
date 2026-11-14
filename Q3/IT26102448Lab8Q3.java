
import java.util.Scanner;

public class IT26102448Lab8Q3
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int Array[] = new int[6];
        int num;

        for(int i = 0; i < 6; i++)
        {
            System.out.print("Enter a Positive Number " + (i + 1) + "/6:" );
            num = input.nextInt();

            if(num <= 0)
            {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                i--;
            }
            else
            {
                Array[i] = num;
            }
        }

        int maximum = Array[0];

        System.out.println("\nArray Contents:");

        for(int i = 0; i < 6; i++)
        {
            System.out.print(Array[i] + " ");

            if(Array[i] > maximum)
            {
                maximum = Array[i];
            }
        }

        System.out.println("\nMaximum Number: " + maximum);

        
    }
}