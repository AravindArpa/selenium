package com.automationpractice.org;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Mouse {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(17, TimeUnit.SECONDS);
//		WebElement bestsel = driver.findElement(By.linkText("Best Sellers"));
		Actions df = new Actions(driver);
//		df.contextClick(bestsel).perform();
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//a[.='Mobiles'][@class='nav-a  ']")).click();
		WebElement mb = driver.findElement(By.xpath("(//span[@class='nav-a-content'])[2]"));
		df.moveToElement(mb).perform();
		driver.findElement(By.xpath("//a[.='Data Cables']")).click();
	}

}
