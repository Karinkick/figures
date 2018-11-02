import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CollectionOfFigures {
HashMap<String,Figure> collect;

public void ranFig(){
    ArrayList points3 = new ArrayList();
    ZamMnog z = new ZamMnog(points3);
    Circle k = new Circle(3);
        HashMap<String, Figure> map = new HashMap<String, Figure>();
        map.put("Треугольник",z);
        map.put("Круг",k);
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
