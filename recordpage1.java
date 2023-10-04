package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class recordpage1 {

	@FindBy (id="Campaigns_editView_fieldName_campaignname")
	private WebElement name;
	
	@FindBy (name="campaignstatus")
	private WebElement campainsts;
	
	
		
	@FindBy (id="product_id_display")
	private WebElement product;
	
	@FindBy (id="Campaigns_editView_fieldName_closingdate")
	private WebElement eclosedate;
	
	public WebElement getEclosedate() {
		return eclosedate;
	}

	public WebElement getCampainsts() {
		return campainsts;
	}

	@FindBy (id="Campaigns_editView_fieldName_targetsize")
	private WebElement size;
	
	@FindBy (name="assigned_user_id")
	private WebElement assigned;
	
	@FindBy (name="campaigntype")
	private WebElement campaintype;
	
	@FindBy (id="Campaigns_editView_fieldName_targetaudience")
	private WebElement Type;
	
	
	@FindBy (id="Campaigns_editView_fieldName_sponsor")
	private WebElement sponsor;
	
	
	@FindBy (xpath="//input[@class='form-control']")
	private WebElement num;
	
	
	@FindBy (id="Campaigns_editView_fieldName_budgetcost")
	private WebElement bcost;
	
	@FindBy (name="expectedresponse")
	private WebElement expectedres; 
	
	public WebElement getAssigned() {
		return assigned;
	}

	public WebElement getCampaintype() {
		return campaintype;
	}

	public WebElement getExpectedres() {
		return expectedres;
	}

	@FindBy (id="Campaigns_editView_fieldName_expectedsalescount")
	private WebElement scount;
	
	@FindBy (id="Campaigns_editView_fieldName_expectedresponsecount")
	 private WebElement rcount;
	
	@FindBy (id="Campaigns_editView_fieldName_expectedroi")
	private WebElement eroi;
	
	@FindBy (id="Campaigns_editView_fieldName_actualcost")
	private WebElement acount;
	
	
	@FindBy (id="Campaigns_editView_fieldName_expectedrevenue")
	private WebElement expected;
	
	@FindBy (id="Campaigns_editView_fieldName_actualsalescount")
	private WebElement actualscount;
	
	@FindBy (id="Campaigns_editView_fieldName_actualresponsecount")
	private WebElement arcount;
	
	public WebElement getEroi() {
		return eroi;
	}

	public void setEroi(WebElement eroi) {
		this.eroi = eroi;
	}

	public WebElement getArcount() {
		return arcount;
	}

	public void setArcount(WebElement arcount) {
		this.arcount = arcount;
	}

	@FindBy (id="Campaigns_editView_fieldName_actualroi")
	 private WebElement roi;
	
	@FindBy (id="Campaigns_editView_fieldName_description")
	 private WebElement desc;

	public WebElement getName() {
		return name;
	}

	public WebElement getProduct() {
		return product;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getType() {
		return Type;
	}

	public WebElement getSponsor() {
		return sponsor;
	}

	public WebElement getNum() {
		return num;
	}

	public WebElement getBcost() {
		return bcost;
	}

	public WebElement getScount() {
		return scount;
	}

	public WebElement getRcount() {
		return rcount;
	}

	public WebElement getAcount() {
		return acount;
	}

	public WebElement getExpected() {
		return expected;
	}

	public WebElement getActualscount() {
		return actualscount;
	}

	public WebElement getRoi() {
		return roi;
	}

	public WebElement getDesc() {
		return desc;
	}
	@FindBy (xpath="(//input[@class='select2-input'])[3]")
	private WebElement dropdown;
	
	public WebElement getDropdown() {
		return dropdown;
	}

	@FindBy (xpath="//button[text()='Save']")
	WebElement save;

	public WebElement getSave() {
		return save;
	}
}


