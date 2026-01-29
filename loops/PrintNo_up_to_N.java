
import java.util.Scanner;

public class PrintNo_up_to_N 
{
    public static void main(String[] args) 
    {
        Scanner input = new  Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        /*In case of this loop it is start from 0 .you can start from any where. */
        for(int i=0;i<=num;i++)
        {
            System.out.print(i+"\t ");
        }
    }
}
