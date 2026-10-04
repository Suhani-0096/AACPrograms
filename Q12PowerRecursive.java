public class Q12PowerRecursive
{
    public static int Pow(int X,int n)
    {
        if(n==0)
        {
            return 1;
        }

        /*nt xnm1=Pow(X,n-1);
        int xn=X*xnm1;
        return xn;*/
        return X*Pow(X,n-1);
    }

    public static void main(String args[])

    {
        int n=6;
        System.out.println(Pow(2,10));
    }
}