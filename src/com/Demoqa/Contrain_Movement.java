package com.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Contrain_Movement {

	@Test
	public void Mouse()
	
	{
	
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/draggable/");
		driver.findElement(By.cssSelector("#ui-id-2")).click();
		
		WebElement source_vertical = driver.findElement(By.cssSelector("#draggabl>p"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(source_vertical, 90, -40).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	
		WebElement source_horizontal = driver.findElement(By.cssSelector("#draggabl2"));
		Actions act1 = new Actions(driver);
		act1.dragAndDropBy(source_horizontal, 190, 400).build().perform();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
driver.quit();
	}

}
