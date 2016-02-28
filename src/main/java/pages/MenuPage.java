package pages;

import org.testng.annotations.Test;

import utils.Reporter;
import wrappers.OpentapsWrappers;

public class MenuPage extends OpentapsWrappers {
	public MenuPage() {

		if(!verifyTitle("My Home | opentaps CRM")){
			Reporter.reportStep("This is NOT login page", "FAIL");
		}

	}

  public LeadsPage navigateToLeadPage() {
	  clickByLink(prop.getProperty("MenuPage.Leads.LinkText"));
	  return new LeadsPage();
	  
  }
  

  public ContactPage navigateToContactPage() {
	  clickByLink(prop.getProperty("MenuPage.Contact.LinkText"));
	  return new ContactPage();
	  
  }

}
