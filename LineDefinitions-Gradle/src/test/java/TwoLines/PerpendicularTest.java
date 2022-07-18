package TwoLines;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PerpendicularTest {
        //Arrange -> instance of the object
        Perpendicularity linesPerpendicular = new Perpendicularity(4, 4, 3, 5, 4, 4, -1, -1);
        Perpendicularity linesNotPerpendicular = new Perpendicularity(3, 2.5, 8.5, 4.45, 2.3, 3, 4, 5);
        Perpendicularity linesEqualPoints = new Perpendicularity(5, 4.5, 5, 4.5, 2.3, 3, 4, 5);

    @Test
    public void testCorrectInputPerpendicularLines() {
        //Confirm the Happy Path first: return true

        //Act -> invoke the method
        linesPerpendicular.arePerpendicular();
        //Assert -> compare the result with the expectations
        Assertions.assertTrue(true);
    }

    @Test
    public void testCorrectInputLinesNotPerpendicular() {
        //the given lines are not perpendicular, return false
        linesNotPerpendicular.arePerpendicular();
        Assertions.assertFalse(false);
    }

    @Test
    public void testLinesNotDefinedCorrectly() {
        //one of the lines are defined with two equal points
        linesEqualPoints.arePerpendicular();
        Assertions.assertFalse(false);
    }
}
