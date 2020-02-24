package Test;

import org.testng.annotations.Test;

import applaud_pages.Applaudpage;
import applaud_pages.DashboardPage;

public class ApplaudTC02 extends TestBase {

	@SuppressWarnings("null")
	@Test
	public void Vaildated_dashboard_loaded_sucesfully() {
	
		DashboardPage dashboardPage = null;
		Applaudpage applaudpage = null;
		
		dashboardPage.ClickonDashboardbutton();
		
		dashboardPage.ClickonApplaudbutton();
		
		applaudpage.SelectUser();
		
		applaudpage.SelectCard();
		
		applaudpage.SelectClaps();
		
		applaudpage.EnterMessage();
		
		applaudpage.ClickonSendButton();
		
	}
}
