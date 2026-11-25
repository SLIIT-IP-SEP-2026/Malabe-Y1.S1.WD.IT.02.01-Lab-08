import java.util.Scanner;
public class Lab8Q1_B{
 public static void main(String[] args){
	 Scanner input = new Scanner(System.in);
	 
	 //Create an array 
	 int myArray[] = new int[5]; 
	 int evenArray[] = new int[5]; 
	 
	 System.out.println("Enter 5 numbers :");
	 
	 // initializing the variables
     int i;
	 String array_content = " ";
	 String even_Array = " ";

	 //Getting the inputs from the keyboard 
	 for(i=0; i < myArray.length; i ++){
		 System.out.print("Enter number " + (i + 1) + " : ");
		 myArray[i] = input.nextInt();
	 }
	 
	 System.out.println (); 
	 
	 // Displaying the content 
	 System.out.println("myArray contents :");
	 
	 for(i=0; i<myArray.length; i ++){
		 array_content = array_content + myArray[i] + " ";
	 }
	 
	 System.out.println(array_content);
	 
	 // Selecting even numbers 
	 for(i=0; i<myArray.length; i ++){
		 if (myArray[i]%2 == 0){
		  evenArray[i] = myArray[i];
         }
		 
	even_Array = even_Array + evenArray[i] + " ";
	 }
		 
	// displaying evenArray content 
	System.out.println("evenArray content : ");
	System.out.println(even_Array);
		 
		 
 }
}