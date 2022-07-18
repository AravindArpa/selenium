package com.automationpractice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nanihome {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement fe = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		fe.click();
		fe.sendKeys("iphone"+Keys.ENTER);

	}
}
