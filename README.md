test-automation-n11AutomationCase
n11AutomationCase Adding/Deleting favourite product project for test automation, covering UI acceptance testing

Prerequisites: Install Maven v4.0 or above

Concepts Included
Cucumber BDD testing for UI
Shared state across cucumber step definitions
Dependency injection
Page Object Model pattern design
Common web page interaction methods
Commonly used test utility classes

This framework includes a feature file that prepared for
There is a feature file AdvancedSearch.feature named  and BasicSearch.feature

Tools
Maven
Cucumber
JUnit
Selenium Webdriver
Cucumber Report


Dependencies:
In order to utilise this project you need to have following dependencies in pom.xml
and you can find them https://mvnrepository.com/
Selenium-version 3.141.59
webdrivermanager - version 4.1.0
cucumber-java - version 5.7.0
cucumber-junit - version 5.7.0



Prerequite

install maven version 4.0.0 or above.


Usage
To run UI  tests only, navigate to com/n11/runners/CukesRunner.java directory and run:
CukesRunner

PS: In case any problem happens while running the tests, please check the jdk version from project settings and choose the proper one or the one installed on your computer.


Reporting

If you want to get report, go to maven lifecycle and click verify
![image](https://user-images.githubusercontent.com/103744892/171798969-38e0383c-f54c-4635-bb0f-6243499b6f5a.png)


After test finishes, target folder is created under project.
Cucumber html report can be found under target/cucumber-html-reports and can be opened with any browser.
Reports for each module are written into their respective /target directories after a successful run.
UI acceptance tests result in a HTML report for each feature in
target/cucumber-html-reports and target/default-html-reports/index.html
In the case of test failures, a screen-shot of the UI at the point of failure is embedded into the report, target/failed-html-report
