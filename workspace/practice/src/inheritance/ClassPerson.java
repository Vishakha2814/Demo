package inheritance;

public class ClassPerson{
	String name;  
    String country; 
    String experience; 
    ClassPerson(String x, String y,String z){
		name = x;    
        country = y;  
        experience = z; 
    }
	public String Getdata() {
		return("ClassEmployee details :"+name+" "+country+" "+experience);
	}
}