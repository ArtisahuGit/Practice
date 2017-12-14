package South_West;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class flight_price {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
        driver.navigate().to("https://www.southwest.com/flight/select-flight.html?newDepartDate=12-28&newReturnDate=");
        Thread.sleep(50000);
              
        List<WebElement> lst = driver.findElements(By.xpath("//tr[contains(@id,'inbound_flight')]/td[8]/descendant::div[@ class='radioButtonRelativeContainer_outer']")); ;
       

       
       ArrayList<Integer> al = new ArrayList<>();
     
        for(WebElement we:lst){
        	al.add(Integer.parseInt(we.getText().replace("$", "")));
        	
        }
    	
        Collections.sort(al);
        
//		System.out.println(lst.remove("$"));

	}

}
