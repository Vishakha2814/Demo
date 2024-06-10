package example;


import java.util.*;
public class WildCardDemo {
    
    public static void print(List<? extends Object> list){  // unbounded wild card
    for(Object obj:list){
        System.out.println(obj);
    }
     
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);   
        print(list); //
       
    }
}
/*---------------------------------------
from CDAC Hyderabad to everyone:    11:57 AM
package generics;
import java.util.*;
public class WildCardDemo {
    
    public static void print(List<? super Integer> list){  // unbounded wild card
    for(Object obj:list){
        System.out.println(obj);
    }
    }
    public static void main(String[] args) {
        List<Object> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);   
        print(list); //
       
    }
}
----------------------------*/
