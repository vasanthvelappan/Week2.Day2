package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div [@class =\"_6ltg\"]/ a [@role=\"button\"]")).click();
		driver.findElement(By.xpath("//input [contains(@name,'firstname')]")).sendKeys("FN");
		driver.findElement(By.xpath("//input [contains(@name,'lastname')]")).sendKeys("LN");
		driver.findElement(By.xpath("//input [contains(@name,'reg_email__')]")).sendKeys("mymail@gmail.com");
		driver.findElement(By.xpath("//input [contains(@name,'reg_email_confirmation__')]")).sendKeys("mymail@gmail.com");
		driver.findElement(By.xpath("//input [contains(@name,'reg_passwd__')]")).sendKeys("mypassword@123");
		
		driver.findElement(By.xpath("//span//select [@name='birthday_day']")).sendKeys("5");
		driver.findElement(By.xpath("//span//select [@name='birthday_month']")).sendKeys("mar");
		driver.findElement(By.xpath("//span//select [@name='birthday_year']")).sendKeys("2000"); 
		driver.findElement(By.xpath("//span//input[@value='2']")).click();
		driver.findElement(By.xpath("//div//button[@name='websubmit']")).click(); 
	}



}
