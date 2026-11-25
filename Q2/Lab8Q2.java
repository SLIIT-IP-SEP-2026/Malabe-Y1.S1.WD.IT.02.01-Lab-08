import java.util.Scanner;
public class Lab8Q2{
 public static void main(String[] args){
	 Scanner input = new Scanner(System.in); 
	 
	 // Creating arrays 
	 int A[] = {10, 20, 30, 40, 50};
	 int B[] = {34, 67, 12, 89, 12};
	 int C[] = new int[5];
	 
	 int i;
	 
	 // Adding A and B 
	 for(i=0; i<5; i++){
		 C[i] = A[i] + B[i];
	 }
	 
	 // Displaying the array A
	 System.out.println("A array content :");
	 for(i=0; i<A.length; i++){
		 System.out.print(A[i] + " ");
	 }
	 System.out.println();
	 
	 // Displaying the array B 
	 System.out.println("B array content :");
	 for(i=0; i<B.length; i++){
		 System.out.print(B[i] + " ");
	 }
	 System.out.println();
	 
	 // Displaying the array C (A + B) 
	 System.out.println("C array content :");
	 for(i=0; i<C.length; i++){
		 System.out.print(C[i] + " ");
	 }
	  System.out.println();
 }
}
	 
