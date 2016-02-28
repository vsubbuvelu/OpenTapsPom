package pages;

import org.testng.annotations.Test;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class ContactPage extends OpentapsWrappers {
	public ContactPage() {

		if(!verifyTitle("My Contacts | opentaps CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}

	}

  public FindContactPage navigateToFindContactPage() {
	  clickByXpath(prop.getProperty("Contact.FindContactLink.Xpath"));
	  return new FindContactPage();
	  
  }
}
