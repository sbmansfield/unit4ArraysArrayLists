
public class PartialArray
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;
    private int currentSize;
    
    /**
     * Default constructor for objects of class PartialArray
     */
    public PartialArray()
    {
        // initialise instance variables
        values = new int[100];
        for (currentSize = 0; currentSize < 20; currentSize++)
        {
            values[currentSize] = currentSize * currentSize;
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

    public void insert(int pos, int value)
    {
        if (currentSize == values.length)
        {
            growArray();
        }

        currentSize--;
        for (int i = currentSize - 1; i > pos; i--)
        {
            values[i] = values[i-1];
        }
        
        values[pos] = value;
    }
    
    private void growArray()
    {
        int[] newArray = new int[currentSize*2];
        
        for (int i = 0; i < currentSize; i++)
        {
            newArray[i] = values[i];
        }
        
        values = newArray;
    }
    
    public void swap(int posA, int posB)
    {
        int temp = values[posA];
        values[posA] = values[posB];
        values[posB] = temp;
    }
}
