

import java.util.Scanner;
public class IT26101967Lab8Q3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i;
		int numbers[]=new int[6];
		int num;
		for(i=0;i<numbers.length;i++){
			 System.out.print("Enter a Positive Number (" + (i + 1) + "/6): ");
			 num=input.nextInt();
			 if(num>0){
				 numbers[i]=num;
				 
				 
			 }
			 else{
				 System.out.println("Error;invalid number");
				 i--;
			 }
			 
			 
			
			
		}
		System.out.println("The array contetnts;");
		for(i=0;i<numbers.length;i++){
			System.out.println(numbers[i]+" ");
		}
		int max=numbers[0];
		for(i=1;i<numbers.length;i++){
			
			if(numbers[i]>max){
				max=numbers[i];
			}
		}
		System.out.println("the maximum number entered"+" "+max);
		
		
		
		
		
	}
	
	
	
}