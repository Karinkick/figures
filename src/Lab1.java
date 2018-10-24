import java.util.ArrayList;

public class Lab1 {

    public static void main(String[] args) throws GeometricException {

        double d;

        Point p1 = new Point(3.0, 2.0);
        Point p2 = new Point(1.0, 2.0);
        Point p3 = new Point(5.0, 5.0);
        //Point p4 = new Point(6.0, 8.0);
        Otrezok o1 = new Otrezok(p1,p2);
        ArrayList Points = new ArrayList();
        Points.add(p1);
        Points.add(p2);
        Points.add(p3);

      //  z1[3] = p4;
        ZamMnog za1 = new ZamMnog(Points);
        PolyLine za2 = new PolyLine(Points);
        System.out.println("Точка 1 = " + p1);
        System.out.println("Точка 2 = " + p2);

        //     System.out.println(p1, p2);

        //      System.out.println(String.join("Расстояние от"+p1+"до"+p2));

    //    printMe("Расстояние от " + p1 + " до " + p2 + " равно = " + d);

        System.out.println(p1.length(p2));
        System.out.println(p1.equals(p2));
        System.out.println(za1.square());
        System.out.println(za1.perimetr());
        System.out.println(za2.perimetr());
        try {
            d=o1.square();
            System.out.println(d);
        }
        catch (GeometricException e){
            System.out.println("Нельзя вычислить площадь отрезка " + e) ;
        }
        try {
            d=za2.square();
            System.out.println(d);
        }
        catch (GeometricException e){
            System.out.println("Нельзя вычислить площадь незамкнутой линии " + e) ;
        }

    }
}

