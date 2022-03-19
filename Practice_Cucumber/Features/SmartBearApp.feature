@FeatureFile3
Feature: Automation_SmartBear

Background: 

Given User Launch the Chrome Browser

@Sanity2
Scenario: Login_to_smartBear


 When User Enter the Url
 And  Enter the Username and Password
 And Click on the Login
 Then Verify the Login 
 
 
 @Sanity2
 Scenario: Order_Process
 

 When User Enter the Url
 And  Enter the Username and Password
 And Click on the Login
 Then Verify the Login 
 When User enter the Order button
 And Enter the product and Quality information
 And Enter the price,Discout and total
 And Enter the Address Information
 And Enter the Payment Information 
 And Click on the Process
 Then Verify the process

 
