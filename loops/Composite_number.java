
import java.util.Scanner;

public class Composite_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        boolean flag = true; //true means prime

        for(int i=2;i<=num-1;i++)
        {
            if (num%i==0) 
            {
                flag = false; // false Means composite
                break;
            }
            
        }
        if(flag==false)
        {
            System.out.println("Composite Number.");
        }
        if(flag==true)
        {
            System.out.println("Prime Number.");
        }
    }
}
