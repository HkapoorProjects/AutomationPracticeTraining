package seleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleSearch {

	public static void main(String[] args) throws Exception {

		// Setting the Web browser and giving the path of chrome driver
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// Open URL
		driver.get("https://www.Google.com/");

		WebElement Text=driver.findElement(By.name("q"));
		Text.sendKeys("Harshil");
		Text.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.quit();



	}

}
