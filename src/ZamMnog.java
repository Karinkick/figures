import java.util.ArrayList;

public class ZamMnog extends Figure implements AddDelete{

    ArrayList<Point> Points;
   // Point[] points;

public ZamMnog(ArrayList p){
    Points = p ;
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
    public double square (){
    double Summ=0;
    for(int i=0;i<Points.size(); i++){

        Point p1,p2;
        p1= Points.get(i);

        if (Points.size() <= i+1){
            p2=Points.get(0);
        }
        else {
            p2=Points.get(i+1);
        }
        Summ+=(p1.getX+p2.getX)*(p2.getY-p1.getY);
            }
    return Math.abs(Summ)/2;


}
@Override
    public double perimetr(){
        double s=0;
        for (int i=0; i<Points.size(); i++){
            Point p1,p2;
            p1=Points.get(i);
            if (Points.size() <= i+1){
                p2=Points.get(0);
            }
            else {
                p2=Points.get(i+1);
            }
            s+=p1.length(p2);
                 }
    return s;
    }

    @Override
    public void AddPoints(Point p){
        Points.add(p);
    }

    @Override
    public void  DeletePoints(Point p){
        Points.remove(p);
    }
}
