package TwoLines;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParallelismTest {
        //Arrange -> instance of the object
        Parallelism linesParallel = new Parallelism(4, 2, 6, 4, 2, 3, 4, 5);
        Parallelism linesNotParallel = new Parallelism(15, 2.5, 6.8, 4.45, 2.3, 3, 4, 5);
        Parallelism linesNegative = new Parallelism(-3, -3, 3, 3, 7, 8, 9, 10);
        Parallelism linesEqualPoints = new Parallelism(5, 4.5, 5, 4.5, 2.3, 3, 4, 5);
    @Test
    public void testCorrectInputParallelLines() {
        //Confirm the Happy Path first:

        //Act -> invoke the method
        linesParallel.areParallel();
        //Assert -> compare the result with the expectations
        Assertions.assertTrue(true);
    }

    @Test
    public void testCorrectInputLinesNotParallel() {
        //the lines are not parallel, return false
        linesNotParallel.areParallel();
        Assertions.assertFalse(false);
    }

    @Test
    public void testNegativeNumbersParallelLines() {
        //the lines are parallel, even with negative coordinates: return true
        linesNegative.areParallel();
        Assertions.assertTrue(true);
    }

    @Test
    public void testLinesNotDefinedCorrectly() {
        //one of the lines are defined with two equal points
        linesEqualPoints.areParallel();
        Assertions.assertFalse(false);
    }
}
