package runner_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Without_Maven.pom_class;
import static_value.Value01;

public class RunTest_1  {
	WebDriver driver;////
  @Test
  public void f() {
	  pom_class Test = PageFactory.initElements(driver, pom_class.class);
	  System.setProperty("webdriver.chrome.driver","D://Selenium Testing Training//chromedriver.exe");
		
	
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(Value01.URL);
	  Test.Login();
  }
}