package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuySuedeKohler {

	WebDriver driver;
	
	By searchBox=By.xpath("//*[@id='search_txt']");
	By searchButton=By.xpath("//button[@type='submit']");
	By productAdd=By.cssSelector("#configure-product-wrap > button");
	
	public BuySuedeKohler(WebDriver driver)
	{
	   this.driver=driver;		
	}
	public void suedeKohler(){
		driver.findElement(searchBox).sendKeys("Suede Kohler K-6626-6U");
		driver.findElement(searchButton).click();
		driver.findElement(productAdd).click();
	}
}
