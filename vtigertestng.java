package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import pom.campainpage1;
import pom.homepage1;
import pom.loginpage1;
import pom.recordpage1;

public class vtigertestng {
WebDriver driver;

@Test
public void vtiger() throws IOException{
		FileInputStream fis = new FileInputStream("src\\test\\resources\\vtiger.properties");
	
	Properties p = new Properties();
	
	p.load(fis);
	String BROWSER =p.getProperty("browser");

	
	if(BROWSER.equals("Chrome")) {
		driver=new ChromeDriver();
		
	}else if (BROWSER.equals("firefox")) {
		driver=new FirefoxDriver();
		
	}else {
		driver=new EdgeDriver();
		
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));

String URL =p.getProperty("url");
String NAME=p.getProperty("CampaignName");
String SIZE =p.getProperty("TargetSize");
String TARGET=p.getProperty("TargetAudience");
String SPONSER=p.getProperty("Sponsors");
//String STATUS =p.getProperty("status");
String ESALE=p.getProperty("ExpectedSalesCount");
String ERES =p.getProperty("ExpectedResponseCount");
String ASALE=p.getProperty("ActualSalesCount");
String ARES=p.getProperty("ActualResponseCount");
String DESC=p.getProperty("Description");
String NUM=p.getProperty("NumSent");
String BCOST=p.getProperty("BudgetCost");
String EXROI=p.getProperty("ExpectedROI");
String ACOST=p.getProperty("ActualCost");
String EXREV=p.getProperty("ExpectedRevenue");
String ACROI=p.getProperty("ActualROI");

String DATE=p.getProperty("ExpectedCloseDate");
driver.get(URL);
	
	
loginpage1 l = new loginpage1();
PageFactory.initElements(driver, l);
l.getSign().click();

homepage1 h = new homepage1();
PageFactory.initElements(driver, h);
h.getBar().click();
WebElement g = h.getMarket();
Actions a= new Actions(driver);
a.moveToElement(g);
a.perform();
h.getChampain().click();

campainpage1 c = new campainpage1();
PageFactory.initElements(driver, c);
c.getRecord().click();



recordpage1 r = new recordpage1();
PageFactory.initElements(driver, r);
r.getName().sendKeys(NAME);
r.getSize().sendKeys(SIZE);
r.getEclosedate().sendKeys(DATE);
r.getEclosedate().sendKeys(Keys.ENTER);
r.getType().sendKeys(TARGET);
r.getSponsor().sendKeys(SPONSER);
//r.getCampainsts().click();
//r.getCampainsts().sendKeys(STATUS);
r.getScount().sendKeys(ESALE);
r.getRcount().sendKeys(ERES);
r.getActualscount().sendKeys(ASALE);
r.getArcount().sendKeys(ARES);
r.getDesc().sendKeys(DESC);
r.getNum().sendKeys(NUM);
r.getBcost().sendKeys(BCOST);
r.getEroi().sendKeys(EXROI);
r.getAcount().sendKeys(ACOST);
r.getExpected().sendKeys(EXREV);
r.getRoi().sendKeys(ACROI);
r.getSave().click();













	
}	
	
}
