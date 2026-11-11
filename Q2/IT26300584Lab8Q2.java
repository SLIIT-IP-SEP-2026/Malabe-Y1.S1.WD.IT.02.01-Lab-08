// Q2

public class IT26300584Lab8Q2
{
	public static void main(String[]args)
	{
		int A[] = {10, 20, 30, 40, 50};
		int B[] = {34, 67, 12, 89, 12};
		int C[] = new int [5];
		
		System.out.println("A Array Contents : ");
		
		for(int count = 0; count < A.length; count++)
		{
			System.out.print(A[count] + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("B Array Contents : ");
		
		for(int count = 0; count < B.length; count++)
		{
			System.out.print(B[count] + " ");
		}
		
		System.out.println("\n");
		
		System.out.println("C Array Contents (A + B) : ");
		
		for(int count = 0; count < C.length; count++)
		{
			C[count] = A[count] + B[count];
			System.out.print(C[count] + " ");
		}
	}
}