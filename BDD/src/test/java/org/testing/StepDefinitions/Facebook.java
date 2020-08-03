package org.testing.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.*;

public class Facebook {
	ChromeDriver driver;
	@Given("^Open the Chrome and start the application$")
	public void Open_the_Chrome_and_start_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\Desktop\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	    
	}

	@When("^I enter valid username and vaid password$")
	public void I_enter_valid_username_and_vaid_password() throws Throwable {
	    WebElement email = driver.findElement(By.name("email"));
	    email.click();
	    Thread.sleep(2000);
	    //email.sendKeys("zeeshanhsn14@gmail.com);
	}
	@When("^User enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void User_enter_username_and_password(String arg1, String arg2) throws Throwable {
	    
	}
	@Then("^user should be able to Login successfully$")
	public void user_should_be_able_to_Login_successfully() throws Throwable {
	    
	}

}
