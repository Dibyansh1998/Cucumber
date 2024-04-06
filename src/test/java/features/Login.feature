Feature: Application Login

Scenario:   Home Page default login
Given User is on NetBanking Landing Page
When User log into application with Username and Password
Then Home Page is populated
And Cards are displayed