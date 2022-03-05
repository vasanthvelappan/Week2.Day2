package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVerification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver ();
		
		driver.get("http://testleaf.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// 1. get title
		System.out.println(driver.getTitle());
		
		// 2. get Current url
		System.out.println(driver.getCurrentUrl());
		
		// 3. get page source
		System.out.println(driver.getPageSource());
		
		// 4. get attribute
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElement(By.linkText("Edit")).click();
		String a = driver.findElement(By.name("username")).getAttribute("value");
		System.out.println(a);
		
		// 5. get CssValue
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElement(By.linkText("Button")).click();
		String button = driver.findElement(By.id("color")).getCssValue("background-color");
		System.out.println(button);
		
		// 6. get text
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElement(By.linkText("Button")).click();
		String button2 = driver.findElement(By.id("home")).getText();
		System.out.println(button2);
		
		// 6. get location
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElement(By.linkText("Button")).click();
		System.out.println(driver.findElement(By.id("position")).getLocation());
		System.out.println(driver.findElement(By.id("position")).getLocation().getX());
		System.out.println(driver.findElement(By.id("position")).getLocation().getY());
		
		// 6. SELECT
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElement(By.linkText("Drop down")).click();
		driver.findElement(By.id("dropdown1")).sendKeys("Selenium");
		//or use below select commands
		//Select dd = new Select(driver.findElement(By.id("dropdown1")));
		//dd.selectByIndex(2);
		//dd.selectByValue("3");
		//dd.selectByVisibleText("Loadrunner");
	}

}
