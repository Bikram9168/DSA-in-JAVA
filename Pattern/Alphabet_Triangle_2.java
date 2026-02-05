import java.util.Scanner;

public class Alphabet_Triangle_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of Rows: ");
            int rows = input.nextInt();
            for(int i=1;i<=rows ; i++) // This loop is for number of Rows
            {
               for(int j=1;j<=i;j++) // This loop is for number of Columns
                {
                    System.out.print((char)(i+64)+" ");
                }
                System.out.print("\n");
            }
    }
}
