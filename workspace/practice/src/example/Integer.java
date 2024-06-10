package example;

public class Integer{ 
    static int num1;
    static int num2;

    static int Add(int a, int b){
        int sum = a + b;
    System.out.println("sum = "+ sum);
	return sum;
    }
  
    public static void main(String args[]) {
        Integer intval = new Integer();
      
            intval.num1 = 20;
            intval.num2 = 10;
      
        System.out.println(intval.num1);
        System.out.println(intval.num2);
        System.out.println(Add(num1, num2));
  }
}  