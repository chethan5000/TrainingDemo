package Mypackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class statsChek {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//chethan//eclipse-workspace//TrainingDemo//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement searchStore = driver.findElement(By.id("small-searchterms"));
		System.out.println(searchStore.isDisplayed());
		
		if(searchStore.isDisplayed() == true)
		{
			System.out.println("webelement searchStore is displayed");
		}
		else
		{
			System.out.println("webelement searchStore is not displayed");
		}
		
		WebElement gender = driver.findElement(By.id("gender-male"));
		System.out.println(gender.isSelected());
		driver.get("http://mphasis.com");
		driver.get("");
		driver.navigate().to("");
		driver.navigate().back();
		
		
		
	}

}
