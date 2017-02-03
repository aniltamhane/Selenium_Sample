package test_Cases;

import java.io.IOException;

import page_Objects.Login_Page;
import page_Objects.My_account;
import utilities.screen_Shot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterMethod;

public class Login_Verify {
	
	WebDriver driver;
	Login_Page	obj_Login_Page;
	My_account	obj_Home_Page;
	
	@Test (priority = 1)
	public void test_login() throws Exception {
		obj_Login_Page = new Login_Page(driver);
		obj_Login_Page.valid_login();
		Assert.assertEquals(driver.findElement(By.xpath("//*[@id='columns']/div[1]/span[2]")).getText(),"My account t");
		
	}
	
	@AfterMethod
	public void screenshot(ITestResult result) throws IOException{
		System.out.println(ITestResult.FAILURE);
		System.out.println(result.getStatus());
		if(ITestResult.FAILURE==result.getStatus()){
			screen_Shot.take_screenShot(driver, result.getName());
		}
	}
	
	
	@BeforeTest
	public void tear_up(){
		driver = new FirefoxDriver();
	}
	
	@AfterTest
	public void tear_down(){
		driver.quit();
	}

}
