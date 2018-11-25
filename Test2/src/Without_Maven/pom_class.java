package Without_Maven;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static_value.Value01;






public class pom_class extends Value01{
	

	//@FindBy(how=How.XPATH, using="//*[@id='bs-example-navbar-collapse-1']/ul/li[7]/a") WebElement ClicksignIn;
	@FindBy(how=How.NAME, using="email") WebElement username;
	@FindBy(how=How.XPATH, using="//*[@id=\\\"password\\\"]") WebElement Password;
	@FindBy(how=How.XPATH, using="//*[@id=\\\"loginForm\\\"]/div[4]/button") WebElement Button;
	
	


public void Login() {
	
	username.sendKeys("sajhshj");
	Password.sendKeys("ahsgajhsga");
	Button.click();
	
}}