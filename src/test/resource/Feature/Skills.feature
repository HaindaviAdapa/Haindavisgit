Feature: Iam doing automation funcationality of Add Jobs in orange HRM application


Background: Common Steps
Given User opens chrome browser
When User opens application URL"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"



Scenario Outline: Add Jobs
Given User enters Username as "Admin" and Password as "admin123"
When User navigates to Jobs Page
Then User creates jobs record enters JobTitle as <JobTitles> JobDescription as <JobDescriptions> and JobNote as <JobNotes>
And User logout
Then User close browser

Examples:
  
  |JobTitles|JobDescriptions|JobNotes  |
  |"TA4"    |"TA4 desc"     |"TA4 Note"|
  |"TA5"    |"TA5 desc"     |"TA5 Note"|
  |"TA6"    |"TA6 desc"     |"TA6 Note"|
