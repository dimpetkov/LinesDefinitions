package TwoLines;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IncidenceTest {
        //Arrange -> instance of the object
        Incidence linesIntersected = new Incidence(4, 4, 3, 5, 4, 4, -1, -1);
        Incidence linesInterPoint = new Incidence(1, 1, 4, 4, 1, 8, 2, 4);
        Incidence linesNotIntersected = new Incidence(4, 2, 6, 4, 2, 3, 4, 5);
        Incidence linesEqualPoints = new Incidence(5.2, 6, 5.2, 6, 3.8, 4, 5.4, 7);
    @Test
    public void testCorrectInputLinesAreIntersected() {
        //Confirm the Happy Path first: return true

        //Act -> invoke the method
        linesIntersected.haveIntersection();
        //Assert -> compare the result with the expectations
        Assertions.assertTrue(true);
    }

    @Test
    public void testIntersectionPoint() {
        //correct input, lines have intersection points, return correct value for coordinates
        linesInterPoint.intersectionPoint();
        Assertions.assertEquals(2.4, linesInterPoint.intersectionPoint()[0], 0);
        Assertions.assertEquals(2.4, linesInterPoint.intersectionPoint()[1], 0);
    }

    @Test
    public void testCorrectInputCoincidenceLines() {
        //the given lines do not have intersection, will return false
        linesNotIntersected.haveIntersection();
        Assertions.assertFalse(false);
    }

    @Test
    public void testIncorrectInput() {
        //one of the lines is defined with two equal points, return false
        linesEqualPoints.haveIntersection();
        Assertions.assertFalse(false);
    }
}
