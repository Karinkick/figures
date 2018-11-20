package my.figures;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
public class Lab1 {

    public static void main(String[] args) throws GeometricException {
        Random ran = new Random();


        ArrayList points1 = new ArrayList();
        ArrayList points2 = new ArrayList();

        point p1 = new point(3.0, 2.0);
        point p2 = new point(3.0, 4.0);
        point p3 = new point(3.0, 5.0);
        point p4 = new point(5.0, 5.0);
        point p5 = new point(6.0, 8.0);
        point p6 = new point(7.0, 8.0);
        point p7 = new point(7.0, 9.0);
        point p8 = new point(7.0, 10.0);
        point p9 = new point(2.0, 2.0);
        point p10 = new point(3.0, 1.0);
        Map<String,Figure> collect1 = new LinkedHashMap<>();
        collectionOfFigures qw = new collectionOfFigures((LinkedHashMap) collect1);

        Section o1 = new Section(p1,p2);

        ZamMnog za1 = new ZamMnog(points1);
        PolyLine polyLine = new PolyLine(points2);
        try{
        za1.addPoint(p1);
        za1.addPoint(p2);
        za1.addPoint(p3);
        za1.addPoint(p4);
        za1.addPoint(p5);
        za1.addPoint(p6);
        za1.addPoint(p7);
        za1.addPoint(p8);
        za1.addPoint(p9);
        za1.addPoint(p10);}
        catch(GeometricException e){
            System.out.println(e.getMessage());
        }
        polyLine.setColor("red");
        System.out.println(polyLine.getColor());
        polyLine.addPoint(p1);
        polyLine.addPoint(p2);
        polyLine.addPoint(p3);
        polyLine.addPoint(p4);
        polyLine.addPoint(p5);
        polyLine.addPoint(p6);
        polyLine.addPoint(p7);
        polyLine.addPoint(p8);
        polyLine.addPoint(p9);
        polyLine.addPoint(p10);
        polyLine.deletePoint(p1);
        polyLine.deletePoint(p1);

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
        System.out.println(qw.createRandomCollection((LinkedHashMap) collect1));

    }

}
