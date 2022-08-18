package org.net;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class UpdateClass extends WriteClass {
public static void main(String[] args) throws IOException {
	launchChrome();
	winMax();
	
	launchUrl("http://adactinhotelapp.com");
	WebElement email = driver.findElement(By.id("username"));
	passValue(email,getData1(1,2));
	WebElement pass = driver.findElement(By.id("password"));
	passValue(pass,getData1(1,3));
	
	WebElement click = driver.findElement(By.id("login"));
	buttonClick(click);
	
	
}
}
