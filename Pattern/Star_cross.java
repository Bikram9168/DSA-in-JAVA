
import java.util.Scanner;

public class Star_cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number: ");
        int num = sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<=num;j++)
            {
                if(j==i||j==num-1-i)
                {
                    System.out.print("* ");
                }
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
