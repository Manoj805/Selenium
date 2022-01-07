import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"D:\\Manoj\\Selenium\\Driver\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("80562522");
		driver.findElement(By.id("password")).sendKeys("Manoj@123");
		driver.findElement(By.name("login")).click();
		WebElement Location = driver.findElement(By.id("location"));
		Select s1 =new Select(Location);
		s1.selectByVisibleText("Adelaide");
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select s2 =new Select(hotels);
		s2.selectByVisibleText("Hotel Sunshine");
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s3 =new Select(roomtype);
		s3.selectByVisibleText("Deluxe");
		WebElement count = driver.findElement(By.id("room_nos"));
		Select s4 = new Select(count);
		s4.selectByIndex(3);
		WebElement Adultroom = driver.findElement(By.name("adult_room"));
		Select s5 = new Select(Adultroom);
		s5.selectByIndex(3);
		WebElement Chilroom = driver.findElement(By.name("child_room")); 
		Select s6 = new Select(Chilroom);
		s6.selectByIndex(2);
		driver.findElement(By.name("Submit")).click();
		driver.findElement(By.name("radiobutton_0")).click();
		driver.findElement(By.name("continue")).click();
		driver.findElement(By.name("first_name")).sendKeys("Manoj");
		driver.findElement(By.name("last_name")).sendKeys("S");
		driver.findElement(By.name("address")).sendKeys("No:28th cross road,chennai");
		driver.findElement(By.name("cc_num")).sendKeys("1234567812345678");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		Select s7=new Select(cardtype);
		s7.selectByValue("VISA");
		WebElement Emonth = driver.findElement(By.id("cc_exp_month"));
		Select s8 = new Select(Emonth);
		s8. selectByIndex(10);
		WebElement Eyear = driver.findElement(By.name("cc_exp_year"));
		Select s9= new Select(Eyear);
		s9.selectByIndex(12);
		driver.findElement(By.name("cc_cvv")).sendKeys("233");
		driver.findElement(By.name("book_now")).click();
		driver.findElement(By.name("search_hotel")).click();

	}

}
