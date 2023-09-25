# Front-end
Most implementations of the front-end part exactly followed the planned prototype while some slight but necessary changes were made to other parts. The comparisons between the prototype and the actual implementation of each page are demonstrated below accordingly. 

| Prototype| Implement | Comparison |
| ------ | ------ | ------ |
| ![header](uploads/2bf6ca870f81b3a16da5cf155465e1a7/header.jpg)| ![header](uploads/2ec3b3deab219bb17d247ca9ef92c119/header.png)|**header bar** <br>1. The contents of the header bar are almost the same. <br>2. Added Collection which was left out when designing the prototype.<br>3. Added a search bar since a search function is planned to add in future development.<br>4. Turned the labels of login and profile from text into icons to make the interface more user-friendly and nice. |
| ![index](uploads/798fad1ed74c8b843d5e54f173c7f634/index.jpg)|![index](uploads/70cf411ae8b3b15c1508f27bb0c7dc2e/index.png)| **index page** <br>1. Kept most of the original design.<br>2. Changed the position of the subtitles to the center to make the index page more symmetrical, beautiful, and focused. <br>3. Removed the search bar of the map since it will not be implemented in the first iteration.|
| ![signup](uploads/2851bcb5fbaf69efb7fd4b29c67e4938/signup.jpg)| ![signup](uploads/54c184ce2da865d2b79ad33ad1ba7d2b/signup.jpg)| **sign up** <br>1. The information requiring the user to insert is the same as the prototype.<br>2. Removed the social media register button since the function will not be developed.<br>3. Moved the prompt message from the front of each line into the blank to make the appearance tidier.|
| ![login](uploads/d4cdc29114675c0163f3c09afdc48e70/login.jpg)| ![login.jpg](uploads/4d719adbb37bd66443f7f5086b1e9a14/login.jpg.png)| **login**<br>1. The identity to login is decided to change from email to username thus the corresponding blank title is changed.<br>2. Removed the social media register button since the function will not be developed.<br>3. Adjusted the position of the text to make the appearance more balanced and clear.|
| ![profile](uploads/3999da138bb1395290ec27bc6c8d49f8/profile.jpg)| ![account](uploads/6ce6a99b15da8ad231e06479b87212d4/account.jpg)| **profile**<br>1. The content involves in the profile stays the same as the prototype. <br>2. The layout of the basic information of the user is as planned in the prototype. <br>3. For other information (e.g. Games, Collections, and Latest Reviews), instead of displaying all of them in the same page, we put them into sub-menus to make the interface tidier.|
| ![game-list](uploads/ebc4d1d3777e948f957104ab75ea3035/game-list.jpg)|![game](uploads/0e95c531056ad22ef613727f12b7f4ba/game.png) | **game list**<br>1. The elements of planned functions (list games and info, search, sort, filter, add a new game) are all included.  <br>2. The layout of these elements was adjusted for more convenient user interaction: <br>- the relational position of the game title and the rating stars were changed since the original design is not clear which game the rating is to when going down to the page. <br>- instead of making a sub-menu for the filter, put the filter categories in to check box beside the list for the user to see what categories exist and filter the wanted game faster and easier.|
| ![game-detail](uploads/212f4375663c30a44d25d5a3f94a48c5/game-detail.jpg)| ![game-detail](uploads/fe9197d03d02b70a0e1713e0361aa551/game-detail.png)| **game detail**<br>1. The content involves in the game detail stays the same as the prototype. <br>2. The layout of the basic information of the game is as planned in the prototype. <br>3. For other information (e.g. Resources, Friends Own This Game, and Reviews), instead of displaying all of them in the same page, we put them into sub-menus to make the interface tidier.|
| ![collection](uploads/9237026399a4f91f63afc3a165f1531a/collection.jpg)| ![Collections_Page](uploads/feef1c955f1bc694a081d252ef08fa07/Collections_Page.png)| **collection**<br>1. The implement of the collection is mostly the same as the prototype shows. <br>2. The original design is too tide so that the relational position of the searcher, sorter and filter were changed from parallel to vertical for a nicer appearance. |
| ![community-list](uploads/57142bbb523101bffd30bbf9ad6164d4/community-list.jpg)| ![CommunityList](uploads/4ff34f6bbeb7701c21dac2526b257b92/CommunityList.png)| **community list**<br>1. The elements in the prototype are implemented.<br>2. Added a map so that users can find the location of communities more easily.|
| ![community-detail](uploads/93f66e4f153bf3966cafcbc92cc523c0/community-detail.jpg)| ![Community-Details](uploads/c57dc0917042eb9b3e22116c357985c7/Community-Details.png)| **community detail** <br>1. The content involves in the community detail stays the same as the prototype. <br>2. The layout of the basic information of the community is as planned in the prototype. <br>3. For other information (e.g. Member, and Public Chat), instead of displaying all of them in the same page, we put them into sub-menus to make the interface tidier.|
| ![item](uploads/1e762646a172391de4dcd997ddf70cf4/item.jpg)| ![ItemDetails](uploads/c34c22c13bdd07f66c573e7dd6cb53d6/ItemDetails.png)| **item** <br>The implementation is the same as the prototype.|

