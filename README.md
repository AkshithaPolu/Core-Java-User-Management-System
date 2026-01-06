# Core-Java-User-Management-System
### **Project Overview**
The Core Java In-Memory User Management System is a console-based application developed using pure Core Java concepts. The project focuses on designing and managing user data entirely in memory without using databases or external frameworks. This system demonstrates how object-oriented programming principles and core Java features can be applied to build a structured, scalable, and maintainable application. Users are stored in a fixed-size array, and operations such as user creation, validation, and duplicate handling are performed programmatically.
### **Objectives**
The main objectives of this project are:
-  To understand and apply Core Java fundamentals
-  To implement Object-Oriented Programming (OOP) concepts in a real-world scenario
-  To practice handling data in memory without databases
-  To ensure data validation and uniqueness constraints
-  To learn how custom exceptions improve program reliability
### **Problem Statement**
-  Create a User class with the following attributes:
    1. id (auto-generated)
    2. name
    3. email (must be unique)
    4. role (ADMIN / USER)
    5. active status
-  Implement a UserService that manages users using a fixed-size array
-  Validate inputs and prevent duplicate email entries
-  Throw a custom DuplicateUserException when a duplicate email is detected
-  Demonstrate all functionalities in a main method
### **Key Features**
-  Auto-generated unique User ID
-  Email-based uniqueness validation
-  Role-based user categorization (ADMIN / USER)
-  Active and inactive user status tracking
-  Custom exception handling for duplicate users
-  Console-based demonstration of all functionalities
### **Concepts Used**
This project extensively uses the following Core Java concepts:
-  Classes and Objects – For modeling users and services
-  Constructors – For initializing user data
-  Encapsulation – Using private fields with getters and setters
-  Static vs Instance Members – For auto-generating unique user IDs
-  Enums – To define fixed user roles (ADMIN, USER)
-  equals() and hashCode() – For comparing users based on email
-  Custom Exceptions – To handle duplicate email scenarios gracefully
### **Application Flow**
-  Create users using constructors
-  Add users to the system via UserService
-  Validate email uniqueness
-  Handle duplicate entries using custom exceptions
-  Display stored users through console output
