import java.util.Scanner;
public class IT26101506Lab8Q4{
  public static void main ( String [] args){
    Scanner value = new Scanner(System.in);
	int studentArray[] = new int[8];
	int c = 1;
	
	for( int i=0 ; i<studentArray.length ; ){
		
	  System.out.print("Enter Student ID for Student "+c+": ");
	  int number = value.nextInt();   
	  
	    if(number>0){
			
		   studentArray[i] = number ;
		   i++;
		   c++;
		}
		else {
		   System.out.println("Error: Please Enter ONLY Positive Numbers");
		   
		}
	}	
	System.out.println(" ");
    System.out.print("Enter Student ID to Search: ");
	int id = value.nextInt();
	boolean found = false ;
	    for( int i=0 ; i<studentArray.length ;i++ ){
			
	        if(studentArray[i]==id){
				
            	System.out.println(" ");			
                System.out.print("Student is Available");
				found = true;
				break;
            }    
        }    
            if(!found){
				
            System.out.println(" ");							
 			System.out.print("Student is Not Available");

            }			
        	
   
  }
}
