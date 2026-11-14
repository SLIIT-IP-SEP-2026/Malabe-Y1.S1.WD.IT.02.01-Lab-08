
import java.util.Scanner;

public class IT26102448Lab8Q4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int studentsArray[] = new int[8];

        for(int i = 0; i < 8; i++)
        {
            System.out.println("Enter Student ID for Student " + (i+1) + ":");

            int Students = sc.nextInt();

            if(Students <= 0)
            {
                System.out.println("Error: Please Enter ONLY Positive Numbers");
                return;
            }

            studentsArray[i] = Students;
        }

        System.out.print("\nEnter a Student ID to Search: ");

        int Search = sc.nextInt();

        if(Search == studentsArray[0])
        {
            System.out.println("Student is Available");
        }
        else if(Search == studentsArray[1])
        {
            System.out.println("Student is Available");
        }
        else if(Search == studentsArray[2])
        {
            System.out.println("Student is Available");
        }
        else if(Search == studentsArray[3])
        {
            System.out.println("Student is Available");
        }
        else if(Search == studentsArray[4])
        {
            System.out.println("Student is Available");
        }
        else if(Search == studentsArray[5])
        {
            System.out.println("Student is Available");
        }
        else if(Search == studentsArray[6])
        {
            System.out.println("Student is Available");
        }
        else if(Search == studentsArray[7])
        {
            System.out.println("Student is Available");
        }
        else
        {
            System.out.println("Student is Not Available");
        }

        
    }
}
