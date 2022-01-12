package week5;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends BaseClass {
		@Test (dataProvider = "sendData" , priority =1 , invocationCount =2 )
		 public void Test(String company , String name , String lname) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(name);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.name("submitButton")).click();
		
}

		@DataProvider 
		public String[][] sendData() {
			String [][] data = new String[1][3];
					data[0][0] = "Test leaf";
					data[0][1] = "babu";
					data[0][2] = "manickam";
					
					data[1][0] = "Qeagle";
					data[1][1] = "babu";
					data[1][2] = "manickam";
					
					
			return data ;		
			        
		}

		
		

	}


