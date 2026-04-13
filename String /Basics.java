
import java.util.Scanner;

public class String_Basics
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String S = sc.nextLine();

//  Count the number of vowels in a given string
    
        int count =0;
        for(int i=0;i<S.length();i++)
        {
            char ch = S.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            {
                count+=1;
            }
        }
        System.out.println("Tota vowel  present in the String "+count);
    }
}
