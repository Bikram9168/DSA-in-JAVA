import java.util.Scanner;

public class Binary_Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the number of Rows: ");
            int rows = input.nextInt();
            for(int i=1;i<=rows ; i++) // This loop is for number of Rows
            {
               for(int j=1;j<=i;j++) // This loop is for number of Columns
                {
                    if(i==j || (i+j)%2==0)
                    {
                        System.out.print("1 ");
                    }
                    else
                        System.out.print("0 ");
                }
                System.out.println();
            }
    }
}
