# this is name of feature
Feature: Login
#this is name of scenario

@test
Scenario: Login test to TekSchool Test Environment page

Given User is on Tekschool page
When User Click on Test Environment link
Then User should see Test Environment page
