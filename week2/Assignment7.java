package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Edit.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("rubharavi@gmail.com");
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("rubharavikumar@gmail.com", Keys.TAB);
		
		
		String text = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		
	Boolean test =	driver.findElement(By.xpath("//input[@disabled='true']")).isDisplayed();
	    System.out.println(test);
		
		
		
	}

}
