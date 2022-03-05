package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		// USER NAME
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("demosalesmanager");		
		// PASSWORD
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// Login click
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		//Create Lead
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestCompany");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("TestFN");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("TestLN");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("TestFNLocal");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("TestDept");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestDescription");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("TestMail@gmail.com");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		// editing the values
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Test Important Note");
		driver.findElement(By.className("smallSubmit")).click();
		System.out.println(driver.getTitle().toString());
		

		
	}

}