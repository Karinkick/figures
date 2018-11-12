import java.util.*;

public class CollectionOfFigures {
    final Random random = new Random();
    int n=   random.nextInt(10) + 6;

    Map<String, Figure> map = new LinkedHashMap<String, Figure>(n);
    int kol = random.nextInt(20) + 1;
    Map<String, Figure> collect = new LinkedHashMap<>(kol);
    int k = random.nextInt(9) + 5;

    public Figure cikl(int n) {
        ArrayList<Point> figure = new ArrayList<>(n);
        for (int i = 0; i < n+1; i++) {
            Point p = new Point(random.nextInt(5) + 1, random.nextInt(5) + 1);
            figure.add(p);
        }
        ZamMnog elFigure = new ZamMnog(figure);
        return elFigure;
    }

    public void randomCollectionsOfFigures(int k) {
        String[] NameOfFigure = {"Круг", "Отрезок", "Треугольник", "Четырехугольник", "Многоугольник"};
        if (k == 2 | k==3) {
            map.put(NameOfFigure[k], cikl(k));
        }
        if (k == 0) {
            Circle circle = new Circle(new Point(random.nextInt(5) + 1, random.nextInt(5) + 1), random.nextInt(5) + 1);
            map.put(NameOfFigure[0], circle);
        }
        if (k == 1) {

            Point po1 = new Point(random.nextInt(100) + 2, random.nextInt(100) + 2);
            Point po2 = new Point(random.nextInt(100) + 2, random.nextInt(100) + 2);
            Section section = new Section(po1, po2);
            map.put(NameOfFigure[k], section);
        }
        if (k>=4){
            map.put(NameOfFigure[4], cikl(k));
        }

    }

    public Map<String, Figure> createRandomCollection (LinkedHashMap collect1){

       for (int i=0;i<n;i++){
           int r=    random.nextInt(6);
           randomCollectionsOfFigures(r);

       }
       return map;
    }
   /* public Map<String, Figure> ranFig(LinkedHashMap collect1){

    Circle circle = new Circle(new Point(random.nextInt(5)+1,random.nextInt(5)+1),random.nextInt(5)+1);

        ArrayList<Point> quadrilateral = new ArrayList<>(4); //создание трекгольника с рандомными точками
        for (int i = 0; i< 3; i++){
            Point p = new Point(random.nextInt(5)+1,random.nextInt(5)+1);
            quadrilateral.add(p);
        }
        ZamMnog tetragon = new ZamMnog(quadrilateral);

       ArrayList<Point> manyugolnik = new ArrayList<>(k);
        for (int i = 0; i< k; i++){
            Point p = new Point(random.nextInt(5)+1,random.nextInt(5)+1);
            manyugolnik.add(p);
        }

        ArrayList<Point> trianglefig = new ArrayList<>(3); //создание трекгольника с рандомными точками
        for (int i = 0; i< 3; i++){
            Point p = new Point(random.nextInt(5)+1,random.nextInt(5)+1);
            trianglefig.add(p);
        }

        ZamMnog triangle = new ZamMnog(trianglefig);

        ZamMnog mnogougolnik = new ZamMnog(manyugolnik);

        Point po1 = new Point(random.nextInt(100)+2,random.nextInt(100)+2);
        Point po2 = new Point(random.nextInt(100)+2,random.nextInt(100)+2);
        Section section = new Section(po1,po2);

        map.put("Треугольник",triangle);
       map.put("Круг",circle);
        map.put("Многоугольник",mnogougolnik);
        map.put("Четырехугольник",tetragon);
        map.put("Отрезок",section);
        String [] title = {"Треугольник", "Круг", "Многоугольник", "Четырехугольник", "Отрезок"};
        Figure[] titleFigure = {triangle,circle,tetragon,mnogougolnik,section};
        List<String> keys      = new ArrayList<String>(map.keySet());

        System.out.println(kol);
    for (int i = 0; i< kol; i++) {
        String randomKey = keys.get(random.nextInt(keys.size()));
        Figure value = map.get(randomKey);
        collect.put(randomKey, value);
    }
    return collect;
    }*/

    public CollectionOfFigures(LinkedHashMap collect1){
        collect = collect1;
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
