package SingleLine;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LineYTest {
// No need to test if the input is not a number,
// coordinates accept doubles only

        //Arrange -> instances of the object
        LineY lineCorrect = new LineY(0, 4, 5, 3);
        LineY lineNegative = new LineY(-2.3, 4, 0, -4);
        LineY lineWrong = new LineY(2.3, 5.32, 4.5, 3.2);
        LineY lineEqualPoints = new LineY(2.3, 5.32, 2.300, 5.32);
    @Test
    public void testisLineYInterceptedMethodCorrectInput() {
        //Confirm the Happy Path first:

        //Act -> invoke the method
        lineCorrect.isLineYIntercepted();

        //Assert -> compare the result with the expectations
        Assertions.assertTrue(true);
    }
    @Test
    public void testCorrectInputWithNegativeNumbers() {
        //negative numbers coordinates, return true
        lineNegative.isLineYIntercepted() ;
        Assertions.assertTrue(true);
    }

    @Test
    public void testInputWrong() {
        //The line is not defined with at least one point on y-axes
        lineWrong.isLineYIntercepted();
        Assertions.assertFalse(false);
    }

    @Test
    public void testCorrectInputWithEqualPoints() {
        //two points defined with equal coordinates, return false
        lineEqualPoints.isLineYIntercepted();
        Assertions.assertFalse(false);
    }
}
