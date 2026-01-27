
import java.util.Scanner;
/*Take length and breadth of rectangle as input and write a program to find wheather 
the area of reactangle is greater than its perimeter. */
public class Area_vs_perimeter {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        double length=input.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = input.nextDouble();

        double area=length*breadth;
        double perimeter = 2*(length+breadth);
        if (area>perimeter) 
        {
            System.out.println("Area is the greatter!");
        }
        else
        {
            System.out.println("Perimeter is the gretter!");
        }
    }
}
