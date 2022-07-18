package com.miniproject;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Automation_practice {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\newdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.className("sf-with-ul")).click();
		driver.findElement(By.className("product-container")).click();
		driver.findElement(By.xpath("//a[@class='quick-view'][1]")).click();
		WebElement frame = driver.findElement(By.className("fancybox-iframe"));
		driver.switchTo().frame(frame);
		WebElement qty = driver.findElement(By.xpath("//input[@name='qty']"));
		qty.clear();
		qty.sendKeys("4");
		driver.findElement(By.id("add_to_cart")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[@title='Proceed to checkout']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Proceed to checkout']")).click();
		WebElement mail = driver.findElement(By.xpath("(//input[@data-validate='isEmail'])[2]"));
		mail.sendKeys("aravindrvn17@gmail.com");
		WebElement passw = driver.findElement(By.id("passwd"));
		passw.sendKeys("AravindghD2268");
		driver.findElement(By.id("SubmitLogin")).click();
		WebElement comnt = driver.findElement(By.xpath("//textarea[@name='message']"));
		comnt.sendKeys("coding is my passion");
		driver.findElement(By.xpath("//button[@name='processAddress']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']")).click();
		driver.findElement(By.className("bankwire")).click();
		driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Adactin_Project_Aravind\\Evidence\\automation.png");
		FileHandler.copy(source, destination);
	}
}