# Back-end

![image](uploads/3e416aa83108a1ba0a6867851c7bec29/image.png)  

The back-end program is a web service built on the Spring framework, as shown in the code structure diagram provided. The main code structure is divided into Controller, Mapper, and Plain Object based on the MVC architecture.

The POJO folder contains classes that define objects in the database. The Mapper classes in the mapper folder contain functions that interact with the database using MyBatis and SQL statements located in /resources/mybatis/mapper. This simplifies the process of automatically encapsulating database entries into Java objects according to the classes defined in POJO, and returning them to the calling function.

The Controller is responsible for mapping client requests to specific processing functions, invoking the corresponding functions in the Mapper, and using the Thymeleaf template engine to inject relevant data into the front-end HTML to return to the client.

In the first iteration of the project, our team mainly focused on implementing the account and game modules. This allowed users to register, login, browse the game list, and view detailed information about each game. These core functionalities are not only essential for a board game management system but also serve as a solid foundation for future system expansion.

The current system prototype has the potential to be further expanded to include additional features without having to start from scratch. This approach aligns with the project's goals of creating a scalable and adaptable solution that can meet the needs of board game enthusiasts.

Overall, the first iteration of the project was a success, and the team was able to deliver the core functionalities as planned. However, there were some challenges, such as managing project scope and balancing technical complexity with usability. Moving forward, the team will continue to refine the system and incorporate feedback from users to further improve its functionality and usability.

# Database

![image](uploads/5dccb84c17e66ebb5c949591ad7a9a00/image.png)  
Figure - Database Model  
![image](uploads/888d367ad69ec7785334c92486212b5d/image.png)  
Figure - Database Structure ScreenShot  

The database was modeled in MySQL Workbench according to the ERR design in Task 1, and exported as an SQL script file. The script was then used to create the table schema in the sdoc vm. The database includes tables that are utilized in the program, as shown in the image provided.

To populate the database with sample data, data samples were collected from various online resources and inserted into the database using Excel.

Overall, the database design and implementation were successful, and the database was able to support the program's requirements. However, there were some challenges in ensuring the accuracy and completeness of the data samples collected from online resources. To address this, more rigorous data validation and verification procedures could be implemented in future iterations of the project.

# Project Deliverables
As of Task 3 submission, the project deliverables are contained in the GitLab repository under the /BGCMSS folder. Additionally, the server-side program has been deployed on the allocated eidf vm and can be accessed through 10.24.2.123:8080/ in a web browser.

The project deliverables include the completed back-end program, a functional database with sample data, and the documentation for the project. The back-end program was developed using the Spring framework and MyBatis and follows the MVC architecture. The database was modeled in MySQL Workbench and implemented in the SDOC VM.

The project documentation includes a project proposal, a project plan, and detailed design documents. The documents provide a clear understanding of the project scope, requirements, and design decisions.
