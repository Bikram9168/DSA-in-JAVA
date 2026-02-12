import java.util.Scanner;
/* In this code We actually update the array where index is odd multiply the element by 2 and if index is even the increment it by 10 */
public class UpdatingArray {
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
        print(arr);
        Upadte(arr);
        System.out.println();
        print(arr);
    }
    /*In this method we actually check the index and then updating the value using if - else statement */
    public static void Upadte(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                arr[i]+=10;
            }
            else
            {
                arr[i]*=2;
            }
        }
        
    }
    public static void print(int[] arr) 
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}


