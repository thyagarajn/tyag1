package appfunctions;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import pages.Tasks;
import utility.Screenshots;
import utility.Waitingstatments;

public class Appfunctions 
{
	WebDriver driver;
    public Appfunctions (WebDriver driver)
    {
    	this.driver=driver;
    }
    //flow of the application
	public void createcustomer() throws IOException
	{
		Tasks  tsk=new Tasks(driver);
		tsk.tasks().click();
		new Waitingstatments().implicit_wait(5, driver,tsk.project_customer() );
		tsk.project_customer().click();
		new Waitingstatments().implicit_wait(5, driver,tsk.create_new_customer());
		tsk.create_new_customer().click();
		tsk.name().sendKeys("abc");
		tsk.description().sendKeys("xyz");
		tsk.create_customer().click();
		new Screenshots().get_window_screenshot(driver);
	}
	
	
	
}
