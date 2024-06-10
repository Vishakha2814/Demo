package junit_example_1;

import junit.framework.Assert;

public class AddTest {
	
	public void addTest1() {
		Add a = new Add();
		int actualvalue = a.addnumbers(10, 20);
		Assert.assertEquals(30, actualvalue);
	}

}