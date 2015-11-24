
public class ArrayOperations2
{
    private int[] values;
    private int currentSize;
    
    public ArrayOperations2() 
    { 
        values = new int[100]; 
        for (currentSize = 0; currentSize <50; currentSize++)
        {
            values[currentSize] = currentSize * 2;
        }
    }
    //a
    public void swapFirstAndLast() 
    { 
        int temp = values[0];
        values[0] = values[values.length - 1];
        values[values.length - 1] = temp;
    }
    //b
    public void shiftRight() 
    { 
        int tempLast = values[values.length - 1];
        for (int i = 0; i < values.length - 1; i++)
        {
            values[i + 1] = values[i];
        }
        values[0] = tempLast;
    }
    //c
    public void replaceZero()
    {
        for (int i = 0; i < values.length; i+= 2)
        {
            values[i] = 0;
        }
    }
    //d
    public void replaceNeighbors()
    {
        for (int i = 1; i < values.length - 1; i++)
        {
            int temp1 = values[i - 1];
            int temp2 = values[i + 1];
            if (temp1 > temp2)
            {
                values[i] = temp1;
            }
            else
            {
                values[i] = temp2;
            }
            remove(temp1);
            remove(temp2);
        }
    }
    public void remove(int pos)
    {
        for (int i = pos + 1; i < currentSize; i++)
        {
            values[i-1] = values[i];
        }
        currentSize--;
    }
    //e
    public void removeMiddle()
    {
        if (currentSize%2 == 0)
        {
            
        }
        else
        {
            
        }
    }
    //f
    public void evenToFront()
    {
        
    }
    //g
//     public int return2ndLargest()
//     {
//         
//     }
//     //h
//     public boolean checkSorted()
//     {
//         
//     }
//     //i
//     public boolean checkAdjDuplicate()
//     {
//         
//     }
//     //j
//     public boolean containsDuplicates()
//     {
//         
//     }
}
