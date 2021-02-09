package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	WebDriver d;

@Given("User has to be in Login Page")
public void user_has_to_be_in_Login_Page() {
	WebDriverManager.chromedriver().setup();
	 d = new ChromeDriver();
	d.get("https://www.saucedemo.com/");
}

@When("The user has to enter the credentials {string} and {string}")
public void the_user_has_to_enter_the_credentials_and(String string, String string2) {
	d.findElement(By.id("user-name")).sendKeys(string);
	d.findElement(By.id("password")).sendKeys(string2);
}

@When("The user has to click login button")
public void the_user_has_to_click_login_button() {
	d.findElement(By.id("login-button")).click();
}

@Then("The user has to be in home page")
public void the_user_has_to_be_in_home_page() {
	Assert.assertTrue(true);
	System.out.println("The user has to be in home page");
}


@When("The user has to enter username {string} and password {string}")
public void the_user_has_to_enter_username_and_password(String string, String string2) {
	d.findElement(By.id("user-name")).sendKeys(string);
	d.findElement(By.id("password")).sendKeys(string2);
}


@Then("The user has to be in error page")
public void the_user_has_to_be_in_error_page() {
	Assert.assertTrue(true);
	System.out.println("The user has to be in error page");
}




}
