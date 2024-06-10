package inheritance;

public class TestProgram {

	public static void main(String[] args) {
		ClassEmployee ce = new ClassEmployee("vishakha","India","2 years");
   		ClassEmployee cc = new ClassEmployee("Amar","India","5 years");

  		System.out.println(ce.Getdata());
  		System.out.println(cc.Getdata());
		ClassPerson cp = new ClassPerson("vishu", "India", "2 years");	
		System.out.println(cp.Getdata());	
  		}
}
