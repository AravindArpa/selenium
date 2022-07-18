package com.automationpractice.org;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_iphone {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("nani");
		System.out.println("praveen");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement search = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		search.sendKeys("iphone" + Keys.ENTER);
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='CXW8mj']"));
		int size = list.size();
		System.out.println(size);
		List<WebElement> list2 = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//		for (WebElement title : list2) {
//			String text = title.getText();
//			System.out.println(text);
//
//		}
		for (int i = 0; i < list2.size(); i++) {
	 String text = list2.get(i).getText();
	 System.out.println(text);
			
			
		}
	//	WebElement fe = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
		//fe.sendKeys("nani");
			}
}
