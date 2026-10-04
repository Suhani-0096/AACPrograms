import java.util.*;

public class FibonacciUsingIterative
{
    public static void Fibonacci(int n)
    {
        int a = 0;
        int b = 1;

        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        Fibonacci(n);
    }
}