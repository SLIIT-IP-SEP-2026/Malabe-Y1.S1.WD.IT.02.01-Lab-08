import java.util.Scanner;
public class IT26102467Lab8Q1B{
	public static void main(String[] args){
		int[] myarray = new int[5];
		int[] evenarray = new int[5];
		Scanner input = new Scanner(System.in);
		
		for(int i=0 ; i<5 ; i++){
			
			System.out.println("Enter Number " + i + ":");
			myarray[i] = input.nextInt();
			
		}
		
		System.out.println("Array Content:");
		
		
	  	for(int j=0 ; j<5 ; j++){
		
		System.out.print(myarray[j] + " ");
		
	    }
		
		int l = 0;
		for (int k = 0 ; k < 5 ; k++){
			if (myarray[k]%2 == 0){
				evenarray[l] = myarray[k];
				l++;
		 
			}
		}
		
		System.out.println("");
		System.out.println("evenarray content :");
		for (int m = 0 ; m < 5 ; m++){
			System.out.print(evenarray[m] + " ");
		}
	}
}