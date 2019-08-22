package org.cts.ind.Heb_Airservice;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPage extends BaseClass 
{
	public static void main(String[] args)
	{
		getDriver();
		loadurl("https://www.hebrideanair.co.uk/");
		WebElement clicklink = driver.findElement(By.partialLinkText("http://bookhebridean.co.uk"));
		clicklink.click();
		
		String parenwindo = driver.getWindowHandle();
		Set<String> chilwindow1 = driver.getWindowHandles();
		System.out.println(chilwindow1);
		for(String x:chilwindow1)
		{
			if(!parenwindo.equals(x))
			{
				driver.switchTo().window(x);
			}
		}
		WebElement from = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Origin"));
		Select s = new Select(from);
		s.selectByIndex(1);
		WebElement to = driver.findElement(By.id("ctl00_ContentPlaceHolder1_Destination"));
		Select  s1 = new Select(to);
		s1.selectByIndex(1);
		WebElement datepic = driver.findElement(By.className("ui-datepicker-trigger"));
		datepic.click();
		WebElement daypic = driver.findElement(By.xpath("//a[text()='16']"));
		daypic.click();
		WebElement search = driver.findElement(By.id("ctl00_ContentPlaceHolder1_search"));
		search.click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_rpFlights1_ctl01_rbFlight1")).click();
		WebElement contiu = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btnContinue"));
		contiu.click();
		WebElement fstname = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rpPAX_ctl01_tbFirstName"));
		fstname.sendKeys("raja");
		WebElement lastname = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rpPAX_ctl01_tbLastName"));
		lastname.sendKeys("kk");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_rpPAX_ctl01_ddlGender_1")).click();
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Email")).sendKeys("raja@gmail.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Email2")).sendKeys("raja@gmail.com");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Address1")).sendKeys("chennai,chromepet");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Address2")).sendKeys("621101");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Phone")).sendKeys("8015513170");
		driver.findElement(By.id("ctl00_ContentPlaceHolder1_Terms")).click();
		driver.findElement(By.name("ctl00$ContentPlaceHolder1$btnContinue")).click();
		driver.findElement(By.xpath("//button[@type='button']")).click();
		driver.switchTo().alert().accept();
		
		
	}
	

}
