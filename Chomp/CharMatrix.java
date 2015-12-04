import java.awt.Rectangle;

// Implements a 2-D array of characters

public class CharMatrix
{
  // Instance variables:
  private char grid[][];
  private static final int ROWS = 4;
  private static final int COLS = 7;
  private static final char SPACE = ' ';
  private static final char FILL = '*';
  
  // Constructor: creates a grid with dimensions rows, cols,
  // and fills it with spaces
  public CharMatrix(int rows, int cols)
  {
    this.grid = new char[rows][cols];
    
    for (int i = 0; i < grid.length; i++)
    {
        for (int j = 0; j < grid[i].length; j++)
        {
            grid[i][j] = SPACE;
        }
    }
  }

  // Constructor: creates a grid with dimensions rows , cols ,
  // and fills it with the fill character
  public CharMatrix(int rows, int cols, char fill)
  {
    this.grid = new char[rows][cols];
    
    for (int i = 0; i < grid.length; i++)
    {
        for (int j = 0; j < grid[i].length; j++)
        {
            grid[i][j] = FILL;
        }
    }
  }

  // Returns the number of rows in grid
  public int numRows()
  {
    return ROWS;
  }

  // Returns the number of columns in grid
  public int numCols()
  {
    return COLS;
  }

  // Returns the character at row, col location
  public char charAt(int row, int col)
  {
    return grid[row][col];
  }

  // Sets the character at row, col location to ch
  public void setCharAt(int row, int col, char ch)
  {
    grid[row][col] = ch;
  }

  // Returns true if the character at row, col is a space,
  // false otherwise
  public boolean isEmpty(int row, int col)
  {
    if (grid[row][col] == SPACE)
    {
        return true;
    }
    else
    {
        return false;
    }
  }

  // Fills the given rectangle with fill  characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
    grid[row0][col0] = FILL;
  }

  // Fills the given rectangle with SPACE characters.
  // row0, col0 is the upper left corner and row1, col1 is the
  // lower right corner of the rectangle.
  public void clearRect(int row0, int col0, int row1, int col1)
  {
    grid[row0][col0] = SPACE;
  }

  // Returns the count of all non-space characters in row 
  public int countInRow(int row)
  {
    int total = 0;
    
    for (int i = 0; i < grid[row].length; i++)
    {
        total += 1;
    }
    
    return total;
  }

  // Returns the count of all non-space characters in col 
  public int countInCol(int col)
  {
    int total = 0;
    
    for (int j = 0; j < grid[col].length; j++)
    {
        total += 1;
    }
    
    return total;
  }
}
