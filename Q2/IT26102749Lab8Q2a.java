public class IT26101664Lab8Q2a {
    public static void main(String[] args) {
        // Initialize arrays A and B with given values, and declare array C
        int[] A = {10, 20, 30, 40, 50};
        int[] B = {34, 67, 12, 89, 12};
        int[] C = new int[5];

        // Calculate A + B and store in Array C
        for (int i = 0; i < 5; i++) {
            C[i] = A[i] + B[i];
        }

        // Display Array A Contents
        System.out.println("A Array Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }

        // Display Array B Contents
        System.out.println("\n\nB Array Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }

        // Display Array C Contents (A + B)
        System.out.println("\n\nC Array Contents (A + B):");
        for (int i = 0; i < 5; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();
    }
}