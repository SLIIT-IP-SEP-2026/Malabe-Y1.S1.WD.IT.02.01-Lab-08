import java.util.Scanner;
public class IT26102740Lab8Q4{
    public static void main( String []args){
        Scanner input = new Scanner(System.in);

        int StudentID[]= new int[8];
        int ID, i, SID;

        for (i = 0 ; i < 8 ; i++){

            do{
                System.out.println("Enter Student ID for student"+(i + 1 )+" :");
                ID =input.nextInt();
                StudentID[i] = ID;

                if( ID <= 0){
                System.out.print("Eror: Please Enter ONLY positive Numbers");
                }
            }
           
            while( ID <= 0);
            StudentID[i] = ID;
        }
        System.out.print("Enter a student ID to Search:");
        SID = input.nextInt();

        boolean Found = false;
        for ( i= 0; i < 8; i++){
            if( StudentID[i] == SID){
                Found = true;
            }
        }
        if( Found == true){
                System.out.println("Student is Available");
        }
        else{
                System.out.println("Student not avaibale");
         }
    }

}