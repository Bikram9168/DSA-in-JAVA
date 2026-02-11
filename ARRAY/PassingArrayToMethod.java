public class PassingArrayToMethod 
{
    public static void main(String[] args) 
    {
        int[] x ={10,20,30,40};
        System.out.println(x[2]);
        Change(x);
        System.out.println(x[2]);
    }
    public static void Change(int[] x) 
    {
        x[2]=99;
    }
}
