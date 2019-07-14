package pages;

import cucumber.api.java.en.Given;
import libraries.Annotations;

public class MyLeadsPage extends Annotations {
	
	@Given("Click Create Leads Link")
	public CreateLeadPage clickCreateLead() {
		driver.findElementByLinkText("Create Lead")
		.click();
		return new CreateLeadPage();
		
	}

}
