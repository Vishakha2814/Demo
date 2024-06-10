package inheritance;

public class Sub_class extends Super_class{
	int x=10;
	int y=20;
	int z;
	void test2(int x, int y){
		z=x+y;
		System.out.println("From child class");
		System.out.println(z);
	}
}
