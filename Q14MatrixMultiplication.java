import java.util.*;

public class Q14MatrixMultiplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];
        int b[][] = new int[n][n];
        int c[][] = new int[n][n];

        System.out.println("Enter first matrix:");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for(int i=0; i<n; i++)
            for(int j=0; j<n; j++)
                b[i][j] = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                for(int k=0; k<n; k++)
                    c[i][j] += a[i][k] * b[k][j];
            }
        }

        System.out.println("Result:");

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
                System.out.print(c[i][j] + " ");

            System.out.println();
        }
    }
}