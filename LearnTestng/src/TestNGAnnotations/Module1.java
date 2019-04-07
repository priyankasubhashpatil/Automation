


	package TestNGAnnotations;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.BeforeSuite;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

	public class Module1 {
		@BeforeSuite
		public void beforeSuite()
		{
			System.out.println("Before Suite");
		}
		@AfterSuite
		public void afterSuite()
		{
			System.out.println("After Suite");
		}
		@BeforeTest
		public void beforeTest()
		{
			System.out.println("Before Test1");
		}
		@AfterTest
		public void afterTest()
		{
			System.out.println("After Test1");
		}
		@BeforeClass     //this will execute before module i.e. before n no. of test cases (Pre Class)
		public void beforeclass()
		{
			System.out.println("M1 Before Class");
		}
		@AfterClass      //execute at the end of module(Post Class)
		public void afterClass()
		{
			System.out.println("M1 After Class");
		}
		@BeforeMethod               //always executes before each test case   (Precondiotion)
		public void beforeMethod()
		{
			System.out.println("M1 Before Method");
		}
		@AfterMethod
		public void Aftermethod()
		{
			System.out.println("M1 After Method");
		}
		@Test (priority=1)                          
		public void test1(){
			System.out.println("M1 test1");
			
		}
			@Test(priority=0)
		public void atest2(){
			System.out.println("M1 test2");
			
		}
			@Test(priority=2) 
		public void test3(){
			System.out.println("M1 test3");
			
		}
			@Test(priority=3) 
		public void test4(){
			System.out.println("M1 test4");
			
		}

	}


	
