public class IT26101727Lab8Q2 {

    public static void main(String[] args) {

        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        addArrays(A, B, C);
        displayArray(C);
    }

    
    public static void addArrays(int[] A, int[] B, int[] C) {

        for (int i = 0; i < A.length; i++) {

            C[i] = A[i] + B[i];
        }
    }

    
    public static void displayArray(int[] C) {

        System.out.println("Array C (A + B):");

        for (int i = 0; i < C.length; i++) {

            System.out.println(C[i]);
        }
    }
}
