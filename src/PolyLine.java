import java.util.ArrayList;

public class PolyLine extends Figure implements IFigure {

    ArrayList<Point> points1;
    public PolyLine(ArrayList p){
        points1 =p;
    }

    @Override
    public String toString(){
        String allPoints = "";
        for(int i = 0; i< points1.size(); i++){
            allPoints = allPoints + points1.get(i).toString() +  " ";
        }
        return allPoints;
    }

    @Override
    public double perimeter(){
        double s=0;
        for (int i = 0; i< points1.size()-1; i++){
            Point p1,p2;
            p1= points1.get(i);
            p2= points1.get(i+1);
            s+=p1.length(p2);
                 }
        return s;
    }

    @Override
    public void AddPoint(Point p) throws GeometricException{
                ZamMnog.duble(p, points1);

    }

    @Override
    public void DeletePoint(Point p) {
        points1.remove(p);
    }


    @Override
    public double square() throws GeometricException {
        throw new GeometricException();
    }

}
