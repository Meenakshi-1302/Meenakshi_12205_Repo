package com.sm.GroceryTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class GroceryTestCaseInsertOrderTest {

	@Test
	void testOrderSubmission() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddOrder");
		WebElement typeField = driver.findElement(By.name("type"));
		WebElement amountField = driver.findElement(By.name("amount"));
		WebElement deliveryField = driver.findElement(By.name("date"));
		WebElement submitButton = driver.findElement(By.id("order-submit"));
		
		typeField.sendKeys("gorcery");
		amountField.sendKeys("500");
		deliveryField.sendKeys("12.06.24");
		submitButton.submit();
		
	}
	@Test
	public void testOrderSubmission1() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddOrder");
		WebElement typeError = driver.findElement(By.name("type"));
		WebElement amountError = driver.findElement(By.name("amount"));
		WebElement deliveryError = driver.findElement(By.name("date"));
		WebElement submitButton = driver.findElement(By.id("order-submit"));
		
		typeError.sendKeys("");
		amountError.sendKeys("");
		deliveryError.sendKeys("");
		submitButton.submit();
		
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		assertEquals("Please enter Order Type !!! ", alertText);
		alert.accept();
	}
	@Test
	public void testOrderSubmission2() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddOrder");
		WebElement typeField = driver.findElement(By.name("type"));
		WebElement amountField = driver.findElement(By.name("amount"));
		WebElement deliveryField = driver.findElement(By.name("date"));
		WebElement submitButton = driver.findElement(By.id("order-submit"));
		
		typeField.sendKeys("");
		amountField.sendKeys("400");
		deliveryField.sendKeys("25.07.2024");
		submitButton.submit();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		assertEquals("Please enter Order Type !!! ", alertText);
		alert.accept();
		
	}
	@Test
	public void testOrderSubmission3() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddOrder");
		WebElement typeField = driver.findElement(By.name("type"));
		WebElement amountField = driver.findElement(By.name("amount"));
		WebElement deliveryField = driver.findElement(By.name("date"));
		WebElement submitButton = driver.findElement(By.id("order-submit"));
		
		typeField.sendKeys("grocery");
		amountField.sendKeys("");
		deliveryField.sendKeys("25.07.2024");
		submitButton.submit();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		assertEquals("Enter the Amount", alertText);
		alert.accept();
	}
	@Test
	public void testForOrderSubmission4() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddOrder");
		WebElement typeField = driver.findElement(By.name("type"));
		WebElement amountField = driver.findElement(By.name("amount"));
		WebElement deliveryField = driver.findElement(By.name("date"));
		WebElement submitButton = driver.findElement(By.id("order-submit"));
		
		typeField.sendKeys("grocery");
		amountField.sendKeys("300");
		deliveryField.sendKeys("");
		submitButton.submit();
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		assertEquals("Please enter the delivery date", alertText);
		alert.accept();
		
	}
	
	@AfterAll
	public static void tearDown() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:3000/AddOrder");
		if(driver !=null) {
			driver.quit();
		}
	}

}
