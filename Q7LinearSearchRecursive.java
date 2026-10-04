public class Q7LinearSearchRecursive
{
    public static int search(int arr[], int key, int i)
    {
        if(i == arr.length)
            return -1;

        if(arr[i] == key)
            return i;

        return search(arr, key, i + 1);
    }

    public static void main(String args[])
    {
        int arr[] = {10, 20, 30, 40, 50};

        int key = 40;

        int result = search(arr, key, 0);

        System.out.println(result);
    }
}