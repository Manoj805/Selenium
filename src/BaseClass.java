import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public void getBrowser(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", 
						"D:\\Manoj\\Selenium\\Driver\\chromedriver.exe");
				 driver=new ChromeDriver();
				
			}else if (browsername.equalsIgnoreCase("Edge")) {
				System.setProperty("webdriver.edge.driver", 
						"D:\\Manoj\\Selenium\\Driver\\msedgedriver.exe");
				 driver = new EdgeDriver();
			}else {
				System.out.println("Invalid browsername");
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		

	}
	
}
