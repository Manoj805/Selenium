import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Robot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Manoj\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://hangouts.google.com/");
		driver.manage().window().maximize();
		WebElement T1 = driver.findElement(By.linkText("Sign in"));
		Actions Act = new Actions(driver);
		Act.contextClick(T1).perform();
		
		Robot R = new Robot();
	
		
	}

}
