package TestNG_attributes;

import org.testng.annotations.Test;

public class DependOnMethods {
	
	
	@Test(groups = {"smoke","Sanity"})
	public void m1() {
		System.out.println("Test1");
	}
	@Test(groups = {"regression"})
	public void m2() {
		System.out.println("Test2");
	}
	@Test(groups= {"regression"})
	public void m3() {
		System.out.println("Test3");
	}
	@Test(groups = {"smoke"})
	public void m4() {
		System.out.println("Test4");
	}

}
