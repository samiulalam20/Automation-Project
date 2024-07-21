package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import upskill.ebay.pageElements.UpSkillPracticeLocators;
import upskill.utilities.SetupDrivers;

public class UpSkillPracticeActions {
	
	UpSkillPracticeLocators UpSKillPracticeLocatorsObj;
	
	public UpSkillPracticeActions(){
		UpSKillPracticeLocatorsObj = new UpSkillPracticeLocators();
		PageFactory.initElements(SetupDrivers.driver, UpSKillPracticeLocatorsObj);
	}
	
	public void loadUpSkillPracticePage(){
		SetupDrivers.driver.get("https://www.upskillconsultancy.com/automation-practice");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void mouseHover() throws Exception{
		Actions actions= new Actions(SetupDrivers.driver);
		actions.moveToElement(UpSKillPracticeLocatorsObj.linkMouseHover);
		actions.perform();
		Thread.sleep(3000);
	}
	
	public void clickLink() throws Exception{
		UpSKillPracticeLocatorsObj.linkLink.isEnabled();
		UpSKillPracticeLocatorsObj.linkLink.click();
		Thread.sleep(3000);
	}
	
	public void selectDropDown() throws Exception{
		Select dropdown = new Select(UpSKillPracticeLocatorsObj.btnDropDown);
		dropdown.selectByValue("1");
		Thread.sleep(3000);
	}
	
	public void verifyDropDown() throws Exception{
		Assert.assertEquals("Option 1", UpSKillPracticeLocatorsObj.optionsdd.getText());
		Thread.sleep(3000);
	}
	
	public void clickAlert() throws Exception{
		UpSKillPracticeLocatorsObj.bxAlert.click();
		Thread.sleep(3000);
	}
	
	public void clickOk() throws Exception{
		SetupDrivers.driver.switchTo().alert().accept();
		Thread.sleep(3000);
	}
	
	public void switchIframe() throws Exception{
		SetupDrivers.driver.switchTo().frame("htmlComp-iframe");
		Thread.sleep(3000);
	}
	
	public void writeTextbox() throws Exception{
		UpSKillPracticeLocatorsObj.txtbx.sendKeys("Toyota");
		Thread.sleep(3000);
	}

}
