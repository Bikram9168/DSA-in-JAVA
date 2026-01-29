
/*Print all even numbers from 1 to 11 .*/
public class Even_no_1_to_100 
{
    public static void main(String[] args) 
    {
        /*Here only update increment or updation part.*/
        for(int i=0 ; i<=100;i+=2)
        {
            System.out.print(i+" ");
        }

        /*Another logic using if statement*/
        for(int i=0 ; i<=100;i++)
        {
            if (i%2==0) 
            {
                System.out.print(i+" ");
            }
        }
    }
}
