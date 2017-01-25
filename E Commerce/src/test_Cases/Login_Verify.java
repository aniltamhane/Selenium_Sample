package test_Cases;

import page_Objects.Login_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;

public class Login_Verify {
	
	WebDriver driver;
	Login_Page	obj_Login_Page;
	
	@Test (priority = 1)
	public void test_login() throws Exception {
		obj_Login_Page = new Login_Page(driver);
		obj_Login_Page.valid_login();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='columns']/div[1]/span[2]")).getText(),"My account");
		
	}
	
	@BeforeTest
	public void tear_up(){
		driver = new FirefoxDriver();
	}
	
	@AfterTest
	public void tear_down(){
		driver.close();
	}

}
