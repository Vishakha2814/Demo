package example;


import java.util.*;
public class SetDemoEx {
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
/*-----
package collections;
import java.util.*;
public class SetDemo {
    public static void main(String[] args) {
        //MyComparator mycomp = new MyComparator();
        //TreeSet<String> names = new TreeSet(mycomp); 
        
        TreeSet<String> names = new TreeSet(new MyComparator()); //
        names.add("Virat");
        names.add("Hardik");
        names.add("Rishi Sanak");
        names.add("Murty");
        names.add("Java");
        
        System.out.println(names);
        Iterator<String> itr = names.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
class MyComparator implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String)o1;
        String s2 =(String)o2;
        return s2.compareTo(s1); // DESC
    }
    
}
----*/
/*-----------------------
package collections;
import java.util.*;
public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap();
        m.put(101, "XYZ");
        m.put(111, "ASDF"); // replaced
        m.put(110, "QWERTY");
        m.put(119, "XYZ");
        m.put(198, "PQR");
        m.put(111, "MNK");
        
        System.out.println(m);
        Collection ks = m.keySet();
        System.out.println(ks);
        Collection v = m.values();
        System.out.println(v);
        
        Set s = m.entrySet(); //
        
        Iterator itr = s.iterator();
        while(itr.hasNext()){
            Map.Entry m1 = (Map.Entry) itr.next();
            System.out.println(m1.getKey()+"  "+m1.getValue());
        }
        
        
    }
}
-------------------------------------------*/