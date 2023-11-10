Framework Development
https://petstore.swagger.io/
------------------------


Framework - <Maintain all project related files.

Objectives
-----------
1)Re-usability
2)Maintainability
3)Readability

Hybrid Driven
--------------




Phases
--------------
1)Understanding requirement

    -Functional specification(static)
    -Swagger(info document)
2)Choose  automation tool (Rest Assured Library)

3)Design

    -Create maven project
    -Update pom.xml with required dependencies.
    -Create folder structure

4.1)Development 

    -Create Routes.java ----> contains Url's
    -Create UserEndPoints.java ----> CRUD method implementation
    -Create test cases (class UserTests)
    -Create data driven test (excel sheet data, ExcelUtility,Dataproviders)

4.2)Development reports

    -Generate extent reports (add extentreports in POM)
    -Extent reportutility
    -testng.xml file

4.3)Add Logs

    -log4j2 dependency
    -log4j2.xml--->src/test/resource

5)Execution + CI 

    -Execute tests using pom.xml within IDE(try in terminal)
    -Execute tests using pom.xml in comand prompt.
    -commit code in local repository (git)
    -push your code to remote repository (github)
    -run project from jenkins ( from github)
    