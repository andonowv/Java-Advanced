package GenericBoxOfInteger;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List <T> elements;

    public Box(){
        this.elements = new ArrayList<>();
    }

    public  void add (T elements){
        this.elements.add(elements);
    }

    @Override
    public  String toString(){
        StringBuilder sb = new StringBuilder();
        for (T element : elements) {
            sb.append(String.format("%s: %s", element.getClass().getName(), element));
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}
