import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CollectionOfFigures {

    final Random random = new Random();
    HashMap<String, Figure> map = new HashMap<String, Figure>(5);
    HashMap<String,Figure> collect;
    HashMap<String,Figure> collect1 = new HashMap<>(random.nextInt(5));

    public void ranFig(){


    Circle circle = new Circle(random.nextInt(5));

    int k = random.nextInt(5)+1;

        ArrayList<Point> quadrilateral = new ArrayList<>(3); //создание трекгольника с рандомными точками
        for (int i = 0; i< 3; i++){
            Point p = new Point(random.nextInt(5),random.nextInt(5));
            quadrilateral.add(p);
        }
        ZamMnog tetragon = new ZamMnog(quadrilateral);

        ArrayList<Point> manyugolnik = new ArrayList<>(random.nextInt(k));
        for (int i = 0; i< k; i++){
            Point p = new Point(random.nextInt(5),random.nextInt(5));
            manyugolnik.add(p);
        }

        ArrayList<Point> trianglefig = new ArrayList<>(3); //создание трекгольника с рандомными точками
        for (int i = 0; i< 3; i++){
            Point p = new Point(random.nextInt(5),random.nextInt(5));
            trianglefig.add(p);
        }

        ZamMnog triangle = new ZamMnog(trianglefig);


    ZamMnog mnogougolnik = new ZamMnog(manyugolnik);

        Point p1 = new Point(random.nextInt(5),random.nextInt(5));
        Point p2 = new Point(random.nextInt(5),random.nextInt(5));
        Section section = new Section(p1,p2);

        map.put("Треугольник",triangle);
        map.put("Круг",circle);
        map.put("Многоугольник",mnogougolnik);
        map.put("Четырехугольник",tetragon);
        map.put("Отрезок",section);

    for (int i = 0; i< collect1.size(); i++) {
        collect1.put(map.));
}

public CollectionOfFigures(){

}
    @Override

    public String toString(){
    String s = "";
        for (Map.Entry entry : collect.entrySet())
            s = s + "Key: " + entry.getKey() + " Value: "
                    + entry.getValue() + "; ";
    return s;
    }

    public void deleteFigure (String s, Figure f){
        collect.remove(s, f);
    }

    public void addFigure (String s, Figure f){
    collect.put(s, f);
    }

}
