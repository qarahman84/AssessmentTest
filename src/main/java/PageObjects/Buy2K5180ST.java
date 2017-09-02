package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Buy2K5180ST {

	WebDriver driver;
	
	By searchBox=By.xpath("//*[@id='search_txt']");
	By searchButton=By.xpath("//button[@type='submit']");
	By productNum=By.xpath("//*[@id='main-product-quantity']/div/input");
	By productAdd=By.cssSelector("#add-to-cart-wrap > button");
	
	public Buy2K5180ST(WebDriver driver)
	{
	   this.driver=driver;		
	}
	public void a2K5180ST(){
		driver.findElement(searchBox).sendKeys("Kohler K-5180-ST");;
		driver.findElement(searchButton).click();
		driver.findElement(productNum).sendKeys(Keys.HOME,Keys.chord(Keys.SHIFT,Keys.END),"2");
		driver.findElement(productAdd).click();
	}
}