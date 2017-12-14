package com.Demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autocomplete {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/autocomplete/");
		driver.findElement(By.cssSelector("#ui-id-4"));
		driver.findElement(By.cssSelector("#tagss")).sendKeys("J");
		List<WebElement> lst = driver.findElements(By.xpath(""));
		
	}

}
