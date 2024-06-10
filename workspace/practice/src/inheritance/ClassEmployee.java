package inheritance;

public class ClassEmployee extends ClassPerson{
	String name;  
    String country; 
    String experience; 
    ClassEmployee(String x,String y,String z){
    	super(x, y, z);
    	name = x;    
        country = y; 
        experience = z; 
    }

    public String Getdata(){
        	super.Getdata();
        	return("ClassEmployee details :"+name+" "+country+" "+experience);
        }
	}
