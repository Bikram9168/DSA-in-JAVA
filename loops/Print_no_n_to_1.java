
import java.util.Scanner;
/*Print numbers from 'n' to 1*/
public class Print_no_n_to_1 
{
    public static void main(String[] args) 
    {
        Scanner inpScanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = inpScanner.nextInt();
        for(int i=num ; i>=1; i--)
        {
            System.out.print(i+" ");
        }
    }
}
