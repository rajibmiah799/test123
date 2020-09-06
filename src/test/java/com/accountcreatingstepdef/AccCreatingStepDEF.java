package com.accountcreatingstepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class AccCreatingStepDEF {
	WebDriver driver;

	@Given("^user on amazon home page$")
	public void user_on_amazon_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);		
	}

	@When("^user click on sign in$")
	public void user_click_on_sign_in() {
		WebElement signinAcc = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		signinAcc.click();
	}

	@When("^user click on create your Amazon account$")
	public void user_click_on_create_your_Amazon_account() {
		WebElement createaccClick = driver.findElement(By.id("createAccountSubmit"));
		createaccClick.click();
	}

	@When("^user enter \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\", \"([^\"]*)\"$")
	public void user_enter(String username, String email, String password, String reenterpassword) {
		WebElement edituserName = driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]"));
		edituserName.sendKeys(username);
		
		WebElement editemail = driver.findElement(By.cssSelector("input[id='ap_email']"));
		editemail.sendKeys(email);
		
		WebElement editPassword = driver.findElement(By.id("ap_password"));
		editPassword.sendKeys(password);
		
		WebElement editrePassword = driver.findElement(By.xpath("//input[@id='ap_password_check']"));
		editrePassword.sendKeys(reenterpassword);
		
		WebElement continueClick = driver.findElement(By.xpath("//input[@id='continue']"));
		continueClick.click();

	}

	@Then("^user create account successfully$")
	public void user_create_account_successfully() {
		
	}

}
