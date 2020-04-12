Feature: Sprawdzam tylko logowanie

Scenario: Niepoprawne logowanie
	Given Open browser
	When Enter Login and Password
	Then Get the information
	
	