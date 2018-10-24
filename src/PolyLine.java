import java.util.ArrayList;

public class PolyLine extends Figure{
    ArrayList<Point> Points;
    public PolyLine(ArrayList p){
        Points=p;
    }
    @Override
    public String toString(){
        String allPoints = "";
        for(int i=0;i<Points.size(); i++){
            allPoints = allPoints + Points.get(i).toString() +  " ";
        }
        return allPoints;
    }
    @Override
    public double perimetr(){
        double s=0;
        for (int i=0; i<Points.size()-1; i++){
            Point p1,p2;
            p1=Points.get(i);
            p2=Points.get(i+1);
            s+=p1.length(p2);
                 }
        return s;

    }
    @Override
    public double square() throws GeometricException {
        throw new GeometricException();
    }
}
