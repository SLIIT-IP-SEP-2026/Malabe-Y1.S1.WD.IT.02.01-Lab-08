import java.util.Scanner;
public class Lab8Q4{
 public static void main(String[] args){
	 Scanner input = new Scanner(System.in); 
	 
	 int studentsArray[] = new int[8];
	 int i = 0; 
	 int value = 0;
	 int search_value = 0;
	 
	 while(i<studentsArray.length){
		 System.out.print("Enter student ID for student " + (i+1) + " : ");
		 value = input.nextInt();
		 if(value > 0){
			 studentsArray[i] = value;
			  i += 1;
		 }else{
			 System.out.println("Please enter ONLY Positive numbers");
			 continue; 
		 } 
	 }
	 
	 System.out.print("Enter a student ID to search : ");
	 search_value = input.nextInt();
	 
	 String availability = "Student is not available";  
	 for(i=0; i<studentsArray.length; i++){
	 if(search_value == studentsArray[i]){
		 availability = ("Student is available");
		 return;
	 }}
	 System.out.println(availability);
	 
 }

}
	 