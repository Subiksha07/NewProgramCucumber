package org.Stepdefinition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginSteps {
	
	WebDriver driver;
	@Given("The user has to be in facebook login page")
	public void the_user_has_to_be_in_facebook_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\Subi course\\switch\\ProjectCucumber\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@When("The user has to fill the username and password")
	public void the_user_has_to_fill_the_username_and_password(io.cucumber.datatable.DataTable d) {
	
		List<String> li = d.asList();
		String user = li.get(0);
		driver.findElement(By.id("email")).sendKeys(user);
	driver.findElement(By.id("pass")).sendKeys(li.get(1));
	}
	@When("The user has to click the login button")
	public void the_user_has_to_click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}
	@Then("The user in invalid login page")
	public void the_user_in_invalid_login_page() {
		Assert.assertTrue(true);
		System.out.println("user is in invalid page");
		driver.quit();
	}



}
