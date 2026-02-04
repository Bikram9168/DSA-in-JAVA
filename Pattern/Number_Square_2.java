import java.util.Scanner;

public class Number_Square_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Range: ");
        int num = input.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
