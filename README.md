# JDBC Student CRUD Project

A beginner-friendly Java project demonstrating CRUD (Create, Read, Update, Delete) operations on a MySQL database using JDBC (Java Database Connectivity).

This project helps you learn how to connect Java to MySQL, handle exceptions, and execute database queries safely using prepared statements.

## **Project Aim**

This project is designed to help you:

1.Connect a Java program to a MySQL database using JDBC.

2.Perform CRUD operations: insert, read, update, and delete records in a table.

3.Use PreparedStatement for safe and efficient queries.

4.Implement exception handling for graceful error management.

5.Provide a reusable and modular structure for beginner-level database projects in Java.


## **Prerequisites**

Before running the project, make sure you have:

1.Java JDK 8 or above installed.

2.MySQL Server installed and running.

3.MySQL Connector/J (.jar) added to your project classpath.

4.A MySQL database and table set up:

### Create database
CREATE DATABASE jdbc_practice;

### Use the database
USE jdbc_practice;

### Create table
CREATE TABLE students (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    age INT,
    email VARCHAR(100)
);

## **Database Connection**

All database connections are handled in Making_Connection.java.

**Example connection details:**

String url = "jdbc:mysql://localhost:3306/jdbc_practice";
String user = "root";
String password = "your_mysql_password";

Connection conn = DriverManager.getConnection(url, user, password);


Queries always fetch the latest database state.



## **The program will:**

1.Insert example students

2.Display all students

3.Update a student’s age

4.Delete a student

5.Display the final student list

## **Features**

1.Modular design: Separation of connection and CRUD logic.

2.Robust: Exception handling ensures smooth execution.

3.Beginner-friendly: Easy to extend for additional tables or databases.