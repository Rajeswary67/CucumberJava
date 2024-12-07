package stepDefinitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.java.en.When;

public class MyAccountLoginStepDefinitions {
	public WebDriver driver=null;
	
	
	@Given("open browser")
	public void open_browser() {
		System.setProperty("wevdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
	      driver = new ChromeDriver();
	      driver.manage().window().maximize();

	}

	/*
	 * @And("Enter the url\"https:\\/\\/practice.automationtesting.in\\/\"") public
	 * void enter_the_url(String url) { driver.get("url");
	 */
	
	@When("Enter the url {string}")
	public void enter_the_url(String url) {
	    // Assuming you have already initialized your WebDriver instance as 'driver'
	    driver.get(url);
	}

		
	

	@And("Click on My Account Menu")
	public void click_on_my_account_menu() {
		driver.findElement(By.linkText("My Account")).click();
	   
	}

	/*
	 * @And("Enter registered username and password") public void
	 * enter_registered_username_and_password() {
	 * driver.findElement(By.id("username")).sendKeys("rajeswarymekala@gmail.com");
	 * driver.findElement(By.id("password")).sendKeys("Mythri$22"); }
	 * 
	 */
	/*
	 * @When("Enter registered username\"rajeswarymekala\" and password\"Mythri${int}\""
	 * ) public void
	 * enter_registered_username_rajeswarymekala_and_password_mythri$(Integer int1)
	 * {
	 * driver.findElement(By.id("username")).sendKeys("rajeswarymekala@gmail.com");
	 * driver.findElement(By.id("password")).sendKeys("Mythri$22"); }
	 */
	
	/*
	 * @When("Enter registered usernameand {string} and password {string}") public
	 * void enter_registered_usernameand_and_password(String username, String pswd)
	 * { driver.findElement(By.id("username")).sendKeys(username);
	 * driver.findElement(By.id("password")).sendKeys(pswd); }
	 */
	
	
	/*
	 * @When("Enter registered username {string} and password {string}") public void
	 * enter_registered_username_and_password(String username, String password) {
	 * driver.findElement(By.id("username")).sendKeys(username);
	 * driver.findElement(By.id("password")).sendKeys(password); }
	 */
	
	
	@When("Enter registered username and password")
	public void enter_registered_username_and_password(io.cucumber.datatable.DataTable credentials){
		
	    List <List <String>> data = credentials.asLists();
	    driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
		 driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
	}



	@And("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.name("login")).click();
	  
	}

	@Then("User must successfully login to the webpage")
	public void user_must_successfully_login_to_the_webpage() {
	    String capTest = driver.findElement(By.xpath("((//div[@id='page-36']/div/div)[1]/div/p)[1]/strong")).getText();
	    Assert.assertEquals(true,capTest.contains("rajeswarymekala" ));
	    driver.close();
	}
	/*
	 * @Then("Verify login") public void verify_login() { String
	 * capText=driver.findElement(By.xpath(
	 * "((//div[@id='page-36']/div/div)[1]/ul/li/strong)[1]")).getText();
	 * if(capText.contains("ERROR")) // Test for invalid inputs {
	 * Assert.assertTrue("Invalid input - Error Page", true);
	 * 
	 * } else { Assert.assertTrue(false); }
	 * 
	 * }
	 */
	}

	
	

