package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
		driver.findElement(By.xpath("//img[@alt='Images']")).click();
	Boolean image =	driver.findElement(By.xpath("//label[text()='Am I Broken Image?']")).isDisplayed();
	System.out.println(image);
	    driver.findElement(By.xpath("//img[@src='../images/keyboard.png']")).click();
		
	}

}
