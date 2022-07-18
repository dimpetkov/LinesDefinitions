package SingleLine;

public class Line {
    public double x1;
    public double y1;
    public double x2;
    public double y2;

    //Constructor accepts coordinates of two points
    public Line(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean isLine() {
        //Both points should have different coordinates to define a line
        return this.x1 != this.x2 || this.y1 != this.y2;
    }
}
