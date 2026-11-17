import java.util.Scanner;
public class IT26102474Lab8Q3{
  public static void main ( String [] args){
    Scanner value = new Scanner(System.in);
	int numArray[] = new int[6];
	int c = 1;
	
	for( int i=0 ; i<numArray.length ; ){
	  System.out.print("Enter a positive number ("+c+"/6):"+" ");
	  int number = value.nextInt();   
	  
	    if(number>0){
		   numArray[i] = number ;
		   i++;
		   c++;
		}
		else {
		   System.out.println("Error: Please Enter ONLY Positive Numbers");
		   
		}
    }  
	System.out.println(" ");
    System.out.println("Array Contents:");
  
   for (int i=0 ; i<numArray.length ; i++ ){
    System.out.print(numArray[i]+" ");
	
   }
  
   int max = numArray[0];
   for (int i=0 ; i<numArray.length ; i++ ){
  
      max = (numArray[i] > max) ? numArray[i] : max;
   }
   
	System.out.println("\n");
    System.out.println("The Maximum Number Entered: "+max);
	
   
  }
}
