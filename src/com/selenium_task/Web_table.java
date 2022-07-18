package com.selenium_task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_table {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		
		System.out.println("-----All Table Data------");
		List<WebElement> fulltable = driver.findElements(By.xpath("//table/tbody/tr/td"));
		for (WebElement alldata : fulltable) {
			System.out.println(alldata.getText());
		}	
			System.out.println("------Particular Row------");
			List<WebElement> single_tb = driver.findElements(By.xpath("//table/tbody/tr[6]/td"));
			for (WebElement partidata : single_tb) {
				System.out.println(partidata.getText());
			}
			System.out.println("-----Particular data-----");
			WebElement partidata = driver.findElement(By.xpath("//table/tbody/tr[3]/td[2]"));
			System.out.println(partidata.getText());
			
			System.out.println("-------Table Head------");
			List<WebElement> Tabhead = driver.findElements(By.tagName("th"));
			for (WebElement Thead : Tabhead) {
				String text = Thead.getText();
				System.out.println(text);
			}	
			System.out.println("-----Row Size------");
			List<WebElement> rowsize = driver.findElements(By.tagName("tr"));
			int rowsi=rowsize.size();
			System.out.println(rowsi);
			
			System.out.println("-----Column Size----");
			List<WebElement> colsize = driver.findElements(By.tagName("td"));
			int coumnsiz=colsize.size();
			System.out.println(coumnsiz);
		}
	}
	
	
