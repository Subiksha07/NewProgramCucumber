package org.Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;

	public WebDriver launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Subi course\\switch\\ProjectCucumber\\newchrome\\chromedriver.exe");

		 driver = new ChromeDriver();
		return driver;
	}
	
	public void launchUrl(String url) {
		driver.get(url);
	}
	
	public void waits() {
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void maxWindow() {
		driver.manage().window().maximize();
	}
	
	public void quitBrow() {
		driver.quit();
	}
	
	
}
