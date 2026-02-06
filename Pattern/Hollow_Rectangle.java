
import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner inpScanner = new Scanner(System.in);
        System.out.print("Enter the row: ");
        int row = inpScanner.nextInt();
        System.out.print("Enter the column: ");
        int column = inpScanner.nextInt();

        for(int i=1;i<=row;i++)
        {
            for(int j=1;j<=column;j++)
            {
                if(i==1 || i==row || j==1 || j== column)
                    System.out.print("* ");
                else  System.out.print("  ");
            }
            System.out.println();
        }
    }
}
