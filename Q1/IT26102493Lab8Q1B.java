import java.util.Scanner;

 public class IT26102493Lab8Q1B{
  public static void main (String [] args){
  
  int numberount = 0;
  int [] myArray = new int [5];
  int[] evenArray = new int[5];
  int userinput;
  Scanner input = new Scanner(System.in);
  
  while (numberount <5 ) {
	  System.out.print("Enter number " + (numberount + 1) + " : ");
	  userinput = input.nextInt();
	  myArray[numberount] = userinput;
	  numberount++;
	  
	  }
	  
	   int index=0;
	   for (int count = 0; count<myArray.length; count++){
		  if (myArray[count]%2 == 0){
			  evenArray[index] = myArray[count];
			  index++;
			  
		  }
	   }
        System.out.print("myArray Contents:");
        for (int count = 0; count < myArray.length; count++) {
            System.out.print(myArray[count] + "  ");
        }

        System.out.print("\nevenArray Contents:");
        for (int count = 0; count < evenArray.length; count++) {
           System.out.print(evenArray[count] + " ");
        }
        System.out.println();
    }
}