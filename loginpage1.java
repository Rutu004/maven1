package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage1 {

	@FindBy (xpath="(//button[@type='submit'])[1]")
	private WebElement sign;

	public WebElement getSign() {
		return sign;
	}
	
	
	
	
	
	
	
	
	
	
	
}
