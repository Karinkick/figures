package my.figures;

import java.util.List;

public class ZamMnog extends AbstractMnog implements IFigure {


    public ZamMnog(List<point> p) {
        super(p);
    }

    @Override
    public String toString() {
        String allPoints = "";
        for (int i = 0; i < points.size(); i++) {
            allPoints = allPoints + points.get(i).toString() + " ";
        }
        return allPoints;
    }

    @Override
    public double square() {
        double Summ = 0;
        for (int i = 0; i < points.size(); i++) {

            point p1, p2;
            p1 = points.get(i);

            if (points.size() <= i + 1) {
                p2 = points.get(0);
            } else {
                p2 = points.get(i + 1);
            }
            Summ += (p1.x + p2.x) * (p2.y - p1.y);
        }
        return Math.abs(Summ) / 2;


    }

    @Override
    public double perimeter() {
        double s = 0;
        for (int i = 0; i < points.size(); i++) {
            point p1, p2;
            p1 = points.get(i);
            if (points.size() <= i + 1) {
                p2 = points.get(0);
            } else {
                p2 = points.get(i + 1);
            }
            s += p1.length(p2);
        }
        return s;
    }


}