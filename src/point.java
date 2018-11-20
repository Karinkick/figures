package my.figures;

public class point {
    double x, y;

    public point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + "; " + y + ")";
    }

    public boolean equals(point p) {
        return (Math.abs(this.x- p.x)<1e-8 && Math.abs(this.y- p.y)<1e-8 );
    }

    public double length(point p){
        return Math.sqrt(Math.pow((this.x - p.x),2) + Math.pow((this.y - p.y),2));
    }
}


