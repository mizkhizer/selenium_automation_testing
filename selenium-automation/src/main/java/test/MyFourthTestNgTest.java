package test;


import org.testng.annotations.Test;


public class MyFourthTestNgTest {

	@Test
	public void selectItems()
	{
		System.out.println("My First TestNG case");	
	}
	
	
	
	@Test (enabled = true)
	public void selectItems1()
	{
		System.out.println("My Second TestNG case");	
	}
	
	
	@Test (enabled = false)
	public void selectItems2()
	{
		System.out.println("My Third TestNG case");	
	}
	
	
	@Test (invocationCount = 3)
	public void selectItems3()
	{
		System.out.println("My Fourth TestNG case");	
	}
}
