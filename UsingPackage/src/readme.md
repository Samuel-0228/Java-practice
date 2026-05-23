# Java Packages Project

A simple Java project that demonstrates how to create and use packages in a real application.

## Project Structure

```text
src/
└── com/
    └── samuel/
        └── studentapp/
            ├── model/
            │   └── Student.java
            ├── service/
            │   └── GradeService.java
            ├── util/
            │   └── InputUtil.java
            └── app/
                └── Main.java
```

## What Are Packages?

Packages are used to group related classes, interfaces, and sub-packages together. They help keep code organized, avoid naming conflicts, and make large projects easier to manage [web:31][web:36].

## Why Use Packages?

- Organize code into logical sections.
- Avoid class name conflicts.
- Make imports cleaner.
- Improve project structure and readability [web:31][web:36].

## Package Names

This project uses dot-separated package names like:

```java
com.samuel.studentapp.model
com.samuel.studentapp.service
com.samuel.studentapp.util
com.samuel.studentapp.app
```

In Java, package names are usually lowercase and map to folder structure [web:31][web:36].

## Classes Included

- `Student` — stores student data.
- `GradeService` — calculates grades.
- `InputUtil` — handles user input.
- `Main` — runs the application.

## How to Compile

From the project root, run:

```bash
javac -d out src/com/samuel/studentapp/model/Student.java src/com/samuel/studentapp/service/GradeService.java src/com/samuel/studentapp/util/InputUtil.java src/com/samuel/studentapp/app/Main.java
```

The `-d out` option tells Java to place compiled classes into the correct package folders [web:31][web:36].

## How to Run

```bash
java -cp out com.samuel.studentapp.app.Main
```

Use the full package name when running the main class [web:31].

## Example Usage

```text
Enter student name: Samuel
Enter score: 90
Student: Samuel
Score: 90
Grade: A
```

## Learning Goals

This project shows how to:

- Create packages.
- Import classes from other packages.
- Use package names that match folder paths.
- Build a small structured Java application.
