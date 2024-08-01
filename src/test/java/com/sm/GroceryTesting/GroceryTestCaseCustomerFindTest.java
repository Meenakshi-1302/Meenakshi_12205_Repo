package com.sm.GroceryTesting;



import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GroceryTestCaseCustomerFindTest {

	@Test
	void testForCustomerFind() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/find");
		WebElement searchField = driver.findElement(By.id("search"));
		searchField.sendKeys("1");
		WebElement submitSearch = driver.findElement(By.name("submit"));
		submitSearch.click();
		
	}
//	@Test
//	void testForCustomerFind1() {
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://localhost:3000/find");
//		WebElement searchField = driver.findElement(By.id("search"));
//		searchField.sendKeys("");
//		WebElement submitSearch = driver.findElement(By.name("submit"));
//		submitSearch.click();
//		Alert alert = driver.switchTo().alert();
//		String alertText = alert.getText();
//		assertEquals("Enter Valid id!! ", alertText);
//	}
	 @AfterEach
	    public void tearDown() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:3000/find");
	        if (driver != null) {
	            driver.quit();
	        }
	 }

}
