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
	public void he_enters_as_usename(String arg1) throws InterruptedException {
	Thread.sleep(5000);	
	driver.findElement(By.xpath("//td/input[@type='email']")).sendKeys("Namrata");
		
	}
	@When("^he enters \"([^\"]*)\" as password$")
	public void he_enters_as_password(String arg1)  {
	    driver.findElement(By.xpath("//*[@id=pass]")).sendKeys("Namrata");
	    
	}

}