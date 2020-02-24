package applaud_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Applaudpage {

	WebDriver driver;
	
	@FindBy(xpath = "@FindBy(xpath = \"//img[@class='jss329']\") WebElement Applauedlogo;") WebElement SelectUser;
	@FindBy(id="aboveBeyond") WebElement AboveBeyondCard; 
	@FindBy(id = "congrats") WebElement CongratsCard;
	
	@FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-8']//div[3]") WebElement Clap;
	@FindBy(xpath = "//textarea[@placeholder='Say nice things']") WebElement TextArea;
	@FindBy(xpath = "//span[contains(text(),'Send')]") WebElement Sendbutton;
	@FindBy(xpath = "//span[contains(text(),'Cancel')]") WebElement Cancelbutton;

	
	public void SelectUser() {
		SelectUser.click();
		SelectUser.sendKeys("Nick Stice");
		
	}
	
	public void SelectCard() {
		AboveBeyondCard.click();
		
	}
	
	public void SelectClaps() {
		Clap.click();
		
	}
	
	public void EnterMessage() {
		TextArea.click();
		TextArea.sendKeys("you are awesome");
		
	}
	
	public void ClickonSendButton() {
		Sendbutton.click();
		
	}
	
	public void ClickonCancelButton() {
		Cancelbutton.click();
		
	}
	
}

