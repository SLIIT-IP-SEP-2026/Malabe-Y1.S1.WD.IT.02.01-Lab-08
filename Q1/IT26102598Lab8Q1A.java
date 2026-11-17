import java.util.Scanner;
  public class IT26102598Lab8Q1A{
  public static void main( String [] args){
   Scanner value=new Scanner(System.in);
   int myArray[] = new int[5];
   int c=1;
   
    System.out.println("Enter 5 Numbers ");
   
   for (int i=0 ; i<myArray.length ; i++ ){
    System.out.print("Enter Number"+" "+c+": ");
	c++;
	myArray[i]=value.nextInt();
	}
	
    System.out.println(" ");
	System.out.println("Array in Reserve Order:");
  
   for (int i=4 ; i>=0 ; i-- ){
    System.out.print(myArray[i]+" ");
   }
  }
	
}
	
    
