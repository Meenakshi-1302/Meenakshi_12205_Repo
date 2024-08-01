package com.sm.GroceryTesting;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GroceryTestCaseUpdateCustomerTest {

	@Test
	void testCustomerUpdate() {
		 WebDriver driver = new ChromeDriver();
		
		 driver.navigate().to("http://localhost:3000/update/1");
		 WebElement cnameField = driver.findElement(By.name("cname"));
		 WebElement mailField = driver.findElement(By.name("mail"));
		 WebElement mobileField = driver.findElement(By.name("mobile"));
		 WebElement submitButton = driver.findElement(By.id("customer-update"));
		 
		 cnameField.sendKeys("dharshini");
	        mailField.sendKeys("dharshu@gmail.com");
	        mobileField.sendKeys("1234567890");
         submitButton.submit();
        
		
	}
	
	 @AfterEach
	    public void tearDown() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:3000/update/1");
	        if (driver != null) {
	            driver.quit();
	        }
	 }

}
