package stepdeftest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testdemo {
	
	WebDriver driver;
	
	@Given("^Specify the application url$")
	public void specify_the_application_url() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C://SeleniumSoftware//chromedriver_win32//chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://newtours.demoaut.com/");
	   driver.manage().window().maximize();
	}

	@When("^Enter user id$")
	public void enter_user_id() throws Throwable {
	driver.findElement(By.name("userName")).sendKeys("demo");
	   
	}

	@When("^Enter password$")
	public void enter_password() throws Throwable {
	   driver.findElement(By.name("password")).sendKeys("demo");
	}

	@When("^Click on signon field$")
	public void click_on_signon_field() throws Throwable {
	driver.findElement(By.name("login")).click();
	}

	@Then("^login is successfull,close$")
	public void login_is_successfull_close() throws Throwable {
	 driver.close();
	}


}
