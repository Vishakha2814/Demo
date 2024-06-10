package example;
	import java.util.*;
	public class ListDemo {
	    public static void main(String[] args) {
	        List al = new ArrayList();
	        al.add("C-DAC");
	        al.add(123);
	        al.add(3.14);
	        al.add(false);
	        al.add(null);
	        al.add(123);
	        al.add(new Student());
	        System.out.println(al);
	        System.out.println(al.size());
	       
	        Iterator itr = al.iterator();
	        while(itr.hasNext()){
	            System.out.println(itr.next());
	        } 
	    }
	}

}
