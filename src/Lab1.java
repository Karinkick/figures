import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
public class Lab1 {

    public static void main(String[] args) throws GeometricException {
        Random ran = new Random();


        ArrayList points1 = new ArrayList();
        ArrayList points2 = new ArrayList();

        Point p1 = new Point(3.0, 2.0);
        Point p2 = new Point(3.0, 4.0);
        Point p3 = new Point(3.0, 5.0);
        Point p4 = new Point(5.0, 5.0);
        Point p5 = new Point(6.0, 8.0);
        Point p6 = new Point(7.0, 8.0);
        Point p7 = new Point(7.0, 9.0);
        Point p8 = new Point(7.0, 10.0);
        Point p9 = new Point(2.0, 2.0);
        Point p10 = new Point(3.0, 1.0);
        Map<String,Figure> collect1 = new LinkedHashMap<>();
        CollectionOfFigures qw = new CollectionOfFigures((LinkedHashMap) collect1);

        Section o1 = new Section(p1,p2);

        ZamMnog za1 = new ZamMnog(points1);
        PolyLine polyLine = new PolyLine(points2);
        try{
        za1.AddPoint(p1);
        za1.AddPoint(p2);
        za1.AddPoint(p3);
        za1.AddPoint(p4);
        za1.AddPoint(p5);
        za1.AddPoint(p6);
        za1.AddPoint(p7);
        za1.AddPoint(p8);
        za1.AddPoint(p9);
        za1.AddPoint(p10);}
        catch(GeometricException e){
            System.out.println(e.getMessage());
        }
        polyLine.setColor("red");
        System.out.println(polyLine.getColor());
        polyLine.AddPoint(p1);
        polyLine.AddPoint(p2);
        polyLine.AddPoint(p3);
        polyLine.AddPoint(p4);
        polyLine.AddPoint(p5);
        polyLine.AddPoint(p6);
        polyLine.AddPoint(p7);
        polyLine.AddPoint(p8);
        polyLine.AddPoint(p9);
        polyLine.AddPoint(p10);
        polyLine.DeletePoint(p1);
        polyLine.DeletePoint(p1);

        System.out.println(p1.length(p2));
        System.out.println(p1.equals(p2));
        System.out.println(za1.square());
        System.out.println(za1.perimeter());
        System.out.println(polyLine.perimeter());
        System.out.println(za1.toString());
        System.out.println(polyLine.toString());

        try {
            System.out.println(o1.square());
        }

        catch (GeometricException e){
            System.out.println("Нельзя вычислить площадь отрезка " + e) ;
        }

        try {
            System.out.println(polyLine.square());
        }
        catch (GeometricException e){
            System.out.println("Нельзя вычислить площадь незамкнутой линии " + e) ;
        }
        System.out.println(qw.ranFig((LinkedHashMap) collect1));

    }

}
