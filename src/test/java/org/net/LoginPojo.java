package org.net;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo  extends BaseClass1{

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="gh-ac")
	private WebElement user;
	@FindBy(id="gh-btn")
	private WebElement sear;
	@FindBy(xpath="(//span[text()='Apple iPhone 12 Unlocked 64GB 128GB 256GB | Verizon T-Mobile AT&T | Very Good'])[1]")
	private WebElement app;
	@FindBy(id="isCartBtn_btn")
	private WebElement pass;
	public WebElement getUser() {
		return user;
	}
	public WebElement getSear() {
		return sear;
	}
	public WebElement getApp() {
		return app;
	}
	public WebElement getPass() {
		return pass;
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

