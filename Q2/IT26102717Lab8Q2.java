public class IT26102717Lab8Q2{
	public static void main(String[]args){
		int A[] = {10,20,30,40,50};
		int B[] = {34,67,12,89,12};
		int C[] = new int[A.length];
		
		int i;
		for(i = 0 ; i < A.length; ++i){
			C[i] = A[i] + B[i];
		}
		for(i = 0 ; i < A.length; ++i){
			System.out.print(C[i] + " ");
		}			
	}
}