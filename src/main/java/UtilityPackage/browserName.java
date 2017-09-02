package UtilityPackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class browserName {

	static WebDriver driver;
	
	public static WebDriver startBrowser(String browser, String url)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "//Users//mahbuburrahman//Downloads//chromedriver 2");
		driver= new ChromeDriver(options);	
	
		}else if(browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "//Users//mahbuburrahman//Desktop//GeckoDriver//geckodriver");
		driver=new FirefoxDriver();
		
		}else if(browser.equalsIgnoreCase("IE")){
		driver=new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		return driver;
	}	
}
