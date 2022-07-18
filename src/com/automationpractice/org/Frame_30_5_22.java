package com.automationpractice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Frame_30_5_22 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximed");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/frames");
		WebElement we = driver.findElement(By.xpath("(//div[@class='header-text'])[3]"));
		Thread.sleep(3000);
		we.click();
		 WebElement fra = driver.findElement(By.xpath("//iframe[@id='frame1']"));
//		WebElement f = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		driver.switchTo().frame(fra);
//		driver.switchTo().parentFrame()
//		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		WebElement fratxt = driver.findElement(By.xpath(
				"(//div[.='Sample Iframe page There are 2 Iframes in this page. Use browser inspecter or firebug to check out the HTML source. In total you can switch between the parent frame, which is this window, and the two frames below'])[3]"));
		System.out.println(fratxt.getText());
	}
}