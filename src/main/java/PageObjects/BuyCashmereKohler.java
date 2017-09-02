package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BuyCashmereKohler {

	WebDriver driver;
	
	By searchBox=By.xpath("//*[@id='search_txt']");
	By searchButton=By.xpath("//button[@type='submit']");
	By productAdd=By.cssSelector("#configure-product-wrap > button");
	
	public BuyCashmereKohler(WebDriver driver)
	{
	   this.driver=driver;		
	}
	public void cashmereKohler(){
		driver.findElement(searchBox).sendKeys("Cashmere Kohler K-6626-6U");;
		driver.findElement(searchButton).click();
		driver.findElement(productAdd).click();
	}
}
