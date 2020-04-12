Feature: Logowanie

Scenario: Dobrze sie zalogowales
	Given User Launch Chrome browser
	When User opens URL "http://automationpractice.com/index.php?controller=authentication&back=my-account"
	And User enters Email as "aaaaa@bbbbb.ccc" and Password as "haselko"
	And Click on Login
	Then Page Description should be "AUTHENTICATION"
	And close browser
	