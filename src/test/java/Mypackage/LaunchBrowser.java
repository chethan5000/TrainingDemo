package Mypackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//chethan//eclipse-workspace//TrainingDemo//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://frontend.nopcommerce.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
