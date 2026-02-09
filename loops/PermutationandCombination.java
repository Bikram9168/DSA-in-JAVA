
import java.util.Scanner;

public class PermutationandCombination 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n =sc.nextInt();
        System.out.print("Enter r: ");
        int r =sc.nextInt();

        int nFact =1;
        for(int i=1;i<=n;i++)
        {
            nFact*=i;
        }

        int rFact =1;
        for(int i=1;i<=r;i++)
        {
            rFact*=i;
        }

        int nrFact =1;
        for(int i=1;i<=n-r;i++)
        {
            nrFact*=i;
        }

        int ncr = nFact/(rFact*nrFact);
        System.out.println(ncr);
    }
}
