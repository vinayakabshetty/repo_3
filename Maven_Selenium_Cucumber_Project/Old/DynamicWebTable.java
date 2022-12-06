package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DynamicWebTable {
	@Test
	public void printAllData() {

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/web-table-element.php");
		driver.manage().window().maximize();
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tr"));

		System.out.println("Number of rows in webtable is : " + rows.size());
		System.out.println("##############################################");

		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> columns = rows.get(i).findElements(By.xpath("//td"));
			System.out.println("Number of columns in row" + i + " is : " + columns.size());
			for (int j = 1; j < columns.size(); j++) {
				String columData = columns.get(j).getText();
				System.out.println("Data in row " + i + " is : " + columData);
			}
			System.out.println("\n");
		}

		driver.quit();
	}
}