import java.util.*;

public class Q7SequentialSearch
{
public static int LSearch(int numbers[],int key)
{
    for(int i=0;i<numbers.length;i++)
    {
        if(numbers[i]==key)
        {
            return i;
        }
    }
    return -1;
}
    public static void main(String args[])
    {
        int numbers[]={10,20,30,40,50,60,70,80,90,100};
        int key=20;
        int index=LSearch(numbers,key);
        if(index==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Elemnt found at position :"+index);
        }
    }
}