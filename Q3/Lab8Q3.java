import java.util.Scanner;
public class Lab8Q3{
 public static void main(String[] args){
	 Scanner input = new Scanner(System.in); 
	 
	 // initializing the array and the variables 
	 int array[] = new int[6];
	 int num = 0;
	 int value = 0;
	 int i;
	 int largest = 0; 
	 
	 //storing positive values in the array 
	 while(num < 6){
		 System.out.print("Enter a positive number (" + (num+1) + "/6) : " ); 
		 value = input.nextInt();
		 if(value > 0){
			 array[num] = value; 
		 }else{
			 System.out.println("Error : Please enter ONLY Positive numbers");
			 continue; // skip the turn 
		 }
		 num += 1; 
	 }
	
	System.out.println("Array contents : ");
	for(i=0; i<6; i++){
	System.out.print(array[i] + " ");
	}
	System.out.println();
	
	// finding the maxmimum number entered 
	largest = array[0];
	for(i=1; i<6; i++){
		if (largest < array[i]){
			largest = array[i];
		}
	}
    System.out.println("The maxmimum number entered : " + largest);	
  }
}
		 