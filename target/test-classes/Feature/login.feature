Feature: Login to Application

	
  Scenario Outline: Login to Application
	Given Open browser
	Then Click on signin button 
	Then Enter "<userid>" and "<password>" 
	Then Click on submit button
   
    
@Valid
    Examples: 
    | userid                | password    | 
    | saurabh123@gmail.com |   12345    |

@Invalid
    Examples: 
    | userid                | password    | 
    | saurabh123@gmail.com |   123456    |