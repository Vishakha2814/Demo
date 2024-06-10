package polymorphism;

public class Goldaccount extends Silveraccount{
	@Override
	public void cheqbook() {
		System.out.println("unlimited cheqbook/year");
	}
	@Override
	public void rate_of_interest(){
		System.out.println("4% p/a");
	}
	public static void main(String[] args) {
		Goldaccount g = new Goldaccount();
		g.cheqbook();
		g.rate_of_interest();
		
		System.out.println("___________________________");
		
		Silveraccount s = new Silveraccount();
		s.onlinebanking();
		s.cheqbook();
		s.rate_of_interest();

	}

}
