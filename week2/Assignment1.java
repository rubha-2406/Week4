package week2.assignments;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;



public class Assignment1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.findElement(By.xpath("//a[@rel='async']")).click();
		
		driver.findElement(By.xpath("//input [@name='firstname']")).sendKeys("Rubhashree");
		driver.findElement(By.xpath("//input [@name='lastname']")).sendKeys("Ravikumar");
		driver.findElement(By.xpath("//input [@name='reg_email__']")).sendKeys("rubhashreeravi@gmail.com");
		driver.findElement(By.xpath("//input [@name='reg_passwd__']")).sendKeys("rubhashreeravi");
		
    WebElement Fb = driver.findElement(By.id("day"));
    Select facebook = new Select(Fb);
    facebook.selectByIndex(23);
    
    
    WebElement Face = driver.findElement(By.id("month"));
    Select faceboo = new Select(Face);
    faceboo.selectByIndex(5);
    
    WebElement Faces = driver.findElement(By.id("year"));
    Select facebo = new Select(Faces);
    facebo.selectByValue("1999");

    driver.findElement(By.xpath("//label [text()='Female']")).click();
    
    
    
    
    
    
    
    
		 
				
       
		

	}

}
