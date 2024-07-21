package upskill.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import upskill.ebay.pageElements.UpSkillPracticeLocators;
import upskill.utilities.SetupDrivers;

public class UpSkillPracticeActions {
	
	UpSkillPracticeLocators UpSkillPracticeLocatorsObj;
	
	public UpSkillPracticeActions(){
		UpSkillPracticeLocatorsObj = new UpSkillPracticeLocators();
		PageFactory.initElements(SetupDrivers.driver, UpSkillPracticeLocatorsObj);
	}
	
	public void loadUpSkillPracticePage(){
		SetupDrivers.driver.get("https://www.upskillconsultancy.com/automation-practice");
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public void mouseHover() throws Exception{
		Actions actions= new Actions(SetupDrivers.driver);
		actions.moveToElement(UpSkillPracticeLocatorsObj.linkMouseHover);
		actions.perform();
		Thread.sleep(3000);
	}
	
	public void clickLink() throws Exception{
		UpSkillPracticeLocatorsObj.linkLink.isEnabled();
		UpSkillPracticeLocatorsObj.linkLink.click();
		Thread.sleep(3000);
	}
	
	public void selectDropDown() throws Exception{
		Select dropdown = new Select(UpSkillPracticeLocatorsObj.btnDropDown);
		dropdown.selectByValue("1");
		Thread.sleep(3000);
	}
	
	public void verifyDropDown() throws Exception{
		Assert.assertEquals("Option 1", UpSkillPracticeLocatorsObj.optionsdd.getText());
		Thread.sleep(3000);
	}
	
	public void clickAlert() throws Exception{
		UpSkillPracticeLocatorsObj.bxAlert.click();
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
		UpSkillPracticeLocatorsObj.txtbx.sendKeys("Toyota");
		Thread.sleep(3000);
	}
	
	public void clickRadio() throws Exception{
		UpSkillPracticeLocatorsObj.rdbtn.click();
		Thread.sleep(3000);
	}
	
	public void clickCheckbox() throws Exception{
		UpSkillPracticeLocatorsObj.checkbx.click();
		Thread.sleep(3000);
	}
	
	public void openWindow() throws Exception{
		UpSkillPracticeLocatorsObj.openwindow.click();
		Thread.sleep(3000);
	}
	
	public void switchWindow() throws Exception{
		for(String winhandle : SetupDrivers.driver.getWindowHandles()){
			SetupDrivers.driver.switchTo().window(winhandle);
		}
		Thread.sleep(3000);
	}
	
	public void clickConfirm(){
		UpSkillPracticeLocatorsObj.clickConfirm.click();
	}
	
	public void verifyGreat(){
		SetupDrivers.driver.switchTo().alert().accept();
		Assert.assertEquals("Great!", UpSkillPracticeLocatorsObj.clickConfirm.getText());
		SetupDrivers.driver.switchTo().alert().accept();
	}

}
