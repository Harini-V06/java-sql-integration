# Java–SQL Integration
 
Connecting Java to MySQL using JDBC — CRUD operations, prepared statements, and database-driven logic.
 
---
 
## What this covers
 
- Connecting to a MySQL database from Java using JDBC
- Performing full CRUD: `INSERT`, `SELECT`, `UPDATE`, `DELETE`
- Using `PreparedStatement` to prevent SQL injection
- Managing connections cleanly with try-with-resources
---
 
## How to run
 
**Requirements:** Java 17+, MySQL 8+, MySQL Connector/J
 
**1. Set up the database**
 
Run the SQL script to create the schema:
```bash
mysql -u root -p < schema.sql
```
 
**2. Update credentials**
 
In `DBConnection.java`, set your MySQL host, username, and password.
 
**3. Compile and run**
```bash
javac -cp .:mysql-connector-j-*.jar *.java
java -cp .:mysql-connector-j-*.jar Main
```
 
---
 
## Concepts practised
 
- JDBC connection lifecycle (DriverManager → Connection → Statement → ResultSet)
- PreparedStatement vs Statement — why it matters for security
- Exception handling for SQL errors
- Mapping Java objects to database rows
---
 
*Built as part of learning backend fundamentals — lays the groundwork for building database-driven Java applications.*
