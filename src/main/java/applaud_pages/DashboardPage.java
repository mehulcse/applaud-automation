package applaud_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Test.TestBase;

public class DashboardPage extends TestBase{
	
	WebDriver driver;
	String url = "http://thegeekstribe.com/applaud";
	
	@FindBy(xpath = "//img[@class='jss329']") WebElement Applauedlogo;
	@FindBy(xpath = "//p[contains(text(),'Applaud Received')]") WebElement Applaudreceived;
	@FindBy(xpath = "//p[contains(text(),'Applaud Given')]") WebElement ApplaudGiven;
	@FindBy(xpath = "//span[contains(text(),'Applaud')]") WebElement Applaudbutton;
	@FindBy(xpath = "//span[contains(text(),'Dashboard')]") WebElement Dashboardbutton;

	public void GoToApplaud() {
		
        driver.get(url);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
    }

	
	public void ClickonDashboardbutton() {
		Dashboardbutton.click();
	}
	

	public void ClickonApplaudbutton() {
		Applaudbutton.click();
	}
	

	public void CheckforApplaudreceived() {
		Applaudreceived.isDisplayed();
	}
	

	public void CheckforApplaudGiven() {
		ApplaudGiven.isDisplayed();
	}
	
}
