public class ForEach 
{
    public static void main(String[] args) 
    {
        int[] arr={10,20,30,40,50};
        /*In this loop we cannot change the value or update element , we can only traverse Array*/
        for(int ele : arr)
        {
            System.out.print(ele+" ");
        }
    }
}

