package Test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import PageObjects.Buy2K5180ST;
import PageObjects.BuyCashmereKohler;
import PageObjects.BuySuedeKohler;
import PageObjects.checkOut;
import PageObjects.inputInfo;
import UtilityPackage.browserName;

public class mainExecution {
	WebDriver driver;

	@Test
	public void mainTest() throws Throwable{
		
		//Start at the home page of www.build.com
		driver=browserName.startBrowser("chrome", "https://www.build.com/");
		Thread.sleep(5000);
		driver.findElement(By.id("newsletterPopupEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("submitEmailModal")).click();
		
		Thread.sleep(5000);
		//Add one Suede Kohler K-6626-6U to the cart
		BuySuedeKohler sueKohler=new BuySuedeKohler(driver);
		sueKohler.suedeKohler();
		    
		Thread.sleep(5000);
		//Add one Cashmere Kohler K-6626-6U to the cart
		BuyCashmereKohler cashKohler=new BuyCashmereKohler(driver);
		cashKohler.cashmereKohler();
			
		Thread.sleep(5000);
		//Add two Kohler K-5180-ST to the cart
		Buy2K5180ST k5180ST=new Buy2K5180ST(driver);
		k5180ST.a2K5180ST();
		  
		Thread.sleep(5000);
		//Begin the Checkout flow and stop on the Review and Delivery page (use 4111111111111111 as the test credit card number)
		checkOut ck=new checkOut(driver);
		ck.checkoutProcess();
		       
		Thread.sleep(5000);
		//Input Info to Ckeckout
		inputInfo input=new inputInfo(driver);
		input.orderInfo();
		
		//Assert that the CA Tax & Grand Total are correct
		String taxamount=driver.findElement(By.id("taxAmount")).getText();
		String grandTotal=driver.findElement(By.id("grandtotalamount")).getText();
		
		AssertJUnit.assertEquals(taxamount, "$47.88");
		AssertJUnit.assertEquals(grandTotal, "$708.25");
	}
	//@AfterMethod
	public void closeOut(){
		driver.quit();
	}
}