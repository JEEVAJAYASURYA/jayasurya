package org.net;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewClass1 extends NewClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		launchChrome();
		winMax();
		
		launchUrl("http://adactinhotelapp.com");
		WebElement email = driver.findElement(By.id("username"));
		passValue(email,getData1(1,0));
		WebElement pass = driver.findElement(By.id("password"));
		passValue(pass,getData1(1,1));
		Thread.sleep(3000);
		WebElement click = driver.findElement(By.name("login"));
		buttonClick(click);
	}
}