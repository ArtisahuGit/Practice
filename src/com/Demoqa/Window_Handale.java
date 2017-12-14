package com.Demoqa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Window_Handale {

	public static void main(String[] args) {
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://demoqa.com/frames-and-windows/");
		 driver.findElement(By.cssSelector("#ui-id-1")).click();
		 driver.findElement(By.xpath("//div[@id='tabs-1']/descendant-or-self::a")).click();
		String Parent =driver.getWindowHandle();
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		System.out.println(Parent);
		String Child = itr.next();
	    driver.switchTo().window(Child);
	    System.out.println(Child);
		String Child_Data =driver.findElement(By.xpath("//div[@id='tabs-1']/descendant-or-self::a")).getText();
		System.out.println(Child_Data);
		driver.switchTo().window(Parent);

	}

}
