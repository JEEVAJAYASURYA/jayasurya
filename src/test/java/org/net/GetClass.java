package org.net;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GetClass extends BaseClass {
public static void main(String[] args) throws InterruptedException, IOException {
	launchChrome();
	winMax();
	launchUrl("https://www.ebay.com/signin");
	Thread.sleep(3000);
	printTitle();
	printCurrentTitle();
	Thread.sleep(3000);
	WebElement email = driver.findElement(By.id("userid"));
	passValue(email,getData(1,1));
	Thread.sleep(3000);
	WebElement login = driver.findElement(By.id("signin-continue-btn"));
buttonClick(login);
Thread.sleep(3000);
	WebElement pass = driver.findElement(By.id("pass"));
passValue(pass,getData(4,2));
Thread.sleep(3000);
	WebElement sign = driver.findElement(By.id("sgnBt"));

buttonClick(sign);
}
}


