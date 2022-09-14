package simplilearn;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();

		        driver.get("https://www.facebook.com/");
		        System.out.println(System.getProperty("user.dir"));
				
				
				 File sourceFile = (( TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				 String currentDir =(System.getProperty("user.dir"));
				  FileUtils.copyFile(sourceFile, new File("fblogin.png"));
				  driver.quit();
	}

}
