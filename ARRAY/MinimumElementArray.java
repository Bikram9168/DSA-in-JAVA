import java.util.Scanner;

public class MinimumElementArray {
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
        int min = arr[0];
        for(int i =0;i<len;i++)
        {
            if (arr[i]<min) 
            {
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}
