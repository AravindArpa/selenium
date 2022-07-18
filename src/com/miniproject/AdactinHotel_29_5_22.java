package com.miniproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotel_29_5_22 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Important Software\\G.Tech\\eclipse-workspace\\Selenium_Again\\Driver\\chromedriver_1035060.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://adactinhotelapp.com/");
		WebElement fi = driver.findElement(By.xpath("(//input[@type='text'])"));
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		Thread.sleep(3000);
		fi.findElement(By.xpath("(//input[@type='text'])")).sendKeys("aravindrvn17");
		fi.findElement(By.xpath("(//input[@type='password'])")).sendKeys("2078EG");
		fi.findElement(By.xpath("(//input[@id='login'])")).click();
//		Thread.sleep(4000);
		WebElement city = driver.findElement(By.xpath("(//select[@name='location'])"));
		Select s1 = new Select(city);
		s1.selectByVisibleText("New York");
		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s2 = new Select(hotel);
		s2.selectByVisibleText("Hotel Sunshine");
		WebElement room = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s3 = new Select(room);
		s3.selectByVisibleText("Double");
		WebElement roomno = driver.findElement(By.xpath("//select[@name='room_nos']"));
		Select s4 = new Select(roomno);
		s4.selectByVisibleText("2 - Two");
		WebElement date = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		date.clear();
		date.sendKeys("17/06/2022");
		WebElement date2 = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		date2.clear();
		date2.sendKeys("18/06/2022");
		WebElement adultroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
		Select s5 = new Select(adultroom);
		s5.selectByVisibleText("2 - Two");
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		driver.findElement(By.xpath("//input[@name='radiobutton_0']")).click();
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		WebElement Fname = driver.findElement(By.xpath("//input[@name='first_name']"));
		Fname.sendKeys("Aravind");
		WebElement Lname = driver.findElement(By.xpath("//input[@name='last_name']"));
		Lname.sendKeys("S");
		WebElement Billadd = driver.findElement(By.xpath("//textarea[@name='address']"));
		Billadd.sendKeys("No.777,Washington DC,Bus stand,first street");
		WebElement ccno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		ccno.sendKeys("1234567890123456");
		WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		cctype.click();
		Select cctyp = new Select(cctype);
		cctyp.selectByVisibleText("VISA");
		WebElement Exmon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		Exmon.click();
		Select s6 = new Select(Exmon);
		s6.selectByVisibleText("February");
		WebElement Exyr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		Select s7 = new Select(Exyr);
		s7.selectByVisibleText("2014");
		WebElement cvvno = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		cvvno.sendKeys("749");
		driver.findElement(By.xpath("//input[@name='book_now']")).click();
		// driver.findElement(By.id("my_itinerary")).click();
		driver.findElement(By.xpath("//input[@name='my_itinerary']")).click();
		driver.findElement(By.xpath("//input[@name='check_all']")).click();
		driver.findElement(By.xpath("//input[@name='cancelall']")).click();
		Thread.sleep(4000);
		Alert a = driver.switchTo().alert();
		a.accept();
		driver.findElement(By.xpath("//input[@name='logout']")).click();
		driver.close();
	}
}
