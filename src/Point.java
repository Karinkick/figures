public class Point {
    double getX, getY;

    public Point(double x, double y) {
        this.getX = x;
        this.getY = y;
    }
    @Override
    public String toString() {
        return "(" + getX + "; " + getY + ")";
    }

    public boolean equals(Point p) {
        if (this.getX == p.getX && this.getY == p.getY) {
            return true;
    }
    else { return false; }
    }

    public double length(Point p){
        return Math.sqrt(Math.pow((this.getX - p.getX),2) + Math.pow((this.getY - p.getY),2));
    }
}


