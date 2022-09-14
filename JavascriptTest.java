package simplilearn;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavascriptTest {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
				
	    JavascriptExecutor jse =(JavascriptExecutor)driver;
	    jse.executeScript("document.getElementById('email').value='abcdefg@xyz.com'");
	    Thread.sleep(2567);

	    
	    driver.quit();
	}

}
