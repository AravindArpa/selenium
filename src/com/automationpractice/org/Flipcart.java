package com.automationpractice.org;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipcart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximed");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		String text = driver.findElement(By.className("_37M3Pb")).getText();
		System.out.println("Flipcart Titles: " + text);
		String text2 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[1]")).getText();
		System.out.println("menu: " + text2);

		String text3 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[2]")).getText();
		System.out.println(text3);
		String text4 = driver.findElement(By.className("_1rH5Jn")).getText();
		System.out.println(text4);
		String text5 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[3]")).getText();
		System.out.println(text5);

		String text6 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[4]")).getText();
		System.out.println("menu: " + text6);
		String text7 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]")).getText();
		System.out.println("menu7"+text7);
		String text8 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[6]")).getText();
		System.out.println("menu8"+text8);
		String text9 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[7]")).getText();
		System.out.println("menu9"+text9);
		String text10 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[8]")).getText();
		System.out.println("menu10"+text10);
		String text11 = driver.findElement(By.xpath("(//div[@class='xtXmba'])[9]")).getText();
		System.out.println("menu11:"+text11);
		
		
		
		
		

//		 List<WebElement> fe = driver.findElements(By.className("_37M3Pb"));
//	for (WebElement p : fe) {
//		String text31 = p.getText();
//		System.out.println(text31);
	}

	}

