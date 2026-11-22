import java.util.Scanner;
public class Lab8Q1 {
	public static void main (String[]args) {
		Scanner input = new Scanner (System.in) ;
		
		int myArray [] = new int [5];
		
		for (int i =0; i< myArray.length ; i++){
			System.out.println(" enter the number" + (i+1) + ":");
			myArray[i] = input.nextInt();
		}
		System.out.println("Array in reverse order:");
		for (int i = myArray.length-1 ; i>= 0; i--) {
			System.out.print(myArray[i] + " " );
		}
	}
}
