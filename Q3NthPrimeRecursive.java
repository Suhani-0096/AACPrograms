import java.util.*;

public class Q3NthPrimeRecursive
{
    public static boolean isPrime(int num, int i)
    {
        if(num < 2)
        {
            return false;
        }

        if(i * i > num)
        {
            return true;
        }

        if(num % i == 0)
        {
            return false;
        }

        return isPrime(num, i + 1);
    }

    public static int nthPrime(int num, int count, int n)
    {
        if(count == n)
        {
            return num - 1;
        }

        if(isPrime(num, 2))
        {
            count++;
        }

        return nthPrime(num + 1, count, n);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Nth prime number is: " + nthPrime(2, 0, n));
    }
}