package com.Demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Display_Grid {
	WebDriver driver;
	@Test
	public void Run() throws Throwable
	{
	 driver = new FirefoxDriver();
	
		driver.navigate().to("http://demoqa.com/selectable/");
		driver.findElement(By.cssSelector("#ui-id-2")).click();
		List <WebElement> lst =driver.findElements(By.xpath("//ol[@id='selectable_grid']/descendant::li"));
		for (WebElement we : lst)
		{
			
			we.click();
			
			
			
		}
	}
	
}
