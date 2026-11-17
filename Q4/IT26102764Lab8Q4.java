import java.util.Scanner;

public class IT26102764Lab8Q4 {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int[] studentsArray = new int[8];
	int count = 0;
	
	
    while(count<8){
		System.out.print("Enter Student ID for Student : "+(count+1)+":");
        int id = input.nextInt();
			
	    if(id<=0){
		  System.out.println("Erro: please Enter ONLY Postive Numbers");
		}else{
			studentsArray[count] = id;
			count++;
		}
	}
	
	System.out.print("\nEnter a Student ID to Search: ");
        int searchId = input.nextInt();
	int index = -1;
        for (int i =0;i<studentsArray.length;i++) {
            if (studentsArray[i] == searchId) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("\nStudent Is Available");
        } else {
            System.out.println("\nStudent Is Not Available");
        }

 }
}