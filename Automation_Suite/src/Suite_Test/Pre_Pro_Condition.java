package Suite_Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Pre_Pro_Condition {

	
	@BeforeSuite
	public static void connect_DB()
	{
		System.out.println("Connect to the Database");
	}
	
	@AfterSuite
	public static void quit_DB()
	{
		System.out.println("Close to the Database");
	}
}
