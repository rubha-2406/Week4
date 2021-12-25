package week2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.findElement(By.id("home")).click();
		
		driver.findElement(By.xpath("//img[@alt='Buttons']")).click();
		
		String pos = driver.findElement(By.id("position")).getCssValue("position");
		System.out.println(pos);
		
		String colors = driver.findElement(By.id("color")).getCssValue("color");
		System.out.println(colors);
		
		int height = driver.findElement(By.id("size")).getSize().getWidth();
		int width = driver.findElement(By.id("size")).getSize().getWidth();
		System.out.println(height);
		System.out.println(width);
		
		driver.close();
		
		
		
		
		
		
		
	}

}
