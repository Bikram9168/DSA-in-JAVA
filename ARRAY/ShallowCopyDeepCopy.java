import java.util.Arrays;

public class ShallowCopyDeepCopy 
{
    public static void main(String[] args) 
    {
        int[] arr1={10,20,30};
        int[] arr2=arr1; // This arr2 is Shallo Copy of arr1
        arr2[0]=100;
        System.out.println(arr1[0]);

        //DeepCopy
        int[] deep = Arrays.copyOf(arr1,arr1.length);
        deep[0]=200;
        System.out.println(arr1[0]);
    }
}
