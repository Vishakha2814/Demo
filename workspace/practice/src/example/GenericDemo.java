package example;

package generics;
public class GenericDemo {
    public static void main(String[] args) {
        MyGenClass<Integer> m1 = new MyGenClass<>();
        m1.setData(199139);
        System.out.println(m1.getData());
        MyGenClass<String> m2 = new MyGenClass<>();
        m2.setData("C-DAC");
        System.out.println(m2.getData());
        
    }
}
class MyGenClass<T>{
    private T data;
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
}


/*----------
public class GenMethodDemo {
    public static <E> void print(E[] arr){
        for(E ele:arr)
           System.out.print(" "+ele+" ");
        
        System.out.println();
    }
    public static void main(String[] args) {
        Integer[] a = {12, 34, 45, 67, 89, 21, 54, 78};
        Character[] ch = {'C', 'D', 'A', 'C'};
        String[] s = {"DAC","DBDA","DASSD","DESD", "DITISS"};
        print(a);
        print(ch);
        print(s);
    }
}
----------------------------*/