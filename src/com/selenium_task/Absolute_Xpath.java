package com.selenium_task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone&rh=n%3A1389401031&ref=nb_sb_noss");
		driver.findElement(By.xpath(
				"//div[@id=\"search\"]/div/div/div/span[3]/div[2]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div/h2/a/span"))
				.click();
		//driver.findElement(By.xpath("//form[@id='nav-search-bar-form']")).clear();
		driver.findElement(By.cssSelector("#nav-search")).clear();
		driver.findElement(By.cssSelector("#nav-search")).sendKeys("sony");
	}

}
