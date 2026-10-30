package Suite_Test;

import org.testng.annotations.Test;

public class First_Test_Case extends Pre_Pro_Condition {

	@Test(groups = "sanity")
	public void doRegistration() {
		System.out.println("Registration successfull");
	}

	@Test(groups = "regression")
	public void employeeDetail() {
		System.out.println("Employee Details");
	}

}
