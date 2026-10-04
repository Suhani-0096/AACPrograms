import java.util.*;

public class FibonacciUsingRecursive
{
    public static int Fibonacci(int n)
    {
        if(n == 0 || n==1)
        {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
     }

        

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms:");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
        {
            System.out.print(Fibonacci(i) + " ");
        }
    }
}