import SingleLine.Line;
import SingleLine.LineY;
import TwoLines.Incidence;
import TwoLines.Parallelism;
import TwoLines.Perpendicularity;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Creating several instances of the objects for demonstrations.
        //I choose constructors to accept the coordinates in one line, instead of creating other objects Points

        Line line = new Line(5.2, 2.1, 5.0, 2.1);
        Line lineEqualPoints = new Line(5.2, 2.1, 5.2, 2.1);
        LineY lineYOne = new LineY(0, 5.2, 4, 6.3);
        LineY lineYTwo = new LineY(8, 5.2, 4, 6.3);
        Parallelism linesParallOne = new Parallelism(4, 2, 6, 4, 2, 3, 4, 5);
        Parallelism linesParallTwo = new Parallelism(5, 2, 6, 4, 2, 3, 4, 5);
        Perpendicularity linesPerpendicularOne = new Perpendicularity(4, 4, 3, 5, 4, 4, -1, -1);
        Perpendicularity linesPerpendicularTwo = new Perpendicularity(5, 5, 3, 5, 4, 4, -1, -1);
        Incidence linesInterOne = new Incidence(4, 2, 6, 4, 2, 3, 4, 5);
        Incidence linesInterTwo = new Incidence(1, 1, 4, 4, 1, 8, 2, 4);

        // A line defined by two points
        System.out.println("This is a line: " +  line.isLine());
        System.out.println("This is a line: " +  lineEqualPoints.isLine());

        // Y-Axis intercepted line
        System.out.println("The line is y-intercepted: " + lineYOne.isLineYIntercepted());
        System.out.println("The line is y-intercepted: " + lineYTwo.isLineYIntercepted());

        //Parallel lines
        System.out.println("The lines are parallel: " + linesParallOne.areParallel());
        System.out.println("The lines are parallel: " + linesParallTwo.areParallel());

        // Perpendicular Lines
        System.out.println("The lines are perpendicular: " + linesPerpendicularOne.arePerpendicular());
        System.out.println("The lines are perpendicular: " + linesPerpendicularTwo.arePerpendicular());

        //Intersection of lines, and point of intersection coordinates
        System.out.println("The lines have point of intersection: " + linesInterOne.haveIntersection());
        System.out.println("The lines have point of intersection: " + linesInterTwo.haveIntersection());
        System.out.println("The point of intersection: " + Arrays.toString(linesInterTwo.intersectionPoint()));
    }
}
