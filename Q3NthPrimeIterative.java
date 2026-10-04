import java.util.*;

public class Q3NthPrimeIterative
{
    public static int nthPrime(int n)
    {
        int count = 0;
        int num = 1;

        while(count < n)
        {
            num++;

            boolean isPrime = true;

            for(int i = 2; i < num; i++)
            {
                if(num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }

            if(isPrime)
            {
                count++;
            }
        }

        return num;
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = sc.nextInt();

        System.out.println("Nth prime number is: " + nthPrime(n));
    }
}