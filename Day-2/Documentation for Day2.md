

#### &nbsp;				 DAY-2



1\. **Class and Object**

Example: Address, Student, car, Scorpio

A class defines the structure or blueprint. An object is created from the class using the new keyword. Constructors are used to initialize object values.



2\. **Constructor**

Example: All classes

A constructor is a special method used to initialize objects. It has the same name as the class and no return type.



3\. **Method Calling**

Example: displayAddress(), displayStudent(), etc.

Methods define behavior. They are called using the object to perform specific tasks like displaying values.



4\. **Has-a Relationship (Composition)**

Example: Student has Address

One class has a reference of another class as a member. It is used to achieve code reusability and modularity.



5\. **Inheritance**

Example: Scorpio extends car

One class inherits the properties and behavior of another class. Used for code reuse and establishing a parent-child relationship.



6\. **super Keyword**

Example: Used in Scorpio constructor

The super keyword is used to call the constructor of the parent class and initialize its variables.



7\. **Static Block**

Example: demoBlock

A static block runs once when the class is loaded, before the main method. It is used to initialize static data.



8\. **Instance Block**

Example: demoBlock

Runs every time an object is created, before the constructor. Useful for code that must run before any constructor.



9\. **Constructor Execution Order**

Example: demoBlock

Order of execution:



Static block (only once)



Instance block (each object)



Constructor (each object)

