import java.util.Scanner;
public class IT26100946Lab7Q3{
	public static void main(String[] args){
	Scanner sc= new Scanner (System.in);
	int []numbers = new int[6];
	int count=0;
	while(count<6){
		System.out.print("Enter a positive number ("+(count+1)+"/6)");
		int num = sc.nextInt();
		if(num>0){
			numbers[count]=num;
			count+=1;
			
		}
		else{
			System.out.println("Error: Please Enter ONLY Positive Numbers");
		}
	}
		int max =numbers[0];
		System.out.println("Array cantent :");
		for(int i=0;i<6;i++){
			System.out.print(numbers[i]+" ");
			if(numbers[i]>max){
				max=numbers[i];
				
			}
			else{
				max=numbers[i];
			}
			
		
		}
		System.out.println("\n\nThe max number is :"+max);
	}
	
	
}