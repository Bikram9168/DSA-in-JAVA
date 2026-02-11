import java.util.Scanner;

public class PrintNegetiveElementOfArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        int len = arr.length;
        for(int i=0;i<len;i++)
        {
            System.out.print("Enter elements at index "+ i +" : ");
            int ele = sc.nextInt();
            arr[i] = ele;
        }
        for(int i=0;i<len;i++)
        {
            if(arr[i]<0)
                System.out.print((-1)*arr[i]+" ");
        }
    }
}
