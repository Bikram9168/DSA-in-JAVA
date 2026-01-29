/*Print all odd numbers from 1 to 100 */
public class OddNo_1_to_100 
{
    public static void main(String[] args) 
    {
        /*using if statement*/
        for(int i =1 ; i<=100 ; i++)
        {
            if (i%2!=0) 
            {
                System.out.print(i+" ");
            }
        }
        /*Another logic only updating increment part*/
        for(int i =1 ; i<=100 ; i+=2)
        {
            System.out.print(i+" ");
        }
    }
}
