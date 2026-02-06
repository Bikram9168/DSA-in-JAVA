import java.util.Scanner;
/* In this Code we print a Square of alphabet where all characters are in small latters
In this Actual concept is type convertion*/
public class alphabet_square_2 {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the rangr: ");
        int num = Sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j=1;j<=num;j++)
            {
                System.out.print((char)(j+96)+" "); 
            }
            System.out.println();
        }
    }
}

