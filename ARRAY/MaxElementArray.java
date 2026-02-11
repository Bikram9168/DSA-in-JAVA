import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
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
        int max = arr[0];
        for(int i =0;i<len;i++)
        {
            if (arr[i]>max) 
            {
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
