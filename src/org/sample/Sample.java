package org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jb\\selinium\\Sel2\\Driver\\geckodriver.exe");
		WebDriver drive=new FirefoxDriver();
		drive.get("http://www.greenstechnologys.com");
	}

}
