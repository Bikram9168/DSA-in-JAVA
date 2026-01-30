/*Print All alphabets with their corresponding ASCII values.*/
public class Alphabets_with_ASCII 
{
    public static void main(String[] args) 
    {
        for (int i = 65; i <=90 ; i++) 
        //This is for capitel letter
        {
            System.out.println((char)i+" "+ i);
        }
        System.out.println(""); //This is for gap
        for (int i = 97; i <=122 ; i++) 
        //This is for small letter 
        {
            System.out.println((char)i+" "+ i);
        }
    }
}
