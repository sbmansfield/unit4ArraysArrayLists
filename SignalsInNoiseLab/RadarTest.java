//Requirements
// Have two unit classes
// 1. Create Radar object
// 2. Set monster location
// 3. Invoke scan multiple times
//*4. Analyze accumulator via getAccumulatedDetection to find row and column of detected monster
// 5. AssertEquals(expectedRow, detectedRow)
//    AssertEquals(expectedCol, detectedCow)

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RadarTest
 * Tests to make sure that given a hard-coded input, the monster location will be found
 * at the specified row and column after multiple invokes of the scan method
 * 
 * @author Sarah Mansfield
 * @version 16 December 2015
 */
public class RadarTest
{
    /** sets the number of rows to a final int */
    final int ROWS = 100;
    /** sets the number of columns to a final int */
    final int COLS = 100;
    
    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    { 
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    /**
     * Creates a new Radar object, sets a fixed location for the monster, and invokes the
     * scan method multiple times
     * Loops through the grid to find the cell that has the most number of detections and 
     * analyzes accumulator via getAccumulatedDetection to find row and column of detected monster
     * assertEquals used to compare the expected row and column values to the actual 
     */
    @Test
    public void testCaseOne()
    {
        Radar radar = new Radar(ROWS, COLS);
        radar.setMonsterLocation(55,90);
        
        for (int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        
        int max = radar.getAccumulatedDetection(0, 0);
        int row = 0;
        int col = 0;
        
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                if (radar.getAccumulatedDetection(i, j) > max)
                {
                    max = radar.getAccumulatedDetection(i, j);
                    row = i;
                    col = j;
                }
            }
        }
        
        assertEquals(55, row);
        assertEquals(90, col);
    }
    
    /**
     * Creates a new Radar object, sets a fixed location for the monster, and invokes the
     * scan method multiple times
     * Loops through the grid to find the cell that has the most number of detections and 
     * analyzes accumulator via getAccumulatedDetection to find row and column of detected monster
     * assertEquals used to compare the expected row and column values to the actual 
     */
    @Test
    public void testCaseTwo()
    {
        Radar radar = new Radar(ROWS, COLS);
        radar.setMonsterLocation(5,45);
        
        for (int i = 0; i < 100; i++)
        {
            radar.scan();
        }
        
        int max = radar.getAccumulatedDetection(0, 0);
        int row = 0;
        int col = 0;
        
        for (int i = 0; i < 100; i++)
        {
            for (int j = 0; j < 100; j++)
            {
                if (radar.getAccumulatedDetection(i, j) > max)
                {
                    max = radar.getAccumulatedDetection(i, j);
                    row = i;
                    col = j;
                }
            }
        }
        
        assertEquals(5, row);
        assertEquals(45, col);
    }
}
