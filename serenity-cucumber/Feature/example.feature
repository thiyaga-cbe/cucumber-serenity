Feature: Testing the sample application using cucumber
Scenario: Testing zoo website
Given navigate to zoo website
When 	Enter text in textbox 
Then 	Assert the dynamic text 
And 	Click on continue button
And 	Select value from dropdown box
And  Click continue button 
Then Assert the url