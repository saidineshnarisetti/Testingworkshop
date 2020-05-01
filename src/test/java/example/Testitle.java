package example;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Testitle {
	private WebDriver driver;
  @Test
  public void testEasy() {	
	  
		driver.get("https://apps-stage.juniper.net/feature-explorer/");  
		String title = driver.getTitle();				 
		AssertJUnit.assertTrue(title.contains("Feature Explorer - Juniper Networks")); 		
	}	
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","src/drivers/chromedriver");
		driver = new ChromeDriver();
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();	
  }

}
