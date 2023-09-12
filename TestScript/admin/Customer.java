package admin;

import org.testng.annotations.Test;

import base.Webbase;


public class Customer extends Webbase
{

	@Test
	public void createcustomer() throws InterruptedException
	{
		Thread.sleep(3000);
		System.out.println("create customer");
	}
	
}
