package com.Demoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Registration {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
	    String Marital_Status="";
		driver.findElement(By.id("[@id='name_3_firstname']")).sendKeys("John");
		driver.findElement(By.id(".//*[@id='name_3_lastname']")).sendKeys("Cena");
		if(Marital_Status.equalsIgnoreCase("single"))
		{
		driver.findElement(By.xpath("//input[@value='single']")).click();
		}
		else if (Marital_Status.equalsIgnoreCase("married")){
		driver.findElement(By.xpath("//input[@value='married']")).click();
		}
		else
		driver.findElement(By.xpath("//input[@value='divorced']")).click();
		
	}
	
	
	}


