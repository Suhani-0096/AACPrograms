import java.util.*;

public class Q13MatrixOperations
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();

        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int a[][] = new int[r][c];
        int b[][] = new int[r][c];
        int sum[][] = new int[r][c];

        // First matrix
        System.out.println("Enter first matrix:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        // Second matrix
        System.out.println("Enter second matrix:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }

        // Matrix Addition
        System.out.println("Matrix Addition:");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                sum[i][j] = a[i][j] + b[i][j];
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose of first matrix
        System.out.println("Transpose of First Matrix:");
        for(int j = 0; j < c; j++)
        {
            for(int i = 0; i < r; i++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}