


	package TestNGAnnotations;

	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Module4 {
		@BeforeClass     //this will execute before module i.e. before n no. of test cases (Pre Class)
		public void beforeclass()
		{
			System.out.println("M4 Before Class");
		}
		@AfterClass      //execute at the end of module(Post Class)
		public void afterClass()
		{
			System.out.println("M4 After Class");
		}
		@BeforeMethod               //always executes before each test case   (Precondiotion)
		public void beforeMethod()
		{
			System.out.println("M4 Before Method");
		}
		@AfterMethod
		public void Aftermethod()
		{
			System.out.println("M4 After Method");
		}
		@Test (priority=1)                          
		public void test1(){
			System.out.println("M4 test1");
			
		}
			@Test(priority=0)
		public void atest2(){
			System.out.println("M4 test2");
			
		}
			@Test(priority=2) 
		public void test3(){
			System.out.println("M4 test3");
			
		}
			@Test(priority=3) 
		public void test4(){
			System.out.println("M4 test4");
			
		}
	}


