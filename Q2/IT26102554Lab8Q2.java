import java.util.Scanner;

public class IT26102554Lab8Q2{
 public static void main (String [] args){
 
 int [] A  = {10, 20, 30, 40, 50};
 int [] B  = {34, 67, 12, 89, 12};
 int [] C  = new int [5];
 
  Scanner input = new Scanner(System.in);
  
  for (int count = 0; count < C.length; count++) {
            C[count] = A[count] + B[count];
        }

        System.out.println("Array A Contents:");
        for (int count = 0; count < A.length; count++) {
            System.out.print(A[count] + " ");
        }

        System.out.println("Array B Contents:");
        for (int count = 0; count < B.length; count++) {
            System.out.print(B[count] + " ");
        }

        System.out.println("Array C Contents: (A + B):");
        for (int count = 0; count < C.length; count++) {
            System.out.print(C[count] + " ");
        }
        System.out.println();
    }
}