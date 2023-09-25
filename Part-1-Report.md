Group Members:

* Anthony Peterson : s1938177
* Jiaqian Zhang : s2342658
* Safa Alsaman : s2094463
* Shuren Miao : 2318786

Table of Contents

[1. Introduction ](#1-introduction)

[1.1 System Overview ](#11-system-overview)

[1.2 Target Audience ](#12-target-audience)

[1.3 System Objectives ](#13-system-objectives)

[1.4 Methodology ](#14-methodology)

[1.5 Document structure ](#15-document-structure)

[2 Requirements Engineering ](#2-requirements-engineering)

[2.1 Capture Methodology for Requirements Engineering 6](#21-capture-methodology-for-requirements-engineering)

[2.2 Functional Requirements ](#22-functional-requirements)

[2.3 Non-Functional Requirements ](#23-non-functional-requirements)

[3 System Design ](#3-system-design)

[3.1 Development Environment ](#31-development-environment)

[3.2 System Architecture ](#32-system-architecture)

[3.2.1 Hardware Architecture ](#321-hardware-architecture)

[3.2.2 Software Architecture ](#322-software-architecture)

[3.2.3 Component Architecture ](#323-component-architecture)

[3.3.4 RESTful architecture ](#334-restful-architecture)

[3.3.5 Website Page Activity ](#335-website-page-activity)

[3.3.6 Database Design ](#336-database-design)

[3.3.7 Project File Structure ](#337-project-file-structure)

[4 UI Design ](#4-user-interface-ui-design)

[4.1 Design Considerations and Rationale ](#41-design-considerations-and-rationale)

[4.2 Accessibility considerations ](#42-accessibility-considerations)

[4.3 Some alternatives considered ](#43-some-alternatives-considered)

[5 Team structure and members’ roles ](#5-team-structure-and-members-roles)

# 1. Introduction

Tabletop games have experienced a significant surge in popularity over the past two decades, leading to the emergence of a vast social network of players and enthusiasts worldwide. These games, comprising board games, miniature war games, card games, and role-playing games, have become a significant cultural phenomenon, with numerous shops and online communities dedicated to promoting and supporting them. However, for players, managing a personal collection of tabletop games can be a challenging task. According to a survey we conducted, most players rely on their memory when it comes to managing tabletop games which may lead to forgetting about owning a game, let alone playing it. For those who use online systems, many of them do not check their collections regularly because of the complexity of the systems offering the service, which requires a substantial investment of time and effort on the part of the players to complete any task. In this document, we outline our plan for implementing a system for managing personal tabletop games collections that cater to players’ needs with minimal effort to achieve tasks.

## 1.1 System Overview

The system under development is a software application designed to help users manage their collections of tabletop games. The system provides a centralized platform for organizing, tracking, and discovering new games, as well as connecting with other players and enthusiasts. The system is accessible through a web-based interface, which can be accessed from any device with an internet connection. In addition to the collection management features, the system includes resources such as game reviews and resources, which can help users learn and engage with new games. The system also includes features for organizing gaming events through established local communities. The system is managed by an administrator who can assign roles to players such as a moderator of a forum and a manager of a game, but these modules will be developed at later releases as the main focus of the system is to develop the functionality from the players’ perspective.

## 1.2 Target Audience

The system may appeal to several categories of users including:

1.  Game collectors who wish to organize and track their collections and share them with others.
2.  Passionate gamers who are interested in discovering new games and connecting with other players.
3.  Gaming communities that wish to organize gaming events with enthusiastic players.
4.  Game store owners who wish to offer their games directly to players.
5.  Game designers and publishers who wish to connect with their audience, promote their games, and gather feedback through joining communities and participating in discussions.

## 1.3 System Objectives:

Our objectives of building the system include:

1.  Providing a direct and effective way for users to organize and track their game collections, including creating collections, components, and communities.
2.  Enabling users to discover new games and explore different game types and genres based on their interests.
3.  Enabling users to access game-related content such as general information, reviews, forums, and game rules, to help them learn and engage with different games.
4.  Offering a platform for users to connect with other players and join or create gaming communities based on their preferences and location.
5.  Allowing users to share their game collections with others, including friends, followers, and gaming communities, with different degrees of privacy.

## 1.4 Methodology

We adopted an agile methodology to develop the system by breaking down the project into iterations that can be completed in a short time frame with continuous involvement from end-users. Agile software development is an iterative approach that focuses on delivering working software in small, frequent releases and it is based on the principles of continuous integration, continuous delivery, and test-driven development, as illustrated in figure 1.

![agile](uploads/d034aee8b1e7f741890ac4b0911ad8be/agile.jpg)

Figure 1: Illustration of the agile methodology, borrowed from [Mobile Jon's Blog](https://mobile-jon.com/2021/04/05/applying-the-agile-methodology-to-the-modern-workplace/)

We chose Agile as our software development architecture because of the following reasons. Firstly, our aim is to develop a game collection web application that satisfies the requirements of the potential end users. To achieve this goal, the priority of user satisfaction as well as tight collaboration between users and us are necessary. Agile is designed for prioritizing customer satisfaction by developing software that meets their requirements. It also emphasizes collaboration between developers, stakeholders, and customers, which helps ensure that everyone is working toward the same aims. Additionally, since we are expected to provide a prototype in about one month, we need a flexible software development architecture to deliver working software faster. Agile is an adaptable architecture, making it easy to incorporate changes and updates to the software as needed. This allows us quick responses to modify user needs and shorten the iteration time. Finally, we need to reduce the risk and make sure that the final product achieves the required quality. Agile has this capability because it allows the development team to identify and address issues early in the development process.

In the Agile procedure, the development process is broken down into a series of short iterations, typically lasting 1-4 weeks, which is suitable for our project time duration. Each iteration consists of a planning phase, a development and testing phase, and a review phase. During the planning phase, we work with the potential users to identify the features and requirements that will be included in the upcoming iteration. We then estimate the effort required to complete each feature and prioritise the work based on its importance. During the development phase, we will work on developing the features identified in the planning phase. We will collaborate and communicate regularly to ensure that everyone is working towards the same goals. Then for testing, we will test the software to ensure that it meets the requirements and quality standards set out in the planning phase. Any identified issues that will be addressed in the review phase. During the review phase, we will reflect on the completed iteration and identify areas for improvement and the feedback will be used to guide future iterations and ensure that the development process continues to improve over time.

## 1.5 Document structure

The rest of the document is structured as follows. Section 2 describes the requirements engineering process we adopted and results in a form of functional and non-functional requirements. Section 3 describes the system’s overall design and section 4 outlines the approach we carried out to design the User Interface (UI). Section 5 provides a summary of the team structure and members’ roles, but it is subject to change based on the development process.

# 2 Requirements Engineering

The requirements engineering process encompasses a set of activities that include elicitation, analysis, documentation, and validation and results in a set of requirements to be implemented in the system. This section is divided into sections where section 2.1 describes the capture methodology we adopted to collect requirements while sections 2.2 and 2.3 list the functional and non-functional requirements, respectively.

## 2.1 Capture Methodology for Requirements Engineering

The capture methodology for requirements engineering for the project surrounds an iterative feedback-based approach. This allowed us to keep stakeholders relevant and informed, while attaining more accurate information regarding requirements and desires for the project. Specifically, the methods of requirements capture used were:

-   Analysis of prior solutions
-   Questionnaires or Surveys
-   Interface analysis
-   Interviews

These methods were chosen due to their ease of use, low time-consumption, and immediate results, which led to better time management and planning. We started by conducting analysis of prior solutions in order to attain an initial set of features/functionality. This method was carried out on ‘BoardGameGeek’, ‘Steam’, and ‘Yucata’ – a few of the most used game collection software’s available. Based on this set, we created a survey to get feedback and general desirability for the features. Following 28 responses to the survey, we created our initial set of requirements alongside the essential functionality requirements. Additionally, based on results from the survey, we also managed to prioritise said requirements in order to create an example user interface (UI). The example UI was then used in interface analysis as well as interviews with users, gathering further feedback to enhance the set through addition, removal or editing of existing requirements based on said feedback. This also influenced the prioritisation of the requirements set.

Other requirements capture methods that may have been appropriate to use but were not applicable to our process:

-   Brainstorming
-   Focus groups

Brainstorming was avoided due to the decision of analysing prior solutions instead. We believed the latter method would result in the same results plus more, as well as more relevant requirements being gathered as they were taken directly from alternative software’s.

Focus groups would have gone a step further to the prior method, gathering even more requirements due to the number of people involved. Yet, the reason for avoiding it was the same. Due to the number of people required, this would take too much time and coordination, making it a less efficient option compared to our methods chosen above.

## 2.2 Functional Requirements:

After acquiring requirements, we analysed, then documented and validated them to ensure they are complete and free of conflict. We classified and prioritised the requirements using the ‘MuSCoW’ prioritization technique where requirements are grouped based on their importance level into a ‘Must have’, ‘Should have’, ‘Could have’, or ‘Won’t have’. Our strategy was to categorize requirements collected using the questionnaire based on the majority vote. Requirements labeled as ‘Must Have’ are considered essential for the success of the project and must be delivered within the given timeframe. We considered a requirement a ‘Must Have’ if it had received over 70% positive rate. Requirements labeled as ‘Should Have’ are important, but not critical, and can be delivered at a later stage. These requirements scored between 40% - 70% in the questionnaire. Requirements labeled as ‘Could Have’ are desirable, but not necessary, and can be postponed or eliminated if necessary. We labeled a requirement as ‘Could Have’ if it has received less than 40% positive rate. Requirements labeled as ‘Won't Have’ are deemed not necessary or not feasible to implement in the current project cycle. In our case, only a few participants suggested extra features that are not aligned with the system’s objectives. The list of requirements is listed below with a subsection that justifies why we are including some requirements in the ‘Won’t Have’ category.

1.  **Ability to create an account in the system to exploit the system’s services:**
    1.  The system must allow users to create an account by providing basic information, including their name, email address, phone number, date of birth and a secure password. The registration process should be user-friendly, with appropriate validation checks to ensure that the user provides valid and accurate information.
    2.  The system must enable users to log in using their email address and password once they successfully create an account. The system should verify the user's credentials and provide access to the user's account.
    3.  The system must allow users to create and manage their profiles, including personal information, and settings. Users should be able to update their profiles as needed and choose whether to share their information with other users.
    4.  The system must enable users able to access the services, such as managing collections, uploading resources, and participating in forums once they log in successfully.
2.  **Ability to search for games, update information about existing games, and add or remove games/items from collections:**
    1.  The system must allow users to search for games using various criteria, such as title, type, and genre.
    2.  The system must allow users to update information about existing games, such as title, description, and cover, subject to managers’ approval.
    3.  The system must allow users to upload/update resources for a game.
    4.  The system must allow users to add new games to their collection, either by searching for them in the system's database or by manually entering their information.
    5.  The system must allow users to add/update items or expansions to a game.
    6.  The system must allow users to remove items from collections, either individually or in bulk.
3.  **Ability to filter the game collection by multiple criteria:**
    1.  The system must allow users to filter their game collection by type, genre, and rating.
    2.  The system must provide real-time filtering of the game collection based on selected filter criteria.
4.  **Ability to mark specific games as "favorites" for ease of access, and provide a dedicated section for displaying those favorites:**
    1.  The system must allow users to mark any game as a favorite.
    2.  The system must provide a dedicated section for displaying all the user's favorite games.
    3.  The system must allow users to easily add or remove games from their favorites list.
5.  **Ability to add new items to existing games, including but not limited to cards, rules, and other game-specific elements:**
    1.  The system must allow users to add custom content to existing games, such as strategies and supporting files.
6.  **Ability to add reviews for games in a user's collection:**
    1.  The system must allow users to add reviews for games in their collection, with appropriate fields for a title, rating, and text.
    2.  The system must allow other users to view and rate the reviews.
7.  **Ability to find stores to buy a game or accessories:**
    1.  The system must provide a feature for finding stores to purchase games or game accessories.
    2.  The system must provide appropriate fields for searching and filtering stores, such as by location, product, or price.
    3.  The system must allow users to add reviews for stores.
8.  **Ability to display news related to games and the gaming community, and allow users to filter that news based on their interests:**
    1.  The system should display the latest news related to games and the gaming community on the home page.
    2.  The system should allow users to filter news articles based on their interests, such as a specific genre.
    3.  The system must provide an archive of past news articles that users can access at any time.
9.  **Ability to control what information is displayed in the user profile:**
    1.  The system should allow users to customize their profile information, including their name, avatar, and other personal details.
    2.  The system should allow users to control which games in their collection are visible to others.
    3.  The system shall provide privacy settings that allow users to restrict access to certain parts of their profile.
10. **Ability to share the game collection with others:**
    1.  The system should provide a dedicated sharing feature that allows users to share their game collection with others via social media or a unique URL.
11. **Ability to share game rules with others:**
    1.  The system should provide a mechanism for sharing house rules for games, and clarifications of whether using FAQs or errata documents from publishers.
12. **Ability to view the game collections of friends/players, subject to their privacy settings:**
    1.  The system should allow users to search for players whether to add them as friends or to follow them.
    2.  The system should allow users to send friend requests to other users, subject to their privacy settings.
    3.  The system should allow users to search for and view the game collections of their friends.
    4.  The system should allow users to chat with friends privately.
    5.  The system should respect the privacy settings of the friend's profile and only display games that are marked as visible to friends.
    6.  The system should allow users to unfriend users if they want to.
    7.  The system should allow users to follow superstars’ profiles and view their statistics, subject to those players' privacy settings.
    8.  The system should allow users to unfollow the players if they want to.
13. **Ability to join local communities for games to chat and contribute through posts:**
    1.  The system should provide a feature for finding and joining local gaming communities.
    2.  The system should allow users to search and filter communities using the country or city.
    3.  The system should allow users to create and organize their own communities, with appropriate tools for inviting and managing members, moderating content, and customizing the community's settings and features.
    4.  The system should allow users to cancel their membership in a community if they want to.
    5.  The system should provide appropriate privacy and security settings for online communities, such as options for making a community public or private, restricting access to certain members or groups, and requiring moderator’s approval for new members or content.
14. **Ability to join online forums for games to chat and contribute through posts:**
    1.  The system should allow users to join online discussions through forums.
    2.  The system should allow users to search for game forums.
    3.  The system should allow users to filter game forums using the type or genre.
    4.  The system should allow users to post new threads or comments.
15. **Ability to track games to add to a collection:**
    1.  The system could allow users with a “wish list” to track games they are interested in adding to their collection.
    2.  The system could allow users to add or remove games from their “wish list” at any time.
16. **Ability to track when and to whom a game was loaned:**
    1.  The system could allow users to track when and to whom they have loaned a game from their collection, and provide the ability to manage that loan history.
    2.  The system could provide appropriate fields for tracking loan information, such as the loan date, borrower name, and due date.
17. **Ability to view the total money spent on games:**
    1.  The system could track the total money spent on games in a user's collection, if available.
18. **Ability to provide recommendations based on users’ data:**
    1.  The system could provide a recommendation mechanism to help users find similar games to those in their collection.
    2.  The system could use the reviews submitted by a user, their collection and where they are for recommending games and communities.
19. **Ability to show different sorting options:**
    1.  The system could provide multiple sorting options for managing and displaying game collections, such as by title, platform, genre, rating, or release date. The sorting options shall allow users to sort in ascending or descending order.

**Excluded Requirements - ‘Won’t Haves’:**

1.  **The ability to show off in game and out of game achievements:**

    The feature is hard to track for physical games as achievements cannot be generated automatically and it can spread false information if left to users to enter them manually.

2.  **The ability to push regular notifications to users:**

    Though the feature is beneficial from the business point of view, users may be reluctant towards receiving regular notifications. More analysis must be done to ensure that including the feature will not deter users from using the system

3.  **The ability to provide sandbox to test games:**

    This feature is deemed not critical for physical games. Based on our current resources and priorities, implementing this feature is not feasible.

## 2.3 Non-Functional Requirements

In this section, we outline the non-functional requirements for our project. Non-functional requirements are just as important as functional requirements, as they ensure that the software meets the expectations of the users.

1.  **Performance:** The application should be able to handle a large number of users and game collections without degrading performance or causing downtime.
    1.  Response time: The web application should respond to user interactions within a reasonable timeframe, ideally within a few seconds or less.
    2.  Load capacity: The application should be able to handle a large number of concurrent users without significantly slowing down or crashing.
    3.  Resource usage: The application should use server resources efficiently to minimize response time and optimize performance.
2.  **Usability:** The application should be easy to navigate and use with clear instructions. The users should easily understand and use all the provided functions such as finding a game, following other players, etc.
    1.  Navigation: The application should have a clear navigation structure that allows users to easily find and access the features they need.
    2.  User feedback: The application should provide clear feedback to users when they perform actions, such as replying to a forum or clicking a button, to ensure that users understand what is happening.
3.  **Availability:** The application should be available 24/7, with minimal downtime for maintenance or updates. Any scheduled downtime should be communicated to users in advance.
    1.  Uptime: The web application should be available 24/7, with a target uptime of at least 99%.
    2.  Maintenance windows: Any scheduled downtime for maintenance or updates should be communicated to users in advance, with an estimated duration and expected impact on application availability.
    3.  Failover: The application should be designed with failover capabilities to ensure continued availability in the event of a hardware or software failure.
4.  **Security:** The web application should protect user data and login credentials from unauthorized access.
    1.  Authentication and authorization: The web application should require strong, secure user authentication and authorization mechanisms to protect user data and ensure that only authorized users can access the application.
    2.  Encryption: All sensitive data such as the password and e-mail of the user should be encrypted during transmission and storage to prevent unauthorized access.
    3.  Compliance: The application should comply with industry-standard security protocols and regulations, such as GDPR (General Data Protection Regulation).
1.  **Compatibility:** The application should be compatible with a wide range of devices and web browsers, including mobile devices and older web browsers.
    1.  Browser compatibility: The application should be compatible with a wide range of web browsers, including older browsers and mobile browsers.
    2.  Device compatibility: The application should be optimized for use on a variety of devices, including desktops, laptops, tablets, and smartphones.
2.  **Scalability:** The web application should be able to scale up or down as user demand changes, without compromising performance or availability.
    1.  Elasticity: The web application should be able to scale up or down in response to changing user demand, with automatic provisioning of resources as needed.
    2.  Performance testing: The application should be regularly tested for scalability and performance to ensure that it can handle peak loads without significant performance degradation.
3.  **Reliability:** The web application should be reliable, with a low rate of system failures or errors. Any errors or bugs should be promptly addressed and fixed.
    1.  Fault tolerance: The application should be designed with fault tolerance in mind, with redundant components and failover mechanisms to minimize downtime in the event of a system failure.
    2.  Error handling: The application should have robust error handling mechanisms in place to handle unexpected errors or exceptions, and to prevent data loss or corruption.
    3.  Logging and monitoring: The application should have comprehensive logging and monitoring capabilities to track application behavior and identify issues proactively.
4.  **Maintainability**: The web application should be easy to maintain and update, with clear documentation and modular code. Any updates or changes to the application should be tested thoroughly before deployment.
    1.  Code quality: The application code should be modular, well-documented, and easy to understand and maintain.
    2.  Version control: The application should be managed with a version control system, such as Git, to enable efficient collaboration and code management.
    3.  Testing: The application should be regularly tested and updated to ensure that it continues to function as expected, with automated testing mechanisms in place to catch errors and issues before they become problems.

# 3 System Design

In this section, we draw a blueprint for the system and find a technical roadmap to achieve the goals we set in the ‘introduction’ and ‘requirement engineering’ sections. The project aims to deliver a product consisting of a Tabletop Game Collection Management and Sourcing System. In order to provide an easily-accessible and platform-independent online service for all users, we plan to develop the product as a website service using Browser/Server architecture. We will adopt Java as the main programming language considering the projects desired features of robustness, compatibility, and availability of large development resources.

## 3.1 Development Environment

As seen in table 1, we specify the collection of tools, technologies, and resources that will be used to create, test, and debug the software application during the development process. In the technology breakdown, the key components for this project include front-end, back-end, database, and testing.

| Tools           | Usage                               |
|-----------------|-------------------------------------|
| GitLab          | Code repository and version control |
| IntelliJ IDEA   | IDE                                 |
| Maven           | Package Management                  |
| HTML, CSS       | Static webpage                      |
| Thymeleaf       | Template engine                     |
| Ajax, Vue       | Dynamic webpage                     |
| Bootstrap       | UI framework and theme              |
| Spring MVC      | Web service framework               |
| myBatis         | SQL mapper framework                |
| MySQL           | Database                            |
| JUnit, Selenium | Testing                             |

Table 1: Tools and Technologies used to Develop the system

## 3.2 System Architecture

This section discusses the system’s architecture and provide a high-level description of the components, modules, and infrastructure that make up this software system, as well as how these components interact with each other to achieve the desired functionality.

## 3.2.1 Hardware Architecture

The diagram shown in figure 2 refers to the physical infrastructure that supports the website service. It is designed to support the performance, reliability, and scalability requirements. However, given limited time and fund resources, the development team may not be able to provide a complete implementation. Our delivery to be demonstrated will only focus on the web server and database, missing out the gateway, firewall, load balancer, etc.

![System_s_Physical_Architecture](uploads/06dfe59615655445765723bd07b9d3ca/System_s_Physical_Architecture.jpg)
Figure 2: The System’s Physical Architecture

## 3.2.2 Software Architecture

The three-tier architecture illustrated in figure 3 is a popular pattern for user-facing applications. The tiers that comprise this architecture consist of the presentation tier, the logic tier, and the data tier. The presentation tier represents the component that users directly interact with, i.e. webpages. The logic tier contains the code required to translate user actions at the presentation tier to the functionality that drives the application’s behavior. The data tier consists of storage media (databases, object stores, caches, file systems, etc.) that hold the data relevant to the application.

![Software_Architecture_of_the_System](uploads/21cb5fb9f91b73e30b72bac65deaafd2/Software_Architecture_of_the_System.jpg)
Figure 3: Software Architecture of the System

## 3.2.3 Component Architecture

In this subsection, we try to break down the overall system design into smaller, more manageable components, each with specific functionality, requirements, and characteristics.

The whole complex system mainly consists of these eight component modules, illustrated in figure 4:

-   **Account**: Allow users access to more features through having a unique identity.
-   **Profile**: Allow users to manage their personal information related to board games.
-   **Friend**: Allow users to interact with other users.
-   **Community**: Allow users to interact with a board game group or club.
-   **Collection**: Allow users to manage their board games and extension items.
-   **Game**: Allow users to browse and review board games.
-   **Forum**: Allow users to discuss board games.
-   **Market**: Allow users to share purchase links.

![Functional_Hierarchy_Diagram](uploads/af9bbeae04f0535df10edf35fb994e49/Functional_Hierarchy_Diagram.jpg)
Figure 4: Functional Hierarchy Diagram

By breaking down the overall system design into these smaller components, it becomes easier to design, develop, and maintain the Board Game Collection Management and Sourcing System. It also helps ensure that each component is properly designed and integrated with the other components, and that any potential issues or challenges can be identified and addressed during the development process.

## 3.3.4 RESTful architecture

The system will apply the RESTful style, so that web resources can be accessed and manipulated using a uniform and predefined set of stateless operations. The development of the system will follow 6 architectural constraints:

1.  Client-server
2.  Cacheability
3.  Uniform interface
4.  Statelessness
5.  Layered system
6.  Code-On-Demand

## 3.3.5 Website Page Activity

A Website Page Flowchart, shown in figure 5, is a high-level diagram that shows the overall structure of a website service. By visualizing the different pages and their abstract relationships to each other, we can better understand the interaction process between users and the website.

![Website_Page_Flowchart](uploads/971ad318929fc7b511d6e7023055234a/Website_Page_Flowchart.jpg)
Figure 5: Website Page Flowchart

## 3.3.6 Database Design

The Entity Relationship Diagram (ERD) shown in figure 6 describes tables and their relationships in a relational database. The ERD models entity types and relationships between data entities, serving as a valuable tool for designing and visualizing the SQL database schema for the system. It can help ensure that the database is designed in a way that reflects the business logic of the system and be later used to direct object-oriented programming.

![ER_Diagram_to_describe_the_System_s_Database](uploads/f971f7caf3bda6eb6353903c24949d50/ER_Diagram_to_describe_the_System_s_Database.jpg)
Figure 6: ER Diagram to describe the System’s Database

## 3.3.7 Project File Structure

The project file structure, depicted in figure 7, shows the organization and arrangement of files and directories that make up the project codebase. As it can help to ensure that the codebase is well-organized, easy to maintain, and scalable. Hence, we can make it easier to add new features, fix bugs, and refactor the code as needed, leading to a more stable and reliable system over time.

![Project_File_Structure](uploads/fc2d8686e0b852c2910ced5606090d2d/Project_File_Structure.png)
Figure 7: Project File Structure

# 4 User Interface (UI) Design

This section provides an overview of the design considerations and rationale behind our choices when building the UI. The built prototype can be accessed using the link: <https://balsamiq.cloud/srut3/ph4wx8o>. An initial version of the prototype was created and reviewed then used in an interview with a potential user for refinement and enhancement.

## 4.1 Design Considerations and Rationale:

We used Balsamiq to build a low-fidelity UI wireframe since it provides many built-in Graphical User Interface (GUI) components that allow us to rapidly develop the prototype and because it offers basic interaction functionality in the form of navigating between screens. In order to promote an open and honest discussion with potential users and encourage constructive criticism, it was important for us to create a low-fidelity wireframe that did not have a polished look and feel, which encouraged potential users to express negative feedback without feeling guilty. We used Nielson’s heuristics to guide us on building an effective interface that caters to players’ needs. Some of the considerations are listed below:

1.  Visibility of system status by providing users with feedback about what is happening within the system. Examples include displaying a loading icon when the system is retrieving games, communities, players, or stores, using headings that describe the page and using breadcrumbs in forums to show where the user is browsing and how to navigate to other options if necessary.
2.  Match between system and the real world by using terminology that is familiar to players. For example, using common genres and labels when categorizing games.
3.  User control and freedom by providing a header with access to home, stores, communities, games, or forums from any page.
4.  Consistency and standards by following established conventions such as allowing users to sort and filter collections, games, stores by various criteria such as genre and date.
5.  Error prevention and helping users recognize, diagnose, and recover from errors by providing clear error messages that identify the problem and suggest a solution such as showing an alert to users when they click on the remove icon which would prevent users from removing collections mistakenly.
6.  Recognition rather than recall by providing visible and easily accessible filtering and search options so that users do not have to remember specific details to find collections, games, stores, communities, or posts.
7.  Aesthetic and minimalist design by adopting a minimalistic and clean look to focus the user's attention on important information and actions. Plus, we aim to use a suitable color palette and consistent typography in the implemented interface.

## 4.2 Accessibility considerations:

To make the system more usable and inclusive for users with disabilities, we will consider these design strategies when implementing the UI:

1.  Using clear and simple language throughout the interface, including button labels, error messages, and instructions. This is particularly important for users with cognitive disabilities or who are not fluent in the language used.
2.  Providing alternative text for images and other non-text content, so that users with visual impairments can understand the content.
3.  Using high contrast between the text and background colors to make it easier for users with low vision to read the content.

## 4.3 Some alternatives considered:

There were several alternative options considered during the design process. Some of them include:

1.  Considering leading users to a separate page to show communities on the map, but to make things easier for them, we decided to add the map and a search bar on the home page so that users can search for a country or a city, and the map would be populated with local communities without having to navigate to other pages.
2.  We considered adding the phone and date of birth fields on the signup page but to make the registration process less time-consuming for users and to respect their privacy, we removed the 2 fields from the sign-up page and provided an option to add the information in the ‘Personal Settings’ page.
3.  We considered building the ‘Personal Settings’ page with a vertical layout where personal information, password, and privacy settings are displayed in one page but as the layout was filled with many separable groups of information, we decided to go with a tabbed layout to make options easily accessible and conform to the minimal design approach we adopted.
4.  We had 2 options for showing items within the collection’s page, a static and a dynamic view. In the static view, collections would be displayed with their cover image only while in the dynamic view, items would be displayed using carousals to allow users to check items in the same place to help them remember what they have in an instant. We have adopted the dynamic view in the beginning because it provides easier access to items. However, after the design review process and further analysis, we concluded that this type of presentation might be overwhelming for users, and it might slow loading the page because of the heavy script to be included. We decided to go with a layout that provides a compromise between the static and dynamic view where collection titles are listed as a list on the side bar and the detailed description of items is updated on the right side of the page whenever the user clicks on a collection.
5.  In the forum page, we decided to go with showing the avatar of the user who posted or last commented on a topic rather than the name as it is more visually appealing.

# 5 Team structure and members’ roles

To maintain a well-functioning team and build a successful system, responsibilities were shared and divided among members fairly. Tasks of collaborative nature such as planning, requirements elicitation, and review were shared among members equally while the development roles were assigned to members based on their background knowledge, levels of expertise and preferences. No leader was appointed as none of the members felt they had the skills to lead the group, therefore, members will share the responsibility equally with each member leading a task in the development stage. Table 2 shows tasks in the planning and requirements’ engineering stages while table 3 shows members’ roles in the development stage and reasons for the assignment.

| Stage                      | Task                                                                               | Member                                                              |
|----------------------------|------------------------------------------------------------------------------------|---------------------------------------------------------------------|
| Planning                   | Discussing the system’s goals, baseline requirements, and tasks to be carried out. | All members were involved with Anthony taking notes as a secretary. |
| Requirements Elicitation   | Analysis of prior solutions                                                        | Anthony, Jiaqian, Shuren                                            |
|                            | Developing a questionnaire                                                         | Safa                                                                |
|                            | Interface Analysis and Interviews on users                                         | Anthony                                                             |
| Requirements Analysis      | Categorization and prioritization                                                  | All members.                                                        |
| Requirements Documentation | Functional Requirements                                                            | Safa                                                                |
|                            | Non-functional requirements                                                        | Jiaqian                                                             |
| Requirements Validation    | Functional Requirements                                                            | Anthony                                                             |
|                            | Non-functional requirements                                                        | Shuren                                                              |
| Design                     | System Design                                                                      | Shuren                                                              |
|                            | UI design                                                                          | Safa                                                                |
|                            | System design review                                                               | Anthony                                                             |
|                            | UI design review                                                                   | Jiaqian                                                             |

Table 2: Tasks carried out by members in the planning stage and requirements engineering process

| Member  | Role                | Reason                                                                 |
|---------|---------------------|------------------------------------------------------------------------|
| Anthony | Database developer  | Did a course in Databases and the Web in his undergraduate degree.     |
| Jiaqian | Front-end developer | Has experience in human-centric design and JavaScript.                 |
| Shuren  | Back-end developer  | Has experience with the framework proposed in the system architecture. |
| Safa    | Tester              | Has experience in testing with JUnit and Selenium IDE.                 |

Table 3: Members’ roles in the development stage
