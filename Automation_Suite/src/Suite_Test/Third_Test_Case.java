package Suite_Test;

import org.testng.annotations.Test;

public class Third_Test_Case {

	@Test(groups = "regression")
	public void transport() {
		System.out.println("Transport service");
	}

	@Test(groups = "sanity")
	public void trainManagement() {
		System.out.println("Train Details");
	}

	@Test(groups = "sanity")
	public void scotTrail() {
		System.out.println("scotTrail Services");
	}

}
