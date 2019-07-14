package pages;

import cucumber.api.java.en.And;
import libraries.Annotations;

public class CreateLeadPage extends Annotations {
	
	@And("Type Company Name (.*)")
	public CreateLeadPage typeCompanyName(String cName) {
		driver.findElementById("createLeadForm_companyName")
		.sendKeys(cName);
		return this;
	}
	
	@And("Type First Name (.*)")
	public CreateLeadPage typeFirstName(String fName) {
		driver.findElementById("createLeadForm_firstName")
		.sendKeys(fName);
		return this;
	}
	
	@And("Type Last Name (.*)")
	public CreateLeadPage typeLastName(String lName) {
		driver.findElementById("createLeadForm_lastName")
		.sendKeys(lName);
		return this;
	}
	
	@And("Click on the Create Lead Button")
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElementByClassName("smallSubmit")
		.click();
		return new ViewLeadPage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
