
import java.util.Scanner;


public class BubbleSort 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0;i<n;i++)
        {
            arr[i]=input.nextInt();
        }
        System.out.print("Array elements are: ");
        Print(arr);
        System.out.println();
        System.out.print("Sorted Array: ");
        Bubble(arr);
        Print(arr);

    }

    public static void Print(int[] arr)
    {
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }

    public static void Bubble(int[] arr)
    {
        int len = arr.length;
        for(int i=1;i<=len-1;i++)
        {
            for(int j=0;j<len-1;j++)
            {
                if (arr[j]>arr[j+1]) 
                {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
