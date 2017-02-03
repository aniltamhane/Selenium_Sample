package page_Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Page_Women {
	
	WebDriver driver;
	
	public Page_Women(WebDriver driver){
		this.driver=driver;
	}
	
	public String page_title = "//*[@id='columns']/div[1]/span[2]"; //xpath
	public String short_sleeve_tshirt = "//*[@id='center_column']/ul/li[1]/div/div[1]/div/a[1]/img";
	public String add_to_cart = "a[title='Add to cart']";
	
	public void click_image() throws InterruptedException{
		Actions move = new Actions(driver);
		move.moveToElement(driver.findElement(By.xpath(short_sleeve_tshirt))).build().perform();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(add_to_cart)));
		move.moveToElement(driver.findElement(By.cssSelector(add_to_cart))).click().perform();
		Thread.sleep(4000);
		
	}

}
