package my.figures;

import java.util.ArrayList;
import java.util.List;

public class AbstractMnog extends Figure {
    ArrayList<point> points;

    public AbstractMnog(List<point> p) {
       points=new ArrayList<>(p);
    }

    static void duble(point p, ArrayList<point> points) throws GeometricException {
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

    public void deletePoint(point p) {
        points.remove(p);
    }

    public  void addPoint(point p) throws GeometricException {

        duble(p, points);

    }

}
