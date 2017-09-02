package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class inputInfo {

	WebDriver driver;
	
	By firstName=By.id("shippingfirstname");
	By lastName=By.id("shippinglastname");
	By streetAdd=By.id("shippingaddress1");
	By zipcode=By.id("shippingpostalcode");
	By city=By.id("shippingcity");
	By stateselect=By.id("shippingstate_1");
	By stateName=By.xpath("//option[text()='California']");
	By countryselect=By.id("shippingcountryID");
	By countryName=By.xpath("//option[text()='United States']");
	By phoneNumber=By.id("shippingphonenumber");
	By email=By.id("emailAddress");
	By creditCardNum=By.id("creditCardNumber");
	By monthclick=By.id("creditCardMonth");
	By monthSelect=By.xpath("//select[@id='creditCardMonth']/option[text()='12']");
	By yearclick=By.id("creditCardYear");
	By yearSelect=By.xpath("//select[@id='creditCardYear']/option[text()='2020']");
	By nameOncard=By.id("creditcardname");
	By securityCode=By.id("creditCardCVV2");
	By reviewOrder=By.xpath("//*[@id='creditcard']/div[3]/input");
	
	public inputInfo(WebDriver driver)
	{
	   this.driver=driver;		
	}
	public void orderInfo(){
		driver.findElement(firstName).sendKeys("Mahbubur");
		driver.findElement(lastName).sendKeys("Rahman");
		driver.findElement(streetAdd).sendKeys("1010 Street Dr");
		driver.findElement(zipcode).sendKeys("90005");
		driver.findElement(city).sendKeys("Los Angeles");
		driver.findElement(stateselect).click();
		driver.findElement(stateName).click();
		driver.findElement(countryselect).click();
		driver.findElement(countryName).click();
		driver.findElement(phoneNumber).sendKeys("9176598290");
		driver.findElement(email).sendKeys("abc@gmail.com");
		driver.findElement(creditCardNum).sendKeys("4111111111111111");
		driver.findElement(monthclick).click();
		driver.findElement(monthSelect).click();
		driver.findElement(yearclick).click();
		driver.findElement(yearSelect).click();
		driver.findElement(nameOncard).sendKeys("Mahbubur Rahman");
		driver.findElement(securityCode).sendKeys("111");
		driver.findElement(reviewOrder).click();
		
	}

}
