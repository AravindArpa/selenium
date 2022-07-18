package com.automationpractice.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaniH29_5_22_Dominos {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dominos.co.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[text()='ORDER ONLINE NOW']")).click();
		driver.findElement(By.id("moe-onsite-campaign-628f5c8ed81d0338ea6c1c3c")).click();

		//driver.findElement(By.xpath("//button[@onclick='moeRemoveBanner()']")).click();

	}
}
