package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage1 {

	@FindBy (xpath="(//span[@class='app-icon fa fa-bars'])[1]")
	private WebElement bar;

	public WebElement getBar() {
		return bar;
	}
	
	
	@FindBy (xpath="//span[text()=' MARKETING']")
	private WebElement market;

	public WebElement getMarket() {
		return market;
	}
	
	@FindBy (xpath="//span[text()=' Campaigns']")
	private WebElement champain;

	public WebElement getChampain() {
		return champain;

	}

	
	
	
	
	
	
	
	
	
	
	
	
}
