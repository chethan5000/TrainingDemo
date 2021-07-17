package Mypackage;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class sortDropdown {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//chethan//eclipse-workspace//TrainingDemo//Driver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[contains(text(),'Live Posting')]")).click();
		WebElement cal =driver.findElement(By.name("category_id"));
		Select sel = new Select(cal);
		
		List<WebElement> options=sel.getOptions();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		ArrayList Olist = new ArrayList();
		
		for(WebElement ele:options) 
		{
			if(ele.getText().equals("Animals & Agriculture")) 
			{
				ele.click();
			}
		}
		
		
	}

}
