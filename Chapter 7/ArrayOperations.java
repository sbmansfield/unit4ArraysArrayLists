
public class ArrayOperations
{
    public static void experimentArrays()
    {
        double[] x = {8, 4, 5, 21, 7, 9, 18, 2, 100};
        
        System.out.println("There are "+ x.length + " items in the array");
        System.out.println("First array item: " + x[0]);
        System.out.println("Last array item: " + x[x.length - 1]);
        
        for (int i = 0; i < 9; i++)
        {
            System.out.println(x[i]);
        }
        for (int i = 0; i < 9; i++)
        {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        for (int i = 8; i >= 0; i--)
        {
            System.out.println("x[" + i + "] = " + x[i]);
        }
        
        for (double value : x)
        {
            System.out.println(value);
        }
    }
}
