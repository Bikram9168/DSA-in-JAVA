import java.util.Scanner;

public class SecondLargestElement 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int len = arr.length ;

        for(int i=0;i<len;i++)
        {
            System.out.print("Enter elements at index "+ i +" : ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }

        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            if(arr[i]>max) max=arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>smax && arr[i]!=max) smax=arr[i];
        }
        System.out.println("Largest element in this array : "+max);
        System.out.println("Second Largest element is : "+smax);
    }
}

