package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Login_Page {
	
	WebDriver driver;
		
	public String login_url = "http://automationpractice.com/index.php";
	public String user_name = "anilatamhane@gmail.com";
	public String pwd = "testing123";
	public String id_email = "email";
	public String id_pwd = "passwd";
	public String xpath_sign_in_btn = "//*[@id='SubmitLogin']/span";  
	
	public String btn_signIn = "//*[@id='header']/div[2]/div/div/nav/div[1]/a";
	
	public Login_Page(WebDriver driver){
		this.driver = driver;
	}
	
	public void valid_login(){
		driver.get(login_url);
		driver.findElement(By.xpath(btn_signIn)).click();
		WebDriverWait wait = new WebDriverWait(driver, 10); 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id(id_email)));
		
		driver.findElement(By.id(id_email)).sendKeys(user_name);
		driver.findElement(By.id(id_pwd)).sendKeys(pwd);
		driver.findElement(By.xpath(xpath_sign_in_btn)).click();
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='columns']/div[1]")));
		
	}
	
	
	

}
