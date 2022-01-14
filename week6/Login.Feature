Feature: Login with Leaftap application 

Scenario Outline: Login with positive Credential

Given Open The chromeBrowser
And Load the url application 

And Enter username as <username>
And Enter the password as <password>
When Click on login button 
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed 

Examples: 
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@Functoinal
Scenario: Login with negative credential

Given Enter username as 'Demo'
And Enter the password as 'crmsfa'
When Click on login button 
But Error msg should displayed

