import java.util.*;

public class SelectionSort
{

    public static void Sort(int arr[],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            int minIndex=i;
            for(int j=1;j<n;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println("Elemts after sorting :");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    } 
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of an array :");
        int n=sc.nextInt();

        int arr[]=new int[3];

        System.out.println("Enter the elements in array :");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("Elemets in the array :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        Sort(arr,n);
    }
}