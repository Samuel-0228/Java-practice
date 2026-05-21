# Introduction to JDBC

# 1. Database Connectivity to MySql

A real life application needs to manipulate data stored in a database. A database is a collection of
related data in the form of tables. Most databases use SQL (Structured Query Language) to Insert,
Delete, Update and Retrieve stored data. In order to connect a Java application to a database
designed in MySql, Oracle, Sybase, MS SQL Server etc, you need a Bridge/Interface Driver
Program. Java provides JDBC (Java Database Connection) and JDBC
connect to a database. JDBC is commonly used to connect

# 2. What is JDBC?

JDBC is Java’s database connection driver interface which performs the following tasks for the
application
 Establish a connection with a database
 Send SQL request(Query) to a da
 Returns results obtained against query
Some RDBMSs like MS Access require ODBC (Open Database Connection), which can connect
through the JDBC-ODBC driver (jdbc.odbcbridge)
