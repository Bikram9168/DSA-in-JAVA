public class Ascii {
    public static void main(String[] args) {
        /*
        Ascii value of small 'a' is => 97 and small 'z' is=>122
        Ascii value of capital 'A' is => 65 and capital 'Z' is=>90
        Ascii value of '0' is => 48 and '9' is => 57
         */

        char ch1='A';
        int x=ch1; // Implicit typecasting
        System.out.println(x); // Output => 65

        char ch2='7';
        System.out.println((int)ch2); // Here we convort explicit typecasting ,and output is => 55
    }
}
