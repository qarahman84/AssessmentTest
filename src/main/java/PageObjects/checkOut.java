package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkOut {
	
WebDriver driver;
	
	By securechkout=By.xpath("//*[@id='page-content']/div[1]/div[1]/div/section[1]/div/div[3]/div[2]/div/a");
	By guestLogin=By.xpath("//button[@name='guestLoginSubmit']");
	
	
	public checkOut(WebDriver driver)
	{
	   this.driver=driver;		
	}
	public void checkoutProcess() throws InterruptedException{
		driver.findElement(securechkout).click();
		Thread.sleep(3000);
		driver.findElement(guestLogin).click();
		
	}

}
