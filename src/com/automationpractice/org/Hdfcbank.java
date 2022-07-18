package com.automationpractice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfcbank {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://netbanking.hdfcbank.com/netbanking/");
	
	driver.switchTo().frame(0);
	WebElement find = driver.findElement(By.xpath("//input[@type='text']"));
	Thread.sleep(3000);
	find.sendKeys("Aravind");
	WebElement findE = driver.findElement(By.xpath("//a[@class='btn btn-primary login-btn']"));
	findE.click();
		}

}
