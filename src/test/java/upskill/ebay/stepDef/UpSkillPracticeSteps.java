package upskill.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import upskill.ebay.pageAction.UpSkillPracticeActions;

public class UpSkillPracticeSteps {
	
	UpSkillPracticeActions UpSkillPracticeActionsObj = new UpSkillPracticeActions();
	
	@Given("^Open UpSkill Automation Practice page$")
	public void open_UpSkill_Automation_Practice_page() throws Throwable {
	    UpSkillPracticeActionsObj.loadUpSkillPracticePage();
	}
	
	@When("^Mouse Hover to Hover Over Me$")
	public void mouse_Hover_to_Hover_Over_Me() throws Throwable {
	    UpSkillPracticeActionsObj.mouseHover();
	}

	@Then("^Click on Link$")
	public void click_on_Link() throws Throwable {
	    UpSkillPracticeActionsObj.clickLink();
	}

	@When("^Select Option from dropdown$")
	public void select_Option_from_dropdown() throws Throwable {
	    UpSkillPracticeActionsObj.selectDropDown();
	}

	@Then("^Verify Option selected$")
	public void verify_Option_selected() throws Throwable {
	    UpSkillPracticeActionsObj.verifyDropDown();
	}

	@When("^Click on Alert$")
	public void click_on_Alert() throws Throwable {
	    UpSkillPracticeActionsObj.clickAlert();
	}

	@Then("^Click on OK$")
	public void click_on_OK() throws Throwable {
	    UpSkillPracticeActionsObj.clickOk();
	}

	@When("^Switch to Practice iFrame$")
	public void switch_to_Practice_iFrame() throws Throwable {
	    UpSkillPracticeActionsObj.switchIframe();
	}

	@Then("^User should able to write on Textbox$")
	public void user_should_able_to_write_on_Textbox() throws Throwable {
	    UpSkillPracticeActionsObj.writeTextbox();
	}
	
	@Then("^Click on Radio (\\d+)$")
	public void click_on_Radio(int arg1) throws Throwable {
	    UpSkillPracticeActionsObj.clickRadio();
	}

	@Then("^Click on Checkbox (\\d+)$")
	public void click_on_Checkbox(int arg1) throws Throwable {
	    UpSkillPracticeActionsObj.clickCheckbox();
	}
	
	@When("^Click on Open Window$")
	public void click_on_Open_Window() throws Throwable {
	    UpSkillPracticeActionsObj.openWindow();
	}

	@Then("^Switch to new Window$")
	public void switch_to_new_Window() throws Throwable {
	    UpSkillPracticeActionsObj.switchWindow();
	}
	
	@When("^Click on Confirm$")
	public void click_on_Confirm() throws Throwable {
	    UpSkillPracticeActionsObj.clickConfirm();
	}

	@Then("^Verify Great$")
	public void verify_Great() throws Throwable {
	    UpSkillPracticeActionsObj.verifyGreat();
	}
	
	@When("^Switch to iframe Home$")
	public void switch_to_iframe_Home() throws Throwable {
	    UpSkillPracticeActionsObj.switchToIframeHome();
	}

	@Then("^Click on Home$")
	public void click_on_Home() throws Throwable {
	    UpSkillPracticeActionsObj.clickOnHome();
	}

}
