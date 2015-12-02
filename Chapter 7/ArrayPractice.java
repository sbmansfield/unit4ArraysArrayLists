import java.util.Arrays;

public class ArrayPractice
{
    public static void exceptionExample()
    {
        int[] values = {1, 4, 9, 16, 25 };
        int x = values[5];
    }
    
    public static void filing()
    {
        int[] values = new int[100];
        
        for (int i = 0; i < values.length; i++)
        {
            values[i] = i*i;
        }
        
        System.out.println(values);
        System.out.println(Arrays.toString(values));
    }
    
    public static int findMax()
    {
        int[] values = {10, 45, 19, 216, 25 };
        
        int largest = values[0];
        for (int i = 1; i < values.length; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        
        return largest;
    }     
}