import java.util.*;
public class FactorialUsingRecursion
{
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
     int fnm=fact(n-1);
     int fn=n*fact(n-1);
     return fn;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nEnter a number to calculate factorial");
        int n=sc.nextInt();
       System.out.println( fact(n));
    }
}