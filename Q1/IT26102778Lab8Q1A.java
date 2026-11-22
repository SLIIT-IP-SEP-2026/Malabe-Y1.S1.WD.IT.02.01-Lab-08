import java.util.Scanner;
public class IT26102778Lab8Q1A{
	public static void main(String[]args){
	
	int myarray[]= new int [5];
	int i;
	
	Scanner input=new Scanner(System.in);
	System.out.println("Enter 5 Numbers");
	
	for(i=0; i < myarray.length; i++){
	    System.out.print("Enter Number "+ (i+1) +":");
		myarray[i]=input.nextInt();
		}
		
	System.out.println("Array in reverse Order:");
	for(i = myarray.length - 1; i >= 0; i--){
		System.out.print(myarray[i]+ " ");
	}
	}
}
	
	    