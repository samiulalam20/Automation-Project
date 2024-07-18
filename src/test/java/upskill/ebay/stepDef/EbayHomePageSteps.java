package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.EbayHomePageActions;

public class EbayHomePageSteps {
	
	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	
	@Given("^Open Ebay Homepage$")
	public void open_Ebay_Homepage() throws Throwable {
	    //Opening homepage in setup driver class
	}
	
	@When("^Search for shoes$")
	public void search_for_shoes() throws Throwable {
	    EbayHomePageActionsObj.searchShoes();
	}
	
	@When("^Search for pants$")
	public void search_for_pants() throws Throwable {
	    EbayHomePageActionsObj.searchPants();
	}
	
	@When("^Search for shirts$")
	public void search_for_shirts() throws Throwable {
	    EbayHomePageActionsObj.searchShirts();
	}
	
	@Given("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
	    EbayHomePageActionsObj.searchItems(items);
	}
	
	@Given("^Search for Big Tall Cotton Tee Shirt$")
	public void search_for_Big_Tall_Cotton_Tee_Shirt() throws Throwable {
		EbayHomePageActionsObj.searchItems("Big & Tall Cotton Tee");
	}
	
	@Given("^Search for Nike Air Jordan$")
	public void search_for_Nike_Air_Jordan() throws Throwable {
		EbayHomePageActionsObj.searchItems("Nike Air Jordan");
	}
	
	@When("^Mouse Hover to MyEbay Summary$")
	public void mouse_Hover_to_MyEbay_Summary() throws Throwable {
	    EbayHomePageActionsObj.mouseHoverEbay();
	}

	@Then("^Click on Summary$")
	public void click_on_Summary() throws Throwable {
	    EbayHomePageActionsObj.clickSummary();
	}

}
