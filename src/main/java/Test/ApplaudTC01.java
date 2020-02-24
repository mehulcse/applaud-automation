package Test;

import applaud_pages.DashboardPage;
import org.testng.annotations.Test;

public class ApplaudTC01 extends TestBase {

	@SuppressWarnings("null")
	@Test
	public void Vaildated_dashboard_loaded_sucesfully() {
		
	DashboardPage dashboardPage = null;
		
		dashboardPage.CheckforApplaudGiven();
		
		System.out.println("ApplaudGiven option present");
		
		dashboardPage.CheckforApplaudreceived();
		
		System.out.println("Applaudreceived option present");
		
		dashboardPage.ClickonApplaudbutton();
		
		System.out.println("User sent to Applaud page");
		
		dashboardPage.ClickonDashboardbutton();
		
		System.out.println("User sent to Dashboard page");
	}
}
