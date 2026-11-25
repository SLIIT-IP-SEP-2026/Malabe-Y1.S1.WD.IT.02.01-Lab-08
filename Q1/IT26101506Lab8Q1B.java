import java.util.Scanner;
  public class IT26101506Lab8Q1B{
  public static void main( String [] args){
   Scanner value=new Scanner(System.in);
   int myArray[] = new int[5];
   int evenArray[] = new int [5];
   int c=1;
   int p =0;
  
   
    System.out.println("Enter 5 Numbers");
   
   for (int i=0 ; i<myArray.length ; i++ ){
    System.out.print("Enter Number"+" "+c+": ");
	c=c+1;
	myArray[i]=value.nextInt();
	}
	
    System.out.println(" ");
	System.out.println("myArray Contents:");
  
   for (int i=0 ; i<myArray.length ; i++ ){
    System.out.print(myArray[i]+" ");
	
   }
 
    System.out.println("\n");
	System.out.println("evenArray Contents:");
   
   for ( int i=0 ; i<myArray.length ;i++ ){
   
      if (myArray[i]%2==0){
        int num = myArray[i];
        evenArray[p] = num;
		p++;
        }
     
    }	  
   for (int i=0 ; i<evenArray.length ; i++ ){
    System.out.print(evenArray[i]+" ");
	}
   
  }
	
}
	
    
