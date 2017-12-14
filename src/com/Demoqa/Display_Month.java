package com.Demoqa;

import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Display_Month {
	
	  static String strDate = "15-MAY-2018";
	  static String Date[] = strDate.split("-");
      static int   month  =  Month.valueOf(Date[1].toUpperCase()).getValue();
                    
    
	public static  void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demoqa.com/datepicker/");
		driver.findElement(By.cssSelector("#ui-id-3")).click();
		driver.findElement(By.cssSelector("#datepicker3")).click();
	    driver.findElement(By.cssSelector(".ui-datepicker-month")).click();
	    WebElement m = driver.findElement(By.cssSelector(".ui-datepicker-month"));
	    Select sel = new Select(m);
	    sel.selectByIndex(month-1);
	    WebElement Y =driver.findElement(By.cssSelector(".ui-datepicker-year"));
	    Select sel1 = new Select(Y);
	    sel1.selectByVisibleText(Date[2]);
	    
	   // WebElement date = driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover"));
	    List<WebElement> Date_value = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
	    Thread.sleep(2000); 
		for (WebElement we :Date_value)
		{
	   	
	    if(we.getText().equalsIgnoreCase(Date[0]))
	    {
	    	Thread.sleep(2000);
	    	we.click();
	    	break;
	    }
		
		}
	   
	}   
	 }
