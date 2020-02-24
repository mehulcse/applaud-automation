package Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {

	
WebDriver driver=null;
	
	String url = "http://thegeekstribe.com/dashboard";
	
	
	
	
	@BeforeTest
	public void setUpTest() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		
	}

	


	@AfterTest
	public void tearDownTest() {
		
		
				driver.close();
				driver.quit();
				System.out.println("Test Completed Successfully");
		
	}
	
	
}
