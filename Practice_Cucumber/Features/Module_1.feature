@FeatureFile1
Feature: Handle WebTable

Background:
 Given User Launch the Chrome Browser 

@Regression

Scenario Outline: 


When Enter the url "<URL>"
And Enter the username "<user>"
And Enter the password "<pass>"
And Click on the Login
Then Verify the Login 

Examples: 

|URL|user|pass|
|http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx|Tester|test|




@Regression

Scenario Outline: 


When Enter the url "<URL>"
And Enter the username "<user>"
And Enter the password "<pass>"
And Click on the Login 
When get the data from the webtable

Examples: 

|URL|user|pass|
|http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx|Tester|test|

