package com.automationpractice.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.SendKeysAction;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver.exe");

		ChromeOptions option = new ChromeOptions();
		option.addArguments("Incognito");
		option.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(option);
//driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		String text = driver.findElement(By.xpath("(//div[@class='nav-sprite'])[1]")).getText();
		System.out.println(text);
		WebElement t = driver.findElement(By.id("twotabsearchtextbox"));
		t.sendKeys("dell");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String txt = driver.findElement(By.xpath(
				"(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[1]"))
				.getText();
		System.out.println(txt);
	}

}
