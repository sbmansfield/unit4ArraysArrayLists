public class ArrayOperations2
{
    private int[] values;
    private int currentSize;
    
    public ArrayOperations2() 
    { 
        values = new int[10]; 
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
            remove(currentSize/2);
            remove( (currentSize/2) + 1);
        }
        else
        {
            remove( (currentSize/2) + 1);
        }
    }
    //f
    public void evenToFront()
    {
        
    }
    //g
//     public int return2ndLargest()
//     {
//         int min = findMin();
//         int max = findMax();
//         for (int i = 0; i < currentSize; i++)
//         {
//             if (values[0] > min && values[0] < max)
//             {
//                 min = values[0];
//             }
//         }
//     }
    public int findMin()
    {
        int smallest = values[0];
        for (int i = 1; i < currentSize; i++)
        {
            if (values[i] < smallest)
            {
                smallest = values[i];
            }
        }
        return smallest;
    }
    public int findMax()
    {
        int largest = values[0];
        for (int i = 1; i < currentSize; i++)
        {
            if (values[i] > largest)
            {
                largest = values[i];
            }
        }
        return largest;
    }
    
    //h
    public boolean checkSorted()
    {
        int check = 0;
        for (int i = 0; i < currentSize; i++)
        {
            if (values[i] < values[i+1])
            {
                check++;
            }
        }
        
        if (check == currentSize)
        {
            boolean sorted = true;
        }
        return sorted;
    }
    //i
    public boolean checkAdjDuplicate()
    {
        int check = 0;
        for (int i = 0; i < currentSize; i++)
        {
            if (values[i] == values[i+1])
            {
                check++;
            }
        }
        
        if (check > 0)
        {
            return true;
        }
    }
    //j
    public boolean containsDuplicates()
    {
        int check = 0;
        for (int i = 0; i < currentSize; i++)
        {
            int tempCheck = values[i];
            for (int j = i + 1; j < currentSize - 1; j++)
            {
                if (tempCheck == values[j])
                {
                    check++;
                }
            }
        }
        
        if (check > 0)
        {
            return true;
        }
    }
}
