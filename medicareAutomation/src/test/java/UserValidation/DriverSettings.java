package UserValidation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSettings {
	// public driver;

	public static void openChrome() {
		String baseUrl = "http://localhost:8080/medicare/";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhara\\Browser\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
	}

}
