package UserValidation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class signUp extends DriverSettings {

	public String firstName = "Indhumathy";
	public String lastName = "Kumar";
	public String contactNumber = "9791330111";
	public String generatedEmail;
	public String password = "123";
	public String confirmPassword = "123";
	public String addressLine1 = "hosa road";
	public String addressLine2 = "hosa road2";
	public String city = "Bangalore";
	public String postalCode = "560100";
	public String state = "karnataka";
	public String country = "India";
	public WebDriver driver;

	// unique email for each test run
	// private String email = "indhumathi.7@gmail.com";
	public String email() {

		String randomString = "";
		int length = 10; // Adjust length as needed
		for (int i = 0; i < length; i++) {
			int randomInt = (int) (Math.random() * 26); // Generate random int between 0 and 25
			char randomChar = (char) (randomInt + 'a'); // Convert to lowercase letter
			randomString += randomChar;
		}
		return "test" + randomString + "@gmail.com";

	}

	@SuppressWarnings("deprecation")
	@Test
	public void Signup() throws Exception {

		String baseUrl = "http://localhost:8080/medicare/";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\dhara\\Browser\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Click signup button

		WebElement signup = driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li[1]/a"));
		Actions actions3 = new Actions(driver);
		actions3.moveToElement(signup).click().build().perform();
		driver.findElement(By.xpath("/html/body/div[2]/nav/div/div[2]/ul[2]/li[1]/a")).click();

		// Enter signup details
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		generatedEmail = email();
		driver.findElement(By.id("email")).sendKeys(generatedEmail);
		driver.findElement(By.id("contactNumber")).sendKeys(contactNumber);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmPassword")).sendKeys(confirmPassword);
		driver.findElement(By.xpath("//*[@id=\'role1\']")).click();

		// Click Next-Billing button
		driver.findElement(By.xpath("//*[@id=\'registerForm\']/div[8]/div/button")).click();

		// Enter Address details
		driver.findElement(By.id("addressLineOne")).sendKeys(addressLine1);
		driver.findElement(By.id("addressLineTwo")).sendKeys(addressLine2);
		driver.findElement(By.name("city")).sendKeys(city);
		driver.findElement(By.id("postalCode")).sendKeys(postalCode);
		driver.findElement(By.id("state")).sendKeys(state);
		driver.findElement(By.id("country")).sendKeys(country);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// click Next-Confirm
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[2]/form/div[7]/div/button[2]"))
				.click();

		// click confirm button
		WebElement confirm1 = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/a"));
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(confirm1).click().build().perform();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[2]/div/div/a")).click();

		
		
		// Login Here button
		WebElement login = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/a"));
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(login).click().build().perform();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div/a")).click();
		
		
	}

}
