
import java.util.Scanner;


/*Nested Loops */
public class Star_ractangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Rows: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of Columns: ");
        int columns = input.nextInt();
        for(int i=1;i<=rows ; i++) // This loop is for number of Rows
        {
            for(int j=1;j<=columns;j++) // This loop is for number of Columns
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
