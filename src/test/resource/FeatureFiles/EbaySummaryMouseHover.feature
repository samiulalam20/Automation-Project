@regression
Feature: UpSkill Automation Practice

	Scenario: Mousehover Practice
		Given Open UpSkill Automation Practice page
		When Mouse Hover to Hover Over Me
		Then Click on Link
		
		
	Scenario: Dropdown Practice
		Given Open UpSkill Automation Practice page
		When Select Option from dropdown
		Then Verify Option selected
		
	Scenario: Alert Practice
		Given Open UpSkill Automation page
		When Click on Alert
		Then Click on OK