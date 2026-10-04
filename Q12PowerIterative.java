public class Q12PowerIterative
{
    public static int Pow(int X, int n)
    {
        int result = 1;

        for(int i = 1; i <= n; i++)
        {
            result = result * X;
        }

        return result;
    }

    public static void main(String args[])
    {
        System.out.println(Pow(2, 10));
    }
}