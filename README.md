# 3-assignment
# AI powered Smart Camera system for e-scooters

## Project Description

This project is a continuation of Assignment 3.
The topic of the project is a Scooter Parking System.
The goal of this assignment is to refactor the previous project using SOLID principles, improve OOP structure, and use advanced Java features such as interfaces, generics, lambdas, and reflection. utils – utility classes

## Project Structure
The project is divided into layers:
model — entities (User, Scooter, ParkingEvent)
repository — work with database (CRUD)
service — business logic and validation
utils — helper classes (Reflection, Sorting)
exception — custom exceptions
Main — program entry point
This structure follows:
- controller → service → repository → database

## 1. Abstract Class
BaseEntity is an abstract class that contains common fields like id and name.
It has abstract methods
It has concrete methods
It is extended by other classes
Supports polymorphism
This follows Open–Closed Principle.

## 2. Inheritance & Polymorphism
Classes like User and Scooter extend the base entity.
They override methods and can be used through base class references without breaking logic (LSP).

## 3. Interface
The project uses several interfaces:
CrudRepository<T>
Rewardable
Validatable
Interfaces contain:
abstract methods
default methods
static methods
This follows Interface Segregation Principle.

## 4. Composition
ParkingEvent contains:
User
Scooter
This shows a composition relationship (ParkingEvent → User, Scooter).

## 5.Generics
Generics are used in:
CrudRepository<T>
Repository implementations
This allows reusable and type-safe code.

## 6. Lambdas
Lambda expressions are used for:
sorting
filtering collections
Example usage is shown in utility classes.

## 7. Reflection
ReflectionUtils shows:
class name
fields
methods
Reflection output is demonstrated in Main.

## 8. Exception Handling
Custom exception hierarchy is used:
InvalidInputException
DuplicateResourceException
ResourceNotFoundException
DatabaseOperationException
Exceptions are thrown in the service/model layer, not in Main.

## 9. Database
Uses JDBC
Has related tables
Includes foreign keys
CRUD operations are implemented in repositories

## 10. How to Run
Open project in IntelliJ IDEA
Make sure JDK is installed
Run Main.java

## 11. Screenshots
The following screenshots demonstrate the functionality of the project:
- Program execution (Main run output)
- Reflection output (class name, fields, methods)
- UML class diagram

## 12. What I Learned
How to apply SOLID principles in practice
How to structure a Java project correctly
How layers work together
How to use interfaces, generics, lambdas, and reflection

## 13. Conclusion
This project demonstrates:
Clean architecture
SOLID principles
Advanced OOP features in Java




