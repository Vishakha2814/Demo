package example;
import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        
        Set s = new HashSet();
        s.add("C-DAC");
        s.add("HW Park");
        s.add("Hyderabad");
        s.add(501510);
        s.add("C-DAC"); // ignores
        s.add(null);
        s.add(true);
        s.add(17.4);
        s.add(new Student(123,"ABC"));
        System.out.println(s);
        
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

