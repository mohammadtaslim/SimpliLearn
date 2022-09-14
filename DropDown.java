package simplilearn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select option1 = new Select(driver.findElement(By.id("option2")));
		//month.selectByIndex(3);
		option1.deselectByIndex(2);
		
		
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
		}

}
