package upskill.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UpSkillPracticeLocators {
	
	//Mouse Hover
	@FindBy(xpath="//button[contains(text(),'Hover Over Me!')]")
	public WebElement linkMouseHover;
		
	//Link
	@FindBy(xpath="//a[contains(text(),'Link 1')]")
	public WebElement linkLink;
		
	//DropDown
	@FindBy(xpath="//select[@class= 'form-select']")
	public WebElement btnDropDown;
			
	//Validate option 1
	@FindBy(xpath="//*[text()='Option 1']")
	public WebElement optionsdd;
	
	//Alert Box
	@FindBy(xpath="//button[contains(text(),'Alert')]")
	public WebElement bxAlert;
	
	//Textbox
	@FindBy ( xpath = "//*[contains(@placeholder,'search')]")
	public WebElement txtbx;

}
