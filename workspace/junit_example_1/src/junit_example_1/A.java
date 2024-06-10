package junit_example_1;

import org.junit.*;

public class A {
	
	@Test
	public void test1(){
		System.out.println(1000);
	}
	
	@Test
	public void test2(){
		System.out.println(10);
	}
	
	@Before
	public void BeforeTest(){
		System.out.println("Before Test");
	}
	
	@After
	public void AfterTest(){
		System.out.println("After Test");
	}
	
	@BeforeClass
	public static void BeforeClass(){
		System.out.println("Before class");
	}
	
	@AfterClass
	public static void AfterClass(){
		System.out.println("After class");
	}
}
