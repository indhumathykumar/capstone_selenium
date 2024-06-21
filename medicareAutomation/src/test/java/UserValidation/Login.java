package UserValidation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class Login extends signUp {
	
	
	
	

	@Test(priority=1)
	public void login() 
	{
		System.out.println("Login page");
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(generatedEmail);
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[3]/div/input[2]")).click();

	}

	

}
