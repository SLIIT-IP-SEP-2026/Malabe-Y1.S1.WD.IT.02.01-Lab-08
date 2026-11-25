import java.util.Scanner;
public class IT26101967Lab8Q1{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i;
		int[] numbers=new int[5];
		System.out.println("Enter five numbers");
		for(i=0;i<numbers.length;i++){
			System.out.println("Enter a number"+" "+ (i+1)+":");
			numbers [i]=input.nextInt();
			
			
			
			
		}
		System.out.println("numbers in reverse order");
		for(i=4;i>=0;i--){
			System.out.print(numbers[i]+ "  ");
			
			
		}
		
		
		
		
		
	}
	
	
	
	
	
}