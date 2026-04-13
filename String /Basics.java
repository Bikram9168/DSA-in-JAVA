
import java.util.Scanner;

public class String_Basics
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String Str = sc.nextLine();
        str = str.toLowerCase();
//  Count the number of vowels in a given string
    
        int count =0;
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'')
            {
                count+=1;
            }
        }
        System.out.println("Tota vowel  present in the String "+count);
    }
}
