
import java.util.Scanner;
/*Take 3 posative integer input and tell if they can be the sides of a triangle or not.*/
public class sidesOfATriangel {
    public static void main(String[] args) {
        Scanner inpScanner = new  Scanner(System.in);
        System.out.print("Enter the first side of the triangle: ");
        int side1=inpScanner.nextInt();
        System.out.print("Enter the second side of the triangle: ");
        int side2=inpScanner.nextInt();
        System.out.print("Enter the third side of the triangle: ");
        int side3=inpScanner.nextInt();
        if (side1+side2>side3 && side1+side3>side2 && side2+side3>side1) 
        {
            System.out.println("Sides of the triangles are valid.");
        }
        else
        {
            System.out.println("Sides of the triangle are not valid.");
        }
    }
}
