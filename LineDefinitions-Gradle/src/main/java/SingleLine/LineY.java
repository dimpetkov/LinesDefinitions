package SingleLine;

public class LineY extends Line {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

//Constructor accepts coordinates of two points
    public LineY(double x1, double y1, double x2, double y2) {
        super(x1, y1, x2, y2);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public boolean isLineYIntercepted() {
        LineY lineY = new LineY(this.x1, this.y1, this.x2, this.y2);
        //to be y-intersected one of the points should have 0 value on x-axis
        if (lineY.isLine()) {
            return x1 == 0 || x2 == 0;
        }
        return true;
    }
}
