package my.figures;

import java.util.*;

public class collectionOfFigures {


    final Random random = new Random();
    int n =   random.nextInt(20);
    Map<String, Figure> map = new HashMap<>(n);

    int v=1;
    int m=1;
    int x=1;
    int d=1;
    int q=1;

    public Figure cikl(int n) {
        ArrayList<point> figure = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            point p = new point(random.nextInt(5) + 1, random.nextInt(5) + 1);
            figure.add(p);
        }
        AbstractMnog elFigure = new ZamMnog(figure);
        return elFigure;
    }

    public void randomCollectionsOfFigures(int k) {

     String[] NameOfFigure = {"Круг", "Отрезок", "Треугольник", "Четырехугольник", "Многоугольник"};


        switch (k) {
            case 0:
                Circle circle = new Circle(new point(random.nextInt(5) + 1, random.nextInt(5) + 1), random.nextInt(5) + 1);
                map.put(NameOfFigure[k]+m, circle);

                m++;System.out.println(k);
                break;

            case 1:
                point po1 = new point(random.nextInt(100) + 2, random.nextInt(100) + 2);
                point po2 = new point(random.nextInt(100) + 2, random.nextInt(100) + 2);
                Section section = new Section(po1, po2);
                map.put(NameOfFigure[k] + x, section);
                x++;System.out.println(k);
                break;

            case 2:
                map.put(NameOfFigure[k]+q, cikl(3));
                System.out.println(k);
                q++; System.out.println(cikl(k));
                break;

            case 3:
                map.put(NameOfFigure[k]+v, cikl(4));

                v++;
                System.out.println(k);
                System.out.println(cikl(k));
                break;

            case 4:
                map.put(NameOfFigure[4]+d, cikl(k));
                d++;
                System.out.println(cikl(k));System.out.println(k);
                break;

            default:
                    System.out.println("ятуть");
                    break;

        }


    }

    public Map<String, Figure> createRandomCollection(LinkedHashMap collect1){

       for (int i=0;i<n;i++){
           int r=    random.nextInt(4);
                 randomCollectionsOfFigures(r);
       }
       return map;
    }

    public collectionOfFigures(LinkedHashMap<String, Figure> collect1){
        map = collect1;
    }

    @Override
    public String toString(){
 String s="";
        for (Map.Entry entry : map.entrySet())
            s = s + "Key: " + entry.getKey() + " Value: "
                    + entry.getValue() + "; ";
    return s;
    }

    public void deleteFigure (String s, Figure f){
        map.remove(s, f);
    }

    public void addFigure (String s, Figure f){
    map.put(s, f);
    }

}
