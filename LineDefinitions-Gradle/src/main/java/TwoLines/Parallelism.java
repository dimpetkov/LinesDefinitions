package TwoLines;

import SingleLine.Line;

public class Parallelism extends Line {

    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private double x3;
    private double y3;
    private double x4;
    private double y4;

//Constructor accept coordinates for four points -> two for each line
    public Parallelism(double x1, double y1, double x2, double y2,
                       double x3, double y3, double x4, double y4) {
        super(x1, y1, x2, y2);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        this.x4 = x4;
        this.y4 = y4;
    }

    public boolean areParallel() {
        //check if the lines are defined correctly
        Line lineOne = new Line(this.x1, this.y1, this.x2, this.y2);
        Line lineTwo = new Line(this.x3, this.y3, this.x4, this.y4);
        if (!lineOne.isLine() || !lineTwo.isLine()) {
            return false;
        }
        //check if parallel
        double slopeOne = (this.y2 - this.y1) / (this.x2 - this.x1);
        double slopeTwo = (this.y4 - this.y3) / (this.x4 - this.x3);
        if (slopeOne != slopeTwo) {
            return false;
        }
        return true;
    }
}
