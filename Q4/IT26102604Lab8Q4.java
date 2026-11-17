import java.util.Scanner;

public class IT26102604Lab8Q4{
public static void main (String [] args){

   int StuNumberCount = 0;
   int[] StudentArray = new int[8];
   int userInput;
   Scanner input = new Scanner(System.in);

 while(StuNumberCount < 8) {
	System.out.println("Enter a Student ID" + (StuNumberCount + 1) + "/8");
	userInput = input.nextInt();

	if(userInput >0){
		StudentArray [StuNumberCount] = userInput;
		StuNumberCount++;
	}
	else{
		System.out.println("Error: Enter Positive Student Number");
	}
 }
 System.out.println("Enter Student Number to Search");
 int searchID = input.nextInt();

 int found = 0;
 for (int count=0;  count < StudentArray.length; count++){
	 if (StudentArray[count] == searchID){
		 found = 1;
	 }
 }
 if (found == 1){
	 System.out.println("Student is Avilable");
 }
 else{
	 System.out.println("Stdent is Not Avilable");
  }
 }
}