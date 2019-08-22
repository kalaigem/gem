package org.cts.ind.Heb_Airservice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static  WebDriver driver;
	
	public static WebDriver getDriver() {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\lnovo\\eclipse-workspace\\Heb_Airservice\\Driver\\chromedriver.exe");
	 
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();

	 return driver;
	}
	public static void loadurl(String url) {
		driver.get(url);

	}


	}
	
