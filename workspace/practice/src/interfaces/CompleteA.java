package interfaces;
@FunctionalInterface
public interface CompleteA {
	public void x();
	
	default void exam(){
		System.out.println(200);
	}
	default void exam1(){
		System.out.println(300);
	}
	default void exam2(){
		System.out.println(400);
	}
}