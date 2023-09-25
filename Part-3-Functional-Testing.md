Functional testing focuses on validating whether the software is working as per the requirements and fulfilling its intended purpose. In our case, we have tested the [login and register](https://git.ecdf.ed.ac.uk/sdoc2223/Morgan_Group/-/tree/main/Testing/Test%20Cases) features because they were available at the beginning of the implementation phase and there was sufficient time to test them. Valid and invalid cases were considered where the valid cases check if the application correctly allows users to log in and register when they provide correct information while the invalid cases test how the website handles incorrect input, such as invalid credentials or empty fields, and whether it displays appropriate error messages or behaves as expected. 

We used [Selenium IDE](https://git.ecdf.ed.ac.uk/sdoc2223/Morgan_Group/-/blob/main/Testing/Test%20Cases/Account-Related-Test-Cases/Game_Shelf_Tests.side) to conduct the tests as it is a popular tool for automating browser actions and conducting functional testing, combined with [walkthrough](https://git.ecdf.ed.ac.uk/sdoc2223/Morgan_Group/-/blob/main/Testing/Test%20Cases/TestCaseTemplate.md) to reveal more failure cases. The initial results show that although users the register and login functionality produce results as expected, there a number of failure cases or not ideal outcomes which include:
1. Users can enter characters in the phone section. The input is not validated in the client side and it is accepted in the database resulting in wrong information added to the database. 
2. When the user enters invalid register information, the page is redirected to the login tab while the message appears in the register tab as it should. Furthermore, all fields are reset which is not user-friendly.
3. There are no welcoming messages to welcome users into the website. From a usability perspective, it is better to welcome the user formally, then redirect. 

**A Note on the Navigation:**

In general, there are links that do not work because the pages are not implemented properly such as the Stores and Collections. It is better to create friendly error messages to users than display automatic pages and scare them thinking they have committed a serious action.


