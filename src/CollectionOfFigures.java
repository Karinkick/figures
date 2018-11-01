import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CollectionOfFigures {
HashMap<String,Figure> collect;

public void RanFig(){

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
