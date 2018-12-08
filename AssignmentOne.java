package MavenHomework;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssignmentOne extends AssignmentBaseClass{
	
	@BeforeMethod
	public void setup() {
		setup();
	}
	
	@Test
	public void getTitle() {
		String title=driver.getTitle();
		Assert.assertEquals("Google", title);
	}

}
	
	
