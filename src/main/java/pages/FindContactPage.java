package pages;

import org.testng.annotations.Test;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class FindContactPage extends OpentapsWrappers {
	public FindContactPage() {

		if(!verifyTitle("Find Contacts | opentaps CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}

	}

  public FindContactPage enterFirstName(String firstName) {
	  
	  enterByXpath(prop.getProperty("FindContact.Firstname.Xpath"), firstName);
	  return this;
  }

  public FindContactPage enterLastName(String lastName) {
	  
	  enterByXpath(prop.getProperty("FindContact.Lastname.Xpath"), lastName);
	  return this;
  }


public FindContactPage clickFindContactbutton() {
	
	clickByXpath(prop.getProperty("FindContact.FindContactButton.Xpath"));
	return this;
	
}
}