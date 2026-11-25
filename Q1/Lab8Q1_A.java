import java.util.Scanner;
public class Lab8Q1_A{
 public static void main(String[] args){
	 Scanner input = new Scanner(System.in);
	 
	 //Create an array 
	 int myArray[] = new int[5]; 
	 
	 System.out.println("Enter 5 numbers :");
	 
	 // initializing the variables
     int i;
	 String reverse_order = " ";

	 //Getting the inputs from the keyboard 
	 for(i=0; i < myArray.length; i ++){
		 System.out.print("Enter number " + (i + 1) + " : ");
		 myArray[i] = input.nextInt();
	 }
	 
	 //Displaying the array in the reverse order 
	 System.out.println("Array in Reverse order : ");
	 for(i=4; i >= 0; i --){
		 reverse_order = reverse_order + myArray[i] + " ";
	 }
	 
	 System.out.print(reverse_order);
 }
}
		 
	 
	 
	 