package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class My_account {
	
	WebDriver driver;
	
	public My_account(WebDriver driver){
		this.driver=driver;
	}
	
	public String order_history = "//*[@id='center_column']/div/div[1]/ul/li[1]/a/span"; //xpath
	public String credit_slips = "//*[@id='center_column']/div/div[1]/ul/li[2]/a/span"; // xpath
	public String my_address = "//*[@id='center_column']/div/div[1]/ul/li[3]/a/span"; //xpath
	public String personal_info ="//*[@id='center_column']/div/div[1]/ul/li[4]/a/span";//xpath
	public String my_wishlist = "//*[@id='center_column']/div/div[2]/ul/li/a/span"; //xpath
	
	public String women = "a[title='Women']";
	public String Dresses = "a[title='Dresses']";
	public String tShirts = "a[title='T-shirts']";
	public String contact_us = "a[title='Contact us']";
	
	
	public void open_order_history(){
		driver.findElement(By.xpath(order_history)).click();
		
	}
	
	public void credit_slips(){
		driver.findElement(By.xpath(credit_slips)).click();
	}
	
	public void my_address(){
		driver.findElement(By.xpath(my_address)).click();
	}
	
	public void personal_info(){
		driver.findElement(By.xpath(personal_info)).click();
	}
	
	public void my_wishlist(){
		driver.findElement(By.xpath(my_wishlist)).click();
	}
	
	public void women(){
		driver.findElement(By.xpath(women)).click();
	}
	
	public void Dresses(){
		driver.findElement(By.xpath(Dresses)).click();
	}
	
	public void tShirts(){
		driver.findElement(By.xpath(tShirts)).click();
	}
	
	public void contact_us(){
		driver.findElement(By.xpath(contact_us)).click();
	}
	
}
