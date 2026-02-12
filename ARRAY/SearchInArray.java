import java.util.Scanner;

public class SearchInArray {
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
        Search(arr);

    }
    public static void Search(int[] arr)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your element which you want to search: ");
        int Key = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==Key)
            {
                System.out.println(Key+" Element is Present your Array");
                return;
            }
            else
            {
                System.out.println("Element is not present");
                break;
            }
        }
    }
}
