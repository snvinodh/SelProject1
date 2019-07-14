package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import libraries.Annotations;

public class MyHomePage extends Annotations {
	
	//Initialize all the elements
	public MyHomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.LINK_TEXT, using = "Leads")
	WebElement eleLeads;
	
	/*@FindBys({@FindBy(how = How.LINK_TEXT, using = "Leads"),
			@FindBy(how = How.XPATH, using = "//a[@href='/crmsfa/control/leadsMain']")})
	WebElement eleLeads1;*/
	
	@FindAll({@FindBy(how = How.LINK_TEXT, using = "Leads"),
	@FindBy(how = How.XPATH, using = "//a[@href='/crmsfa/control/leadsMain']")})
	WebElement eleLeads2;
	
	@Given("Click Leads Tab")
	public MyLeadsPage clickLeadsTab() {
		//driver.findElementByLinkText("Leads").click();
		eleLeads.click();
		return new MyLeadsPage();
	}
	
	
	
	
	
	
	
	
	

}
