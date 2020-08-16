package seleniumConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserOpening {

	public static void main(String[] args) {

		// Property of chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Invoking the browser
		driver.get("https://www.google.com");

		// for getting tittle of the page
		String Tittle = driver.getTitle();
		System.out.println(Tittle);

		// for validation
		if (Tittle.equals("Google")) {
			System.out.println("Validation sucessfull");
		} else
			System.out.println("In-correct validation");

//		 page source
//		String PageSource = driver.getPageSource();
//		System.out.println(PageSource);

		driver.quit();
	}

}
