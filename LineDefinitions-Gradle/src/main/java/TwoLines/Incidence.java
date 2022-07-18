package TwoLines;

import SingleLine.Line;

public class Incidence extends Parallelism {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;

    //Constructor accept coordinates for four points -> two for each line
    public Incidence(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2, x3, y3, x4, y4);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }
//Check if lines have point of intersection
    public boolean haveIntersection() {
        Line lineOne = new Line(x1, y1, x2, y2);
        Line lineTwo = new Line(x3, y3, x4, y4);
        if (!lineOne.isLine() || !lineTwo.isLine()) {
            return false;
        }
        double slopeOne = (this.y2 - this.y1) / (this.x2 - this.x1);
        double slopeTwo = (this.y4 - this.y3) / (this.x4 - this.x3);
        return slopeOne != slopeTwo;
    }
//Find coordinates of that point
    public double[] intersectionPoint() {
        double[] result = new double[2];
        double x;
        double y;

        double a1 = y2 - y1;
        double b1 = x1 - x2;
        double c1 = a1 * x1 + b1 * y1;

        double a2 = y4 - y3;
        double b2 = x3 - x4;
        double c2 = a2 * x3 + b2 * y3;

        double determinant = a1 * b2 - a2 * b1;
        if (determinant == 0) {
            System.out.println("No Intersection point!");
        } else {
            x = (b2 * c1 - b1 * c2) / determinant;
            y = (a1 * c2 - a2 * c1) / determinant;
            result[0] = x;
            result[1] = y;
        }
        return result;
    }
}
