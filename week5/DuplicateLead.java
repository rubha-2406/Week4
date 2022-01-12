package week5;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
	
	public class DuplicateLead extends BaseClass{
          @Test(dataProvider = "editData" , priority = 4)
		public void duplicate(String phnum) throws InterruptedException {
			
			driver.findElement(By.linkText("Leads")).click();
			driver.findElement(By.linkText("Find Leads")).click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phnum);
			driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
			driver.findElement(By.linkText("Duplicate Lead")).click();
			driver.findElement(By.name("submitButton")).click();
			
	}
	
		@DataProvider 
		public String[][] editData() {
			String [][] data = new String[0][0];
					data[0][0] = "9898958012";
					
					
					
					
			return data ;		
			        
		}
			
}
