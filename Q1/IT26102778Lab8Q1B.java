import java.util.Scanner;
public class IT26102778Lab8Q1B{
	public static void main(String[]args){
	
	int myarray[]= new int [5];
	int i;
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter 5 Numbers");
	
	for(i=0; i < myarray.length; i++){
	    System.out.print("Enter Number "+ (i+1) +":");
		myarray[i]=input.nextInt();
		}
		
	System.out.println("myArray contents:");
	for(i = 0; i < myarray.length; i++){
		System.out.print(myarray[i]+ " ");
	}
	
	System.out.println();
	System.out.println("evenArray contents:");
	 for (i = 0; i < myarray.length; i++) {

            if (myarray[i] % 2 == 0) {
                System.out.print(myarray[i]+ " ");
            }
            else {
                System.out.print(0+ " ");
            }
        }
	}
}
	
	    