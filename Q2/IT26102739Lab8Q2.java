public class IT26102739Lab8Q2
{
	public static void main(String[]args)
	{	
		//Declare and Initialize the Arrays
		int A[] = {10, 20, 30, 40, 50}; 
		int B[] = {34, 67, 12, 89, 12};
		int C[] = new int [5]; //Array C is the sum (A + B)
		
		//To add the corresponding elements of A and B
		for(int i = 0; i < 5; i++){
			C[i] = A[i] + B[i];
		}
		
		System.out.println(" \n ");
		
		//To display Array A
		System.out.println("A Array Contents: ");
		
		for(int i = 0; i < 5; i++){
			System.out.print( A[i] + " ");
		}
		System.out.println(" \n ");
		
		//To display Array B
		System.out.println("B Array Contents: ");
		
		for(int i = 0; i < 5; i++){
			System.out.print( B[i] + " ");
		}
		System.out.println(" \n ");
		
		//To display Array C
		System.out.println("C Array Contents (A + B): ");
		
		for(int i = 0; i < 5; i++){
			System.out.print( C[i] + " ");
		}
		System.out.println(" \n ");
	}
}
	
			
		
		
		
		
		
		