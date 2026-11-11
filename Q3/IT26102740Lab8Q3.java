import java.util.Scanner;
public class IT26102740Lab8Q3{
    public static void main( String []args){
        Scanner input = new Scanner(System.in);

        int Numbers[]= new int[6];
        int num , maxNum, i;

        for (i = 0 ; i < 6 ; i++){

            do{
                System.out.println("Enter a positive number "+(i + 1 )+"/6 : ");
                num =input.nextInt();
                Numbers[i] = num;

                if( num <= 0){
                System.out.print("Error: Please enter positive numbers.");
                }
            }
           
            while( num <= 0);
            Numbers[i]= num;
        }

        maxNum = Numbers[0];

        for ( i= 0; i < 6; i++){
            if( Numbers[i] > maxNum){
                maxNum = Numbers[i];
            }
        }
        System.out.println("Array Contents:");
         for ( i= 0; i < 6; i++){
            System.out.print(Numbers[i]+" ");
        }

        System.out.println("The Maximum Number Entered: "+ maxNum);
    }

}