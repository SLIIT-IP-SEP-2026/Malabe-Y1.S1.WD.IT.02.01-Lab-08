import java.util.Scanner;
public class IT26102690Lab8Q3{
	public static void main(String[] args){
		int[] myarr = new int[6];
		int numcheck = 0;
		int userIn = 0;
		Scanner input = new Scanner(System.in);
		
		
		while (numcheck < 6 ){
			
			System.out.println("Enter a Positive Number (" + (numcheck+1) + "/6) ");
			userIn = input.nextInt();
			if (userIn > 0 ){
				myarr[numcheck] = userIn;
				numcheck++;
			
			}
			
			else{
				System.out.println("Error : Enter + Num Only:");
			}	
		}
		
		System.out.println("Array Contetn :");
		
		for(int j = 0 ; j < 6 ; j++){
			System.out.print(myarr[j] + " ");
		}
		
		int max = myarr[0];
		for(int i = 1 ; i < 6 ; i++){
			if (myarr[i] > max){
				max = myarr[i];
			}
			
		}
		
		System.out.println(" ");
		System.out.println("Max Num is : "+ max);
	}
}