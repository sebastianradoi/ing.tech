# ing_tech

This is a Java, maven based project using SpringBoot.<br>
It has Basic functionalities like login, create user, get all users<br>
All the functionalities are accessed via spring boot restful webservices<br>
The application connects to a H2 in memory database, all the configuration details are found in application.properites<br>
JPA was used for mapping the User class onto the users table<br>
It has a function for password hashing made with BCrypt (Spring Security)<br>
A class UserTest was implemented with some Junit tests.