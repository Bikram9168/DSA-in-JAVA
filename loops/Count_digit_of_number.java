/*Find the digits of a number take user input*/
import java.util.Scanner;

public class Count_digit_of_number 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        if (num==0) {
            System.out.println(1);
        }
        else
        {
            int count = 0;
            while (num!=0) 
            {
                num /= 10;
                count++;
            }
            System.out.println(count);
        }
    }
}
