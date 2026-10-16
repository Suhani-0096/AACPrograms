
import java.util.*;

public class CountingSort {

    public static void countSort(int A[], int B[], int k) {

        int n = A.length;
        int C[] = new int[k + 1];

        // Step 1: Initialize C with zeros
        for (int i = 0; i <= k; i++) {
            C[i] = 0;
        }

        // Step 2: Count the occurrences of each element
        for (int i = 0; i < n; i++) {
            C[A[i]] = C[A[i]] + 1;
        }

        // Step 3: Calculate cumulative count
        for (int i = 1; i <= k; i++) {
            C[i] = C[i] + C[i - 1];
        }

        // Step 4: Place elements in sorted positions
        for (int i = n - 1; i >= 0; i--) {
            B[C[A[i]] - 1] = A[i];
            C[A[i]] = C[A[i]] - 1;
        }
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be positive.");
            sc.close();
            return;
        }

        int A[] = new int[n];
        int k = 0;

        System.out.println("Enter non-negative elements:");

        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();

            if (A[i] < 0) {
                System.out.println("Negative numbers are not supported.");
                sc.close();
                return;
            }

            if (A[i] > k) {
                k = A[i];
            }
        }

        int B[] = new int[n];

        countSort(A, B, k);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(B[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
