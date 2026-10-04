import java.util.*;

public class Q11NonDecreasing
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        if(b > c)
        {
            int temp = b;
            b = c;
            c = temp;
        }

        if(a > b)
        {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}