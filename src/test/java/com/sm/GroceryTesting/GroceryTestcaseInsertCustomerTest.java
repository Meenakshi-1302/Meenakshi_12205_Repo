package com.sm.GroceryTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

class GroceryTestcaseInsertCustomerTest {
//	@BeforeAll
//	public static void setUp() {
//		WebDriver driver = new ChromeDriver();
//	}
	 
	

	@Test
	 public void testFormSubmission() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:3000/AddCustomers");
		WebElement cnameField = driver.findElement(By.name("cname"));
		WebElement mailField = driver.findElement(By.name("mail"));
		WebElement mobileField = driver.findElement(By.name("mobile"));
		WebElement submitButton = driver.findElement(By.id("submit"));
		 
		        cnameField.sendKeys("Meenakshi");
		        mailField.sendKeys("meenakshi@gmail.com");
		        mobileField.sendKeys("1234567890");
	            submitButton.submit();
		
		 

		    }
	@Test
	public void testFormSubmission1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddCustomers");
		WebElement cnameField1 = driver.findElement(By.name("cname"));
		WebElement mailField1 = driver.findElement(By.name("mail"));
		WebElement mobileField1 = driver.findElement(By.name("mobile"));
		WebElement submitButton1 = driver.findElement(By.id("submit"));
		
		cnameField1.sendKeys("");
        mailField1.sendKeys("");
        mobileField1.sendKeys("");
        submitButton1.submit();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        assertEquals("Enter Valid Details ",alertText);
        alert.accept();
        
		
	}
	@Test
	public void testForSubmission2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddCustomers");
		WebElement cnameError = driver.findElement(By.name("cname"));
		WebElement mailError = driver.findElement(By.name("mail"));
		WebElement mobileError = driver.findElement(By.name("mobile"));
		WebElement submitButton = driver.findElement(By.id("submit"));
		
		cnameError.sendKeys("");
		mailError.sendKeys("meena@gmail.com");
		mobileError.sendKeys("589632147");
		submitButton.submit();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		assertEquals("Enter Valid Details ", alertText);
		alert.accept();
		
		
	}
	@Test
	public void testForSubmission3() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddCustomers");
		WebElement cnameField = driver.findElement(By.name("cname"));
		WebElement mailField = driver.findElement(By.name("mail"));
		WebElement mobileField = driver.findElement(By.name("mobile"));
		WebElement submitField = driver.findElement(By.id("submit"));
		
		cnameField.sendKeys("Priya");
		mailField.sendKeys("");
		mobileField.sendKeys("98623541");
		submitField.submit();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		assertEquals("Enter Valid Details ", alertText);
		alert.accept();
		
	}
	@Test
	public void testForSubmission4() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddCustomers");
		WebElement cnameField = driver.findElement(By.name("cname"));
		WebElement mailField = driver.findElement(By.name("mail"));
		WebElement mobileField = driver.findElement(By.name("mobile"));
		WebElement submitField = driver.findElement(By.id("submit"));
		
		cnameField.sendKeys("Priya");
		mailField.sendKeys("priya@gmail.com");
		mobileField.sendKeys("");
		submitField.submit();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		assertEquals("Enter mobile number", alertText);
		
		
		
	}
	
	 @AfterAll
	    public static void tearDown() {
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://localhost:3000/AddCustomers");
	        if (driver != null) {
	            driver.quit();
	        }

}
}
