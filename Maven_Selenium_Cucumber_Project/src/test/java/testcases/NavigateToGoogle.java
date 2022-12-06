package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigateToGoogle {
	@Test
	public void navigateToHomePage() {
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("Finally , Build triggered from Git Push webhook");
		driver.quit();
	}
}