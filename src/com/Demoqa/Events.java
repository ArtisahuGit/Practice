package com.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Events {

	@Test
	public void Mouse_Event() throws InterruptedException
	 {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://demoqa.com/draggable/");
		 driver.findElement(By.cssSelector("#ui-id-4")).click();
		 WebElement ele = driver.findElement(By.cssSelector("#dragevent"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(ele, 200, 200);
		Thread.sleep(2000);
		act.clickAndHold(ele);
		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#event-start"));
	String	start = driver.findElement(By.xpath("//li[@id='event-start']/span[2]")).getText();
	String	drag = driver.findElement(By.xpath("//li[@id='event-drag']/span[2]")).getText();
	String stop = driver.findElement(By.xpath("//li[@id='event-stop']/span[2]")).getText();
	System.out.println("Value of coordinates "  + start);
	System.out.println("Value of coordinates "  + drag);
	System.out.println("Value of coordinates "  +  stop);
		
		
		 

	}

}
