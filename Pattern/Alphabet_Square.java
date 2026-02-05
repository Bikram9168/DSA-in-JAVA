
import java.util.Scanner;

public class Alphabet_Square {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the rangr: ");
        int num = Sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }
    }
}
