package com.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/draggable/");
		WebElement source = driver.findElement(By.cssSelector("#draggable"));
		Actions act = new Actions(driver);
		act.dragAndDropBy(source, 246, 150).build().perform();
		Thread.sleep(50000);
		
	}

}
