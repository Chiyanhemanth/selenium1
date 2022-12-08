package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMscript


	{
	
	
	@FindBy(id="email")
	private WebElement email_id;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement login_btn;
	
	public  POMscript (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void email(String user)
	{
		email_id.sendKeys(user);
	}
	
	public void pwd(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void login()
	{
		login_btn.click();
	}

}
