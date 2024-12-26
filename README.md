# CORE-JAVA
## OOP concepts
- Object oriented programming is a programming paradigm that resolves around the concept of "objects". These objects encapsulate data(attributes) and methods(behaviours) that operate on that data.
- Java's OOP concepts are set of principles that help in designing and organizing programs in a structured, reusable, and maintainable manner.
  1. **CLASS:**
     - It is a blueprint or template for creating objects. A class contains fields(attributes) and         methods(behaviours). It defines what an object will look like and how it behave.  
  2. **OBJECT:**
     - An instance of a class is called object. Objects are real-world entities with state and behavior.
     - objects are created using ```new``` keyword. They hold specific values for the attributes defined in the class.
   3. **Encapsulation:**
      - The practice of wrapping data(field) and methods into a single unit(class) and restricting direct access to some of the object's components.

   4. **Inheritance:**
      -  A mechanism by which one class(child/sub class) can acquire properties and behaviors of another class(parent/super class) by use of ```extends``` keyword
      -  Java support only single inheritance which mean a class can inherit from only one parent
    5. **Polymorphism:***
              - The ability of a single entity(Method, operator, or object) to take on multiple forms
       - **Compile-Time polymorphism(Method overloading)** : same method name with different parameter lists(number, type, or order).
       - **Run-Time polymorphism(Method overriding)** : A child class provides its specific implementation for a method defined in the parent class.
    6. **Abstraction:**
       - Hiding the implemetation details of a feature and exposing only the essential features.
       - Achived through abstract classes or interfaces.
       - **Abstract Class**: Contains both abstract(no implementation) and concrete methods.  use the ```abstract``` keyword.
       - **Interface**: Contains only abstract methods. it support multiple inheritance.

    7. **Association :**
       - A relation Between two classes.
       - **Aggregation**: weak association. one class can exist independently of the other.
       - **Composition**: Strong association. one class cannot exist without the other.
       
    9. ***Object Cloning :***
        - Creating an exact copy of an object.
        - Achived using the ```clone()``` method of the object class.
        - The class must implement the ```cloneable``` interface.
    11. **Dynamic Binding :**
        - A mechanism where the code to be executed for a method call is decided at runtime.
       
## STRINGS
- A String in Java is a sequence of characters.
- Strings are immutable in Java, meaning their content cannot be changed once they are created.
- **Why Strings are Immutable in Java**
  - *Security:* Strings are often used for sensitive data like passwords, database connection URLs, etc. If strings were mutable, modifying one instance would impact other references, leading to security issues.
  - *Caching and Optimization:* The JVM uses a string pool to save memory. Since strings are immutable, multiple references can point to the same instance without the risk of changes.
  - *Thread Safety:* Immutability ensures that strings can be shared among multiple threads without synchronization.

 ## Custom Immutable Class
 - Custom immutable class are created using ```final``` keyword which prevents other classes from inheriting and modifying its behaviour.
 - All the fields should be ```private``` and ```final``` ensures that field cannot be changed after object created.
 - Avoid methods that allow modifications to the object's state for example setter methods
 - Ensure deep copy: If the class contains mutable objects, ensure that only a copy of the object is returned.

## Multithreading
- Multithreading is a Java feature that allows multiple threads to run concurrently within a program. Each thread represents a separate path of execution.
- **Thread**
  - A thread is a lightweight sub-process, the smallest unit of processing.
- **Process-based Multitasking**
  - Each process has its own memory and resources.
- **Thread-based Multitasking**
  - Threads within the same process share memory and resources.
- **Ways to Create Threads in Java**
  - Extending the ```Thread``` Class.
  - Implementing the ```Runnable``` Interface.
  - Using ```Callable``` and ```Future``` (For threads that return results).
  - Using the ```ExecutorService``` Framework.
- **Thread Lifecycle**
  - New: Thread is created but not yet started.
  - Runnable: Thread is ready to run and is waiting for CPU time.
  - Running: Thread is executing.
  - Blocked/Waiting: Thread is waiting for a resource or signal.
  - Terminated: Thread has completed execution.
- **Thread Class Methods**
  - ```start()```: Starts a new thread and invokes the ```run()``` method.
  - ```run()```: Defines the task to be executed by the thread.
  - ```sleep(long milliseconds)```: Makes the thread sleep for the specified time.
  - ```join()```: Waits for a thread to finish before proceeding.
  - ```yield()```: Pauses the current thread to allow others of the same priority to execute.
  - ```getName()```: Gets the name of the thread.
  - ```setName(String name)```: Sets the thread's name.
  - ```getPriority()```: Gets the thread's priority.
  - ```setPriority(int priority)```: Sets the thread's priority (range: 1 to 10).
  - ```isAlive()```: Checks if the thread is still running.
- **Thread Synchronization**
  - Synchronization ensures that shared resources are accessed by only one thread at a time, avoiding thread interference and data inconsistency.
- **Inter-Thread Communication**
   - ```wait()```: Makes the thread wait until notified.
   - ```notify()```: Wakes up a single thread waiting on the object's monitor.
   - ```notifyAll()```: Wakes up all threads waiting on the object's monitor.
- **Deadlock**
  - A deadlock occurs when two or more threads are waiting indefinitely for resources locked by each other.
  - use ```tryLock()`` to avoid deadlock from java.util.concurrent.locks.
- The ```ExecutorService``` framework provides better thread management compared to manually creating and starting threads.
