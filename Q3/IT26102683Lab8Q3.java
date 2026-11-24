import java.util.Scanner;
public class IT26102683Lab8Q3{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[6];
		
		for (int i = 0; i<6; i++){
			System.out.print("Eneter a positive number" + (i+1) + "/6: ");
			int num = input.nextInt();
			
			if (num<=0){
				System.out.print("Error: Please Enter a Positive Number");
				i--;
				
				
				
			}
			else{
				numbers[i] = num;
			}
				
				
		}
		System.out.println("Array Contents:");
		for (int i =0; i<6; i++){
			System.out.print( numbers[i]+ " ");
		}
		int max_num = numbers[0];
		
		for(int i = 0; i<6; i++){
		    if(numbers[i]>max_num){
			   max_num = numbers[i];
		    }
		}
		System.out.println();
        System.out.println("The Maximum Number Entered: " + max_num);
			
		
		
	}
}
			
		