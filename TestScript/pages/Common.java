package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Common
{
    WebDriver driver;
	
	@FindBy(className ="logout")
	private WebElement logout;
	
	public WebElement logout()
	{
		return logout;
	}
	
	 public	Common(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

}
