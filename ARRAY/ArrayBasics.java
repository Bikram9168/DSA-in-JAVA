

public class ArrayBasics 
{
    public static void main(String[] args) 
    {
        int[] arr = {3,4,5,6,7};
        // Indexing
        // Accessing the element
        System.out.println(arr[0]); // Output => 3
        // Updating elements
        System.out.println(arr[2]);
        arr[2]=8;
        System.out.println(arr[2]);

        int[] arr1 = new int[4]; //Size of array is 4 | Index is 0 to 3
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        arr1[3]=40;
    }
}

