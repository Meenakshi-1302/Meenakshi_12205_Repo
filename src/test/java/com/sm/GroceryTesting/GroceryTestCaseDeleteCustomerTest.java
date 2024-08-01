package com.sm.GroceryTesting;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GroceryTestCaseDeleteCustomerTest {

	@Test
	void testCustomerDelete() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/ViewCustomer");
		driver.findElement(By.linkText("View Customer")).click();
		WebElement deleteButton = driver.findElement(By.name("delete"));
		deleteButton.click();
		driver.switchTo().alert().accept();
		
	}
	 @AfterEach
	    public void tearDown() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:3000/ViewCustomer");
	        if (driver != null) {
	            driver.quit();
	        }
	 }

}
