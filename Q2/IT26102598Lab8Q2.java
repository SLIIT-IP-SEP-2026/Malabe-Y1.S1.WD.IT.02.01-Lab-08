public class IT26102598Lab8Q2{
public static void main ( String [] args){
  int A[]={10,20,30,40,50};
  int B[]={34,67,12,89,12};
  int C[]=new int[5];
  int sum=0;
  
  for(int i=0 ; i<A.length ; i++){
    sum = A[i]+B[i];
    C[i] = sum;
  }
    System.out.println(" ");
    System.out.println("A Array Contents:");
  
   for (int i=0 ; i<A.length ; i++ ){
    System.out.print(A[i]+" ");
	
   }
     System.out.println("\n"); 
     System.out.println("B Array Contents:");
  
   for (int i=0 ; i<B.length ; i++ ){
    System.out.print(B[i]+" ");
	
   }
   
    System.out.println("\n");
    System.out.println("C Array Contents (A + B):");
  
   for (int i=0 ; i<C.length ; i++ ){
    System.out.print(C[i]+" ");
	
   }
 }
}
   
   