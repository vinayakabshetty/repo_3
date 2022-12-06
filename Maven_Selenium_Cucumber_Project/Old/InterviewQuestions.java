package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class InterviewQuestions {
	
	@Test
	public void EnterTextWithoutSendKeys() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://phptravels.org/login");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('inputEmail').value='sample email id'");
		js.executeScript("document.getElementById('inputPassword').value='sample password'");
		
		Thread.sleep(5000);
		driver.quit();

	}
	
	@Ignore
	@Test
	public void selectDropDownWithoutSelectClass() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dropdown");
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		List<WebElement> dropDownOptions = driver.findElements(By.xpath("//select[@id='dropdown']"));
		for(WebElement x : dropDownOptions) {
			System.out.println(x.getText());
		}
		
		Thread.sleep(5000);
		driver.quit();

	}
}
