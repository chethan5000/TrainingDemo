package Mypackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drpdown {

	public static void main(String[] args) throws AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//chethan//eclipse-workspace//TrainingDemo//Driver//chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		//driver.get("http://automationpractice.com/index.php");
		//driver.get("https://demo.nopcommerce.com/register");
		//System.out.println("CRCRCRCR");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//System.out.println("come in");
		js.executeScript("scroll(0, 750);");
		//System.out.println("come out");
		
		//driver.close();
		
		
		
		//WebElement country=driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[11]/td[2]/select"));
		
		//Select curr = new Select(curreny);
		


	}

}
