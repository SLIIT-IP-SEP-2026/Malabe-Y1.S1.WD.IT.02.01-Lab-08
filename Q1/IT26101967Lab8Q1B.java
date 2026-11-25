import java.util.Scanner;
public class IT26101967Lab8Q1B{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i,j=0;
		int[] numbers=new int[5];
		System.out.println("Enter five numbers");
		for(i=0;i<numbers.length;i++){
			System.out.println("Enter a number"+" "+ (i+1)+":");
			numbers [i]=input.nextInt();
			
			
			
			
		}
		System.out.println("my array contents:");
		for(i=0;i<numbers.length;i++){
			System.out.println(numbers[i]+" ");
			
			
			
		}
		int evennumbers []=new int[5];
		
		for(i=0;i<numbers.length;i++){
		if(numbers[i]%2==0){
			evennumbers[j]=numbers[i];
			j++;
		}
		}
		System.out.println("even array contents:");
		for(i=0;i<j;i++)
		{
			
			System.out.print(evennumbers[i]+" ");
		}
}



}
		