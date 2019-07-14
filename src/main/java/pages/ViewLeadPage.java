package pages;

import cucumber.api.java.en.Then;
import libraries.Annotations;

public class ViewLeadPage extends Annotations {
	
	@Then("Verify First Name (.*)")
	public ViewLeadPage verifyFirstName(String fName) {
		String text = driver.findElementById("viewLead_firstName_sp")
		.getText();
		if(text.equals(fName)) {
			System.out.println("First name matches with input data "+fName);
		}else {
			System.err.println("First name not matches with input data "+fName);
		}
		return this;
	}

	
	
	
	
	
	
}
