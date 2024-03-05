package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;


public class LoginSteps {
	
	WebDriver driver;
	
	
	@Given("^User is on Application Page$")
	public void user_is_on_Application_Page() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "src\\main\\java\\resources\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.freecrm.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	}

	@When("^Application Page Title is Free CRM$")
	public void application_Page_Title_is_Free_CRM() {
	   String Actualtitle = driver.getTitle();
	   String Expectedtitle = "free crm home";
	   Assert.assertEquals(Expectedtitle, Actualtitle);
	   driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
	}

	@Then("^User Enters the Username and Password$")
	public void user_Enters_the_Username_and_Password(){
	   driver.findElement(By.name("email")).sendKeys("abdulrahuman0495@gmail.com");
	   driver.findElement(By.name("password")).sendKeys("Abdul@007");
	   

	}

	@Then("^User clicks the Login Button$")
	public void user_clicks_the_Login_Button() {
		   driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

	}

	@When("^User Navigate to user profile Page$")
	public void user_Navigate_to_user_profile_Page(){
	   String Actualtitle = driver.getTitle();
	   String Expectedtitle = "Cogmento CRM";
	   Assert.assertEquals(Expectedtitle, Actualtitle);
	}

	
}

