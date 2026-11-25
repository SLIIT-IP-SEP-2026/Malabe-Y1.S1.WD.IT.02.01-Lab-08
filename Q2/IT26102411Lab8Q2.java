public class IT26102411Lab8Q2{
	public static void main (String[] args){
		int [] A = {10,20,30,40,50};
		int [] B = {34,67,12,89,12};
		int [] C = new int[5];
		int ans ,num1 , num2  = 0 ;
		
		for (int i = 0 ; i < 5 ; i++){
			
			num1 = A[i];
			num2 = B[i];
            ans = num1 + num2;
            C[i] = ans;			
		}
		
		System.out.println("Array A Contetn :");
		for (int j = 0 ; j < 5 ; j++){
			System.out.print(A[j] + " ");
		}
		
		System.out.println(" ");
		System.out.println("Array B Contetn :");
		for (int j = 0 ; j < 5 ; j++){
			System.out.print(B[j] + " ");
		}
		System.out.println(" ");
		System.out.println("Array C Contetn (A+B) :");
		for (int j = 0 ; j < 5 ; j++){
			System.out.print(C[j] + " ");
		}
		
		
	}
}