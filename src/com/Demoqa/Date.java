package com.Demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Date {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/datepicker/");
		driver.findElement(By.cssSelector("#ui-id-1")).click();
		driver.findElement(By.cssSelector("#datepicker1")).click();
		List<WebElement> Date_value = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
	  
//		for(int i =0; i<Date_type.size();i++)
		for (WebElement we :Date_value)
		{
	   	   
	    if(we.getText().equalsIgnoreCase("12"))
	    {
	    	we.click();
	    	break;
	    }
		
		}
	}

}
