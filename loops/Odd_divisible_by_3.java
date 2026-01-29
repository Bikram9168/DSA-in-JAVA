/* Print all odd numbers divisible by 3 from 1 to 100 */
public class Odd_divisible_by_3 
{
    public static void main(String[] args) 
    {
        for(int i=1; i<=100 ; i+=2)
        {
            if (i%3==0) 
            {
                System.out.print(i+" ");
            }
        }
    }
}
