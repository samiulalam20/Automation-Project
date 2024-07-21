@regression
Feature: UpSkill Automation Practice

	Background: 
		Given Open UpSkill Automation Practice page
		When Switch to Practice iFrame

	Scenario: Mousehover Practice
		When Mouse Hover to Hover Over Me
		Then Click on Link
				
	Scenario: Dropdown Practice
		When Select Option from dropdown
		Then Verify Option selected
		
	Scenario: Alert Practice
		When Click on Alert
		Then Click on OK
		
	Scenario: Iframe Practice
		Then User should able to write on Textbox