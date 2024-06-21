package UserValidation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AddTwoProducts extends AddProducts {
	@Test(priority = 3)
	public void addTwoProd() {

		// continue shopping
		driver.findElement(By.xpath("/html/body/div/div[1]/div/div[4]/a")).click();

		// Adding Aceclofenac
		WebElement aceclofenac = driver.findElement(By.xpath("//*[@id=\'productListTable\']/tbody/tr[4]/td[6]/a[2]"));
		Actions clickAceclofenac = new Actions(driver);
		clickAceclofenac.moveToElement(aceclofenac).click().build().perform();		
		aceclofenac.click();
		
		
		// checkout
		WebElement checkoutNextProd = driver.findElement(By.xpath("//*[@id=\'cart\']/tfoot/tr[2]/td[4]/a"));
		Actions checkAceclofenac = new Actions(driver);
		checkAceclofenac.moveToElement(checkoutNextProd).click().build().perform();	
		checkoutNextProd.click();
		
		// select shipping address
				WebElement confirmAddress = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/div/div/a"));
				Actions select = new Actions(driver);
				select.moveToElement(confirmAddress).click().build().perform();
				confirmAddress.click();
				System.out.println("Address selected");
				// payment details

				WebElement cardNum = driver.findElement(By.xpath("//*[@id=\'cardNumber\']"));
				cardNum.sendKeys("123");

				WebElement expiryMonth = driver.findElement(By.xpath("//*[@id=\'expityMonth\']"));
				expiryMonth.sendKeys("123");

				WebElement cvCode = driver.findElement(By.xpath("//*[@id=\'cvCode\']"));
				cvCode.sendKeys("123");

				WebElement pay = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[2]/a"));
				pay.click();
				
				System.out.println("2nd prod order confirmed");
				driver.close();
				driver.quit();


	}

}
