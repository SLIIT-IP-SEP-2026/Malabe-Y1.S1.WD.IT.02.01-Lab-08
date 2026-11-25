import java.util.Scanner;
public class IT26520069lab8Q4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int i;
		int numbers[]=new int[8];
		int num;
		for(i=0;i<numbers.length;i++){
			 System.out.print("Enter a Positive Number"+ (i+1)+":");
			 num=input.nextInt();
			 if(num>0){
				 numbers[i]=num;
				 
				 
			 }
			 else{
				 System.out.println("Error;please enter only positive numbers");
				 i--;
			 }
		}
			 System.out.println("Enter a student id to search :");
			 int id=input.nextInt();
			 boolean found = false;
			 for(i=0;i<numbers.length;i++){
			 if(id==numbers[i]){
				 
				 found=true;
				 break;
			 
			 
			 }
			 
			 
			 }
			  if (found) {
            System.out.println("Student is Available");
        }
        else {
            System.out.println("Student is Not Available");
        }
			 
			 
		}
	}