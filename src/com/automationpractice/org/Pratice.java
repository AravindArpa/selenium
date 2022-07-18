package com.automationpractice.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {
	public static void main(String[] args) {

		// browser Launch
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// url
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// Get Title
		String title = driver.getTitle();
		System.out.println(title);
		// GetCurrentUrl
		// String url = driver.getCurrentUrl();
		System.out.println(driver.getCurrentUrl());
		// sendkeys

		// driver.findElement(By.xpath("//input[@class='gLFyf
		// gsfi']")).sendKeys("iphone");
		driver.findElement(By.name("q")).sendKeys("java" + Keys.ENTER);

		// Clik
		// driver.findElement(By.xpath("(//input[@name='btnK'])[1]")).click();
		// Navigate
		driver.navigate().to("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		JavascriptExecutor js = (JavascriptExecutor) driver;// upcasting
		// js.executeScript("window.scrollBy(0, 3000);");
		WebElement scroll = driver.findElement(By.xpath("//a[text()='See all deals']"));
		js.executeScript("arguments[0].scrollIntoView();", scroll);


	}
}