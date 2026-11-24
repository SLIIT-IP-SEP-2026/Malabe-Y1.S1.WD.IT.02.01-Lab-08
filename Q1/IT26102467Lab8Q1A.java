import java.util.Scanner;
public class IT26102467Lab8Q1A{
	public static void main(String[] args){
		int[] myarray = new int[5];
		int myint = 0 ;
		Scanner input = new Scanner(System.in);
		
		for(int i=0 ; i<5 ; i++){
			
			System.out.println("Enter Number " + i + ":");
			myarray[i] = input.nextInt();
			
		}
		
		System.out.println("Array in Reverse Order :");
		
		
	  	for(int j=4 ; j>=0 ; j--){
		
		System.out.print(myarray[j] + " ");
		
	    }
	}
}