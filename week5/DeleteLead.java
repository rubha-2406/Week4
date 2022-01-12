package week5;

import org.openqa.selenium.By;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

	public class DeleteLead extends BaseClass{
public  ChromeDriver	driver;
		@Test(dataProvider = "editData" , priority = 5 )
		 public void loginPage(String phnum ) throws InterruptedException
		 {
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Delete")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			String text = driver.findElement(By.className("x-paging-info")).getText();
			if (text.equals("No records to display")) {
				System.out.println("Text matched");
			} else {
				System.out.println("Text not matched");
			}
			
		 }
		
		@DataProvider 
		public String[][] editData() {
			String [][] data = new String[0][0];
					data[0][0] = "9898958012";
					
					
					
					
			return data ;		
			        
		}
			
			
	
}
	
