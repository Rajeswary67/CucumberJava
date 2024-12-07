Feature: MyAccount-Login Feature
Description: This feature will test login functionality

#simple login without parameters
#Scenario: Log-in with valid username and password
#Given open browser
#When Enter the url"https://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username and password
#And Click on login button
#Then User must successfully login to the webpage


#simple login without parameters
#Scenario: Log-in with valid username and password
#Given open browser
#When Enter the url "https://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered usernameand "rajeswarymekala" and password "Mythri$22"
#And Click on login button
#Then User must successfully login to the webpage


#Scenario Outline: Log-in with valid username and password
#Given open browser
#When Enter the url "https://practice.automationtesting.in/"
#And Click on My Account Menu
#And Enter registered username "<username>" and password "<password>"
#And Click on login button
#Then Verify login
 
#Examples:
#|username  | password   |
#|rajeswary | Mythri$22  |
#|rajeswarymekala| Mythri$22|
#|rajeswarymekala| Mythri|


#simple Log-in with DataTable params
Scenario: Log-in with valid username and password
Given open browser
When Enter the url "https://practice.automationtesting.in/"
And Click on My Account Menu
And Enter registered username and password
|rajeswarymekala|Mythri$22|
And Click on login button
Then user must successfully login to the web page


























