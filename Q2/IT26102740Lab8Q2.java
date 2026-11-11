public class IT26102740Lab8Q2{
    public static void main(String[]args){

        int A[]={ 10,20,30,40,50};
        int B[]={ 34,67,12,89,12};
        int C[] = new int[5];

        for(int i = 0 ; i < 5; i++){
            int Sum = 0;
            Sum = A[i] + B[i];
            C[i] = Sum;
        }

        System.out.println("A array Contents:");
         for(int i = 0 ; i < 5; i++){
            System.out.print(A[i]+" ");
         }
        System.out.println("/n");

        System.out.println("B array Contents:");
         for(int i = 0 ; i < 5; i++){
            System.out.print(B[i]+" ");
         }
        System.out.println("/n");

        System.out.println("C array Contents:");
         for(int i = 0 ; i < 5; i++){
            System.out.print(C[i]+" ");
         }
        
    }
}