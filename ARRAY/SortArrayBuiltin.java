import java.util.Arrays;
import java.util.Scanner;

public class SortArrayBuiltin {
    public static void main(String[] args) {
        // Sort => Ascending order
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

        print(arr);
        System.out.println();
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
