import java.util.Scanner;
public class IT26102688Lab8Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int studentArray[] = new int[8];

        int i = 0;
        while (i < studentArray.length){
            System.out.print("Enter Student ID for student " + (i + 1) + ": ");
            int id = input.nextInt();

            if (id <= 0){
                System.out.println("Error: Please Enter ONLY Positive Numbers");
            }
            else{
                studentArray[i] = id;
                i++;
            }
        }

        System.out.print("\nEnter a Student ID to Search: ");
        int searchId = input.nextInt();

        boolean found = false;
        for(int j = 0; j < studentArray.length; j++){
            if(studentArray[j] == searchId){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("\nStudent is Available");
        }
        else{
            System.out.println("\nStudent is not Available");
        }
    }    
}