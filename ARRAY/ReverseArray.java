import java.util.Scanner;

public class ReverseArray 
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

        System.out.print("Original Array is: ");
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
        System.out.print("Reversed Array is: ");
        Reverse(arr);
    }

    public static void Reverse(int[] arr)
    {
        int i=0,j=arr.length -1;
        while (i<j) 
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}
