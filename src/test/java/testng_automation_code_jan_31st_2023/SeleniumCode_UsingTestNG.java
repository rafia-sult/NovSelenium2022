package testng_automation_code_jan_31st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SeleniumCode_UsingTestNG {

	public WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

	@Test(priority = 1)
	public void clickOnSignInLink() {
		driver.findElement(By.linkText("Sign in")).click();
	}

	@Test(priority = 2)
	public void clickOnMoneyLink() {
		driver.findElement(By.linkText("Money")).click();
	}

	@Test(priority = 3)
	public void clickOnRediffMailLink() {
		driver.findElement(By.linkText("Rediffmail")).click();
	}

	@Test(priority = 4)
	public void clickOnBusinessEmailLink() {
		driver.findElement(By.linkText("Business Email")).click();
	}

	@Test(priority = 5)
	public void clickOnVideosLink() {
		driver.findElement(By.linkText("Videos")).click();
	}

	@Test(priority = 6)
	public void clickOnShoppingLink() {
		driver.findElement(By.linkText("Shopping")).click();
	}

	@Test(priority = 7)
	public void clickOnCreateAccountLink() {
		driver.findElement(By.linkText("Create Account")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
