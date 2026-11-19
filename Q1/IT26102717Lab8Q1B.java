import java.util.Scanner;
public class IT26102717Lab8Q1B{
	public static void main (String[]args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 5 Numbers :");
		int i ;
		
		int[] num = new int[7];
		for(i = 1 ; i<=5 ; i++){
			System.out.print("Enter number "+ i +" : ");
			num[i] = input.nextInt();
			
		}
		System.out.println();
		System.out.println("myArray Constants : ");
		for(i = 1 ; i<=5 ; i++){
		   System.out.print(num[i] + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("evenArray Constents : ");
		for(i = 1 ; i<=5 ; i++){
		   if( num[i] % 2 == 0){
			   System.out.print(num[i] + " ");
		   }
		}   
		
	}
}