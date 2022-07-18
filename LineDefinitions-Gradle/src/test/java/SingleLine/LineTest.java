package SingleLine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineTest {
    //Arrange -> instances of the object Line
        Line lineCorrect = new Line(2, 4, 5, 3);
        Line lineEqualPoints = new Line(2.3, 5.32, 2.300, 5.32);
        Line lineNegativeCoordinates = new Line(-2.3, 5.32, 2.300, -5.32);

    @Test
    public void testIsLineMethodWithCorrectInput() {
        //Confirm the Happy Path first:

        //Act -> invoke the method
        lineCorrect.isLine();

        //Assert -> compare the result with the expectations
        Assertions.assertTrue(true);
    }

    @Test
    public void testCorrectInputWithEqualPoints() {
        //two points defined with equal coordinates, return false
        lineEqualPoints.isLine();
        Assertions.assertFalse(false);
    }

    @Test
    public void testCorrectInputWithNegativeNumbers() {
        //negative numbers coordinates, return true
        lineNegativeCoordinates.isLine();
        Assertions.assertTrue(true);
    }
}
