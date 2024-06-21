package NegativeScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LoginIncorrectly

{

	public WebDriver driver;

	@Test
	public void incorrectLogin() {
		String baseUrl = "http://localhost:8080/medicare/";
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhara\\Browser\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);

		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\'login\']/a"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(loginBtn).click().build().perform();
		loginBtn.click();// login button

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("indhumathi.7@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/div/input[2]")).click();

		System.out.println("Logged incorrectly");
		driver.close();
		driver.quit();

	}
}
