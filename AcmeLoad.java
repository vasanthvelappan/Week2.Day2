package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AcmeLoad {
	
	public static void main(String [] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver  driver = new ChromeDriver();
		driver.get("https://acme-test.uipath.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div/input[@id='email']")).sendKeys("kumar.testleaf@gmail.com");
		driver.findElement(By.xpath("//div/input[@id='password']")).sendKeys("leaf@12");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//li/a [contains(text(),'Log Out')]")).click();
		System.out.println(driver.getTitle());
	}

}
