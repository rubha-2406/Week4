package week2.assignments;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();;
		driver.findElement(By.id("firstNameField")).sendKeys("Rubhashree");
		driver.findElement(By.id("lastNameField")).sendKeys("Ravikumar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Rubhashree");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Ravikumar");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Passesd out batch 2016-2020");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("rubhashree@gmail.com");
		
		WebElement element = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select city = new Select (element);
		city.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Passesd out batch 2016-2020");
		driver.findElement(By.className("smallSubmit")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
        		
		
		
		

	}

}
