Feature: Login Test Cases

Scenario: Login with valid Usernamd and password 

Given User Launch the application
Given User is on "LoginPage"
When User enter into textbox "Username" "admin123@gmail.com"
When User enter into textbox "Password" "admin123"
Then User click on Button "Login"
Given User is on "HomePage"
Then User click on Button "Home"



Scenario: Login with valid Usernamd and password 

Given User Launch the application
Given User is on "LoginPage"
When User enter into textbox "Username" "admin123@gmail.com"
When User enter into textbox "Password" "admin123"
Then User click on Button "Login"
Given User is on "HomePage"
Then User click on Button "Home"
Then user enter the value "Name" "sharadha"
Then User click on Radiobutton "Female"


Scenario: Login with valid Usernamd and password 

Given User Launch the application
Given User is on "LoginPage"
When User enter into textbox "Username" "admin123@gmail.com"
When User enter into textbox "Password" "admin123"
Then User click on Button "Login"
Given User is on "HomePage"
Then User click on Button "Home"
Then user enter the value "Name" "sankar"
Then User click on Radiobutton "Female"