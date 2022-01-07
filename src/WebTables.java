import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Manoj\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		List<WebElement> Data = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
		for (WebElement all : Data) {
			System.out.println(all.getText());
			
		}
		// particular row
		List<WebElement> row = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[6]/td"));
		for (WebElement r : row) {
			System.out.println(r.getText());	
		}
		//particular column(header)
		List<WebElement> Column = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th[2]"));
		for (WebElement c : Column) {
			System.out.println(c.getText());
			}
		//particular column and particular column value
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]"));
		for (WebElement col : findElements) {
			System.out.println(col.getText());
			
		}
		//particular data
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]"));
		System.out.println(data.getText());
		List<WebElement> totalrows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		for (WebElement rows : totalrows) {
			System.out.println(rows.getText());
			
		}
		//No of rows,columns
		int rowcount=driver.findElements(By.xpath("//table[@id='customers']//tr")).size();
		int colcount=driver.findElements(By.xpath("//table[@id='customers']//th")).size();
	}
	
}
