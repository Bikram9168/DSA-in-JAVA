
import java.util.Scanner;




public class User_input 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Here we input string
        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        // Here we input Integer
        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        // Here we input floating point or decimal number
        System.out.print("Enter you marks: ");
        float marks = sc.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);

    }
}