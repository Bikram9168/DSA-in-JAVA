
import java.util.Scanner;
/*Print the table of any number. */
public class Table_of_a_Number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter which number's table you want: ");
        int num=sc.nextInt();
        for(int i = num ; i<=num*10;i+=num)
        {
            System.out.print(i+" ");
        }
    }
}
