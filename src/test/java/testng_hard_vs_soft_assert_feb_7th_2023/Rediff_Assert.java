package testng_hard_vs_soft_assert_feb_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_Assert {

	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

	@Test
	public void clickOnLoginTest() {
		String actualTitle = "Rediffmail";
		String expectedTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//a[@class=\"signin\"]")).click();
	}

	@Test
	public void enterCredentialsTest() {
		String actualTitle = "[Rediff.com: News | Rediffmail | Stock Quotes | Shopping]";
		String expectedTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//a[@class=\"signin\"]")).click();
		
		//title will change here use the new title and new current url 
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();

	}
	
	@Test
	public void logOutTest() throws InterruptedException {
		// find some web element inside the inbox page and validate using assert 
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rd_logout")).click();
		
		String logoutConfirmationMessage = "You have successfully signed out of Rediffmail.";
		WebElement confirmation = driver.findElement(By.xpath("//p[text()='You have successfully signed out of Rediffmail.']"));
		Assert.assertEquals(confirmation.getText(), logoutConfirmationMessage);

		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
	}
	
	@Test 
	public void validateLogoutPageTest() throws InterruptedException {
		//successfully logged out - message 
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.className("rd_logout")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(),'Rediff Home')]")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
