
 public class IT26100946Lab7Q2{
	public static void main(String[] args){
		int[]A={10,20,30,40,50};
		int[]B={34,67,12,89,12};
		int[]C=new int[5];
		int i=0;
		System.out.println("\nA Array content :");
		for( i=0;i<A.length;i++){
			System.out.print(A[i]+" ");
		}
		System.out.println("\n\nB Array content :");
		for(i=0;i<B.length;i++){
			System.out.print(B[i]+" ");
		}
		for ( i = 0; i < C.length; i++) {
		C[i] = A[i] + B[i];
		}
		System.out.println("\n\nC Array content :");
		for(i=0;i<B.length;i++){
			System.out.print(C[i]+" ");
		}
	}
	
}