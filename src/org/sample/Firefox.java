package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\jb\\selinium\\Sel2\\Driver\\geckodriver.exe");
	WebDriver dev=new FirefoxDriver();
	dev.get("http://www.facebook.com");
}
}
