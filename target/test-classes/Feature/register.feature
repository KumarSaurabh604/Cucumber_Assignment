Feature: Register into apllication

	
  Scenario Outline: Register into application
	Given open browser
	Then click on signin button 
	Then enter "<email>" 
	Then click create button
	Then Fill "<Firstname>" and "<Lastname>" and "<passwword>" and "<Fname>" and "<Lname>" and "<Address>" and "<City>" and "<State>" and "<ZipCode>" and "<Mobile>"
	Then Click submit Button
	
	@validRegistration
		Examples:	
		|email							|Firstname |Lastname|password|Fname|Lname|Address     |City     |State 				|Zipcode|Mobile		 |
		|anupkumar@gmail.com|Anup      |Kumar   |12345   |Anup |Kumar|Khora Colony|Ghaziabad|Uttar Pradesh|20301	|9876543211|
		
	@invalidRegistration
		Examples:
		|email							|Firstname |Lastname|password|Fname|Lname|Address     |City     |State 				|Zipcode|Mobile		 |
		|anupkumar123@gmail.com|Anup      |Kumar   |12345   |Anup |Kumar|Khora Colony|Ghaziabad|Uttar Pradesh|20301	|          |