# demo-project

This project has custom utilities to make rest webservices requests, browser initialization and webElements interactions, initialize configurations, create data provider objects, reporting and logging capabilities using Selenium webdriver 2.0, Java, TestNG, Jersey and Jackson libraries. Some Test cases are added to demonstrate the functionalities. 

Steps to Run the Project

1) Create clone of the git repository in your local.

```
git clone https://github.com/dgupta9i/demo-project.git
```

2) Three testng-xmls are created to run UI, API or BOTH test cases.

To RUN UI Tests execute mvn goal as

```
mvn clean install -Dtestng-xml=testng-xml/UITest.xml
```
                     
To RUN only API Tests execute mvn goal as 

```
mvn clean install -Dtestng-xml=testng-xml/apiTest.xml
```
                      
To run Both UI and API tests execute mvn goal as

```
mvn clean install -Dtestng-xml=testng-xml/bothTest.xml
```
   
By Default the test cases will be executed on "chrome" and make sure that the chrome-driver is placed in the environment variable $PATH, but support is also provided to run it on "firefox". For that edit the src/main/resources/test.properties file for property `browser.type=firefox`
   
After execution, a test output report is created in the test-output folder with name as  Automated_Report_${<date_time>}.html using EXTENT Report Tool. A sample report is attached;
![alt tag](https://github.com/dgupta9i/demo-project/blob/master/report-screenshot.png)

# Environment needs:
Need Maven and java 8 configured on the system where the maven goals are executed.  
