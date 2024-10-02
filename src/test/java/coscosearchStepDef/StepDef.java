package coscosearchStepDef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	
	@Given("user is on the google search browser")
	public void user_is_on_the_google_search_browser() throws InterruptedException {
		
		
		driver = new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);
	}

		
		@When("user enters {string} in search box")
		public void user_enters_in_search_box(String string) throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@ class='gLFyf']")).sendKeys(string);			
		Thread.sleep(3000);
		
	    
	}

		@Then("validate dropdown contain {string}")
		public void validate_dropdown_contain(String string) throws InterruptedException {
			
			List<WebElement> dropDown = driver.findElements(By.xpath("//*[@class='mkHrUc']//li"));
			
			SoftAssert sf = new SoftAssert();
			
			for(WebElement i : dropDown) {
			System.out.println(i.getText());
			sf.assertTrue(i.getText().toLowerCase().contains(string.toLowerCase()));}	
			
			
		
		driver.quit();
		sf.assertAll();
		
		   
	}
	


}
