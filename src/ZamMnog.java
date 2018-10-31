import java.util.ArrayList;

public class ZamMnog extends Figure implements IFigure {

    ArrayList<Point> points;


    public ZamMnog(ArrayList p) {
        points = p;
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

            Point p1, p2;
            p1 = points.get(i);

            if (points.size() <= i + 1) {
                p2 = points.get(0);
            } else {
                p2 = points.get(i + 1);
            }
            Summ += (p1.getX + p2.getX) * (p2.getY - p1.getY);
        }
        return Math.abs(Summ) / 2;


    }

    @Override
    public double perimeter() {
        double s = 0;
        for (int i = 0; i < points.size(); i++) {
            Point p1, p2;
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

    @Override
    public  void AddPoint(Point p) throws GeometricException {

        duble(p, points);

    }

    static void duble(Point p, ArrayList<Point> points) throws GeometricException {
        boolean a=false;
        if (points.size()==0){
            points.add(p);
        }
        else {

            for (int i = 0; i <= points.size() - 1; i++) {

                if (p.equals(points.get(i))) {
                    a = true;
                   break;
                }

            }

            if (a==false) {
                points.add(p);
            }
            else {
              throw new GeometricException("Такая точка уже существует!");
            }

        }
    }


    @Override
    public void DeletePoint(Point p) {

    }
}