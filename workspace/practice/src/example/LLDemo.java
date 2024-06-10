package example;
import java.util.*;
public class LLDemo {
    public static void main(String[] args) {
        List<String> l = new LinkedList();
        
        l.add("sachin");
        l.add("saurabh");
        l.add("yuvi");
        l.add("dhoni");
        l.add("zaheer");
        
        System.out.println(l);
        
        ListIterator<String> litr = l.listIterator();
        
        while (litr.hasNext()) {
            String s =  litr.next();
            
            if (s.equals("zaheer")) {
                litr.remove();
            }
            if (s.equals("sachin")) {
                litr.set("Virat");
            }
        }
        System.out.println(litr.previous());
        
        System.out.println(l);
    }
}

