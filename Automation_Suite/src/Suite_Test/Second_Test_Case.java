package Suite_Test;

import org.testng.annotations.Test;

public class Second_Test_Case extends Pre_Pro_Condition {

	@Test(groups = "regression")
	public void do_Login() {
		System.out.println("Loginn successfull");
	}

	@Test(groups = "sanity")
	public void busMangement() {
		System.out.println("Bus Management");
	}
}
