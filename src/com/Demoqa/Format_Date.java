package com.Demoqa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Format_Date {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/datepicker/");
		driver.findElement(By.cssSelector("#ui-id-4")).click();
		driver.findElement(By.cssSelector("#datepicker4")).click();
		List<WebElement> Date_value = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		for (WebElement we :Date_value)
		{
	   	   
	    if(we.getText().equalsIgnoreCase("12"))
	    {
	    	we.click();
	    	break;
	    }
		}
		
	    WebElement ele = driver.findElement(By.cssSelector("#format"));
	    Select sel = new Select(ele);
	    List <WebElement> lst =sel.getOptions();
	    for(WebElement we : lst)
	    {
	    	 we.getText();
	    	 we.click();
	    	 System.out.println( driver.findElement(By.xpath("//input[@id='datepicker4']")).getText());    		
	    	}
	    }
	  
	}
	

