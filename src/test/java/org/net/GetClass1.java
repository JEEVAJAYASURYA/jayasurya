package org.net;

import java.io.IOException;

public class GetClass1 extends BaseClass1 {
public static void main(String[] args) throws InterruptedException, IOException {
	launchChrome();
	launchUrl("https://www.ebay.com");
	winMax();
	Thread.sleep(3000);
	printTitle();
	printCurrentTitle();
	LoginPojo l = new LoginPojo();
	passValue(l.getUser(),getData(2,2));
	Thread.sleep(3000);
	buttonClick(l.getSear());
	Thread.sleep(3000);
	buttonClick(l.getApp());
	Thread.sleep(3000);     
	buttonClick(l.getPass());
	
	
}
}