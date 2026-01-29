
import java.util.Scanner;

public class AP_series 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int num = input.nextInt();
        for(int i =2; i<=3*num-1;i+=3)
        {
            System.out.println(i+" ");
        }
    }
}

