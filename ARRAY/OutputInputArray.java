
import java.util.Scanner;

public class OutputInputArray {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4,5,6,7};
        int len1 = arr1.length; // Index 0 to len-1
        for(int i=0;i<len1;i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        int[] arr2 = new int[7];
        Scanner sc = new Scanner(System.in);
        int len2 = arr2.length; // Index 0 to len-1

        /*for(int i=0;i<len2;i++)
        {
            // Default values
            System.out.print(arr2[i]+" ");
        }*/
        
        //Input the array element
        
        for(int i=0;i<len2;i++)
        {
            System.out.print("Enter elements at index "+ i +" : ");
            int ele = sc.nextInt();
            arr2[i] = ele;
        }
        for(int i=0;i<len2;i++)
        {
            System.out.print(arr2[i]+" ");
        }
    }
}
