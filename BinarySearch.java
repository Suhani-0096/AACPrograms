import java.util.*;

public class BinarySearch {

    // Iterative Binary Search
    public static int IterativeSearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (numbers[mid] == key) {
                return mid;
            }

            if (numbers[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    // Recursive Binary Search
    public static int RecursiveSearch(int numbers[], int start, int end, int key) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;

        if (numbers[mid] == key) {
            return mid;
        }

        if (numbers[mid] < key) {
            return RecursiveSearch(numbers, mid + 1, end, key);
        } else {
            return RecursiveSearch(numbers, start, mid - 1, key);
        }
    }

    public static void main(String args[]) {
        int numbers[] = {10, 20, 40, 50, 60, 70, 80, 90, 100};
        int key = 90;

        System.out.println("Iterative Search: " +
            IterativeSearch(numbers, key));

        System.out.println("Recursive Search: " +
            RecursiveSearch(numbers, 0, numbers.length - 1, key));
    }
}