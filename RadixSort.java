
import java.util.*;

public class RadixSort {

    public static int getMax(int arr[], int n) {
        int max = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void countSort(int arr[], int n, int exp) {

        int output[] = new int[n];
        int count[] = new int[10];

        // Count occurrences of each digit
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / exp) % 10;
            count[digit]++;
        }

        // Calculate cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Place elements in sorted order
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy sorted elements back
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

    public static void radixSort(int arr[], int n) {

        if (n == 0) {
            return;
        }

        int max = getMax(arr, n);

        // Sort by units, tens, hundreds, etc.
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countSort(arr, n, exp);
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

        int arr[] = new int[n];

        System.out.println("Enter non-negative elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] < 0) {
                System.out.println("Negative numbers are not supported.");
                sc.close();
                return;
            }
        }

        radixSort(arr, n);

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        sc.close();
    }
}
