# CORE-JAVA
## OOP concepts
- Object oriented programming is a programming paradigm that resolves around the concept of "objects". These objects encapsulate data(attributes) and methods(behaviours) that operate on that data.
- Java's OOP concepts are set of principles that help in designing and organizing programs in a structured, reusable, and maintainable manner.
  1. CLASS:
     - It is a blueprint or template for creating objects. A class contains fields(attributes) and         methods(behaviours). It defines what an object will look like and how it behave.  
  2. OBJECT:
     - An instance of a class is called object. Objects are real-world entities with state and behavior.
     - objects are created using ```new``` keyword. They hold specific values for the attributes defined in the class.
   3. Encapsulation:
      - The practice of wrapping data(field) and methods into a single unit(class) and restricting direct access to some of the object's components.

   4. Inheritance:
      -  A mechanism by which one class(child/sub class) can acquire properties and behaviors of another class(parent/super class) by use of ```extends``` keyword
      -  Java support only single inheritance which mean a class can inherit from only one parent
    5. Polymorphism:
      - The ability of a single entity(Method, operator, or object) to take on multiple forms;
      - Compile-Time polymorphism(Method overloading)
         - same method name with different parameter lists(number, type, or order).
      - Run-Time polymorphism(Method overriding)
         - A child class provides its specific implementation for a method defined in the parent class.
      6. Abstraction:
      - Hiding the implemetation details of a feature and exposing only the essential features.
      - Achived through abstract classes or interfaces.
      -# Abstract Class:
          - Contains both abstract(no implementation) and concrete methods.
          - use the ```abstract``` keyword
      - Interface:
          - Contains only abstract methods.
          - it support multiple inheritance.      

