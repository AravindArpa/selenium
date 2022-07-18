package com.automationpractice.org;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dummy {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(4000);
		String text = driver.findElement(By.xpath("(//div[@class='nav-progressive-content'])[2]")).getText();
		System.out.println("menu: "+text);
		WebElement fe = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)", fe);
		//Thread.sleep(4000);
		WebElement v = driver.findElement(By.xpath("(//*[.='See all deals'])[3]"));
		js.executeScript("arguments[0].click();",v);
	}
}
