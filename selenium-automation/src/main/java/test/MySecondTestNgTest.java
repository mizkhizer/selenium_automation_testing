package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//  import org.testng.annotations.*;


public class MySecondTestNgTest {
	
	
	@BeforeTest
	public void selectItems()
	{
		System.out.println("Execute this before executing the test case  --->  BeforeTest");
	}
	
	
	@BeforeMethod
	public void selectItems1()
	{
		System.out.println("Execute this before executing each test case    --->  BeforeMethod");
	}
	
	
	
	@Test
	public void selectItems2()
	{
		System.out.println("This is my First Test Case	   --->  Test");	
	}
	
	
	
	@AfterMethod
	public void selectItems3()
	{
		System.out.println("Execute this after executing each test case	  --->  AfterMethod");
	}
	
	@AfterTest
	public void selectItems4()
	{
		System.out.println("Execute this after executing the test case    --->  AfterTest");
	}
	
	
	
	@BeforeSuite
	public void selectItems5()
	{
		System.out.println("Execute this before starting entire proogram      --->  BeforeSuite");
	}
	
	
	
	@BeforeClass
	public void selectItems6()
	{
		System.out.println("Execute this before all test cases in the class    --->  BeforeClass");
	}
	
	
	@AfterClass
	public void selectItems7()
	{
		System.out.println("Execute this after all test cases in the class     --->  AfterClass");
	}
	
	
	
	@AfterSuite
	public void selectItems8()
	{
		System.out.println("Execute this after completing entire proogram     --->  AfterSuite");
	}
	
	
	
}
