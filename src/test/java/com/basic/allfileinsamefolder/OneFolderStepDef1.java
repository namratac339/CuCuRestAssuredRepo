package com.basic.allfileinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDef1 {
	WebDriver driver;
	String Str;
	@ Given("the user is on facebook login page") 
	public void the_user_is_on_facebook_login_page(){
		System.out.println("in setup");
		System.setProperty("webdriver.chrome.driver", "C:\\RadicalSelenium\\software\\Selenium\\SeleniumIDE\\chromedriver_win32_B45\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@When("^he enters \"([^\"]*)\" as usename$")
	public void he_enters_as_usename(String arg1) {
	driver.findElement(By.xpath("//td/input[@type=email]")).sendKeys("Namrata");
		
	}
	@When("^he enters \"([^\"]*)\" as password$")
	public void he_enters_as_password(String arg1)  {
	    driver.findElements(By.xpath("//*[@id=pass]")).sendKeys("Namrata");
	    
	}

	@Then("^check usename is present in textbox$")
	public void check_usename_is_present_in_textbox() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^i am checking$")
	public void i_am_checking() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}


	
}
