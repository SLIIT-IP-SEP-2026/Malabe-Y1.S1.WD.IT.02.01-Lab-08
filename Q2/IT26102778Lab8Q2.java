public class IT26102778Lab8Q2{
	public static void main(String[]args){
	
	int arrayA[]= {10, 20, 30, 40, 50};
	int arrayB[]= {34, 67, 12, 89, 12};
	int arrayC[]= new int[5];
	int i;
	
	System.out.println();
	System.out.println("A array contents:");
	for(i = 0; i < arrayA.length; i++){
		System.out.print(arrayA[i]+ " ");
	}
		
	System.out.println();
	System.out.println();
	System.out.println("B array contents:");
	for(i = 0; i < arrayB.length; i++){
		System.out.print(arrayB[i]+ " ");
	}
	
	System.out.println();
	System.out.println();
	System.out.println("C array contents (A+B):");
	for(i=0; i < arrayC.length; i++){
		arrayC[i]= arrayA[i]+arrayB[i];
	    System.out.print(arrayC[i] + " ");
		}
	}
}
	
	    