package com.sm.GroceryTesting;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GroceryTestCaseUpdateOrderTest {

	@Test
	 void testOrderUpdate() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/updatecus/1");
		WebElement typeField = driver.findElement(By.name("type"));
		WebElement amountField = driver.findElement(By.name("amount"));
		WebElement deliveryField = driver.findElement(By.name("date"));
		WebElement submitButton = driver.findElement(By.id("order-update"));
		typeField.sendKeys("grocery");
		amountField.sendKeys("1200");
		deliveryField.sendKeys("28.7.24");
		submitButton.submit();
		
	
		
	}
	 @AfterEach
	    public void tearDown() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:3000/updateCus/1");
	        if (driver != null) {
	            driver.quit();
	        }
	
	

}
}
