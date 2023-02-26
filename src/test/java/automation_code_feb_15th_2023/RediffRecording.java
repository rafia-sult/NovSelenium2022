package automation_code_feb_15th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RediffRecording {
	
	public static WebDriver driver;
	
	@Test
	public void learningRecording() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.findElement(By.className("signin")).click();
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).click();
		driver.findElement(By.id("")).click();

		
	}

}
