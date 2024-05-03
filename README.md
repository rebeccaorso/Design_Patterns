# Design Patterns

## 1. Abstract Factory Method
**Definition:**
The Abstract Factory pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes. This pattern is particularly useful when a system needs to be independent of how its products are created, composed, and represented.

**Example Usage:**
Imagine developing a simulation software that can represent different environments (land, sea, air). Using the Abstract Factory pattern, you could define a Factory interface with methods to create various types of animals and plants, and then implement different concrete factories for each environment, each knowing how to create objects specific to that environment.

## 2. Factory Method
**Definition:**
The Factory Method pattern defines an interface for creating an object but lets subclasses decide which class to instantiate. This pattern delegates the responsibility of object instantiation to a subclass, promoting loose coupling.

**Example Usage:**
A document management application can use the Factory Method to create different types of documents (text, charts, presentations). Each type of document will have its concrete class, and the factory method in the base class will decide which document to create based on user input, thus isolating client code from concrete document classes.

## 3. Builder
**Definition:**
The Builder pattern separates the construction of a complex object from its representation, allowing the same construction for different representations. This pattern is useful when an object needs to be created in multiple steps, and the construction process needs to be the same for different representations.

**Example Usage:**
Consider a car builder that can create different types of cars (sports, SUV, convertible). Using the Builder, the construction process of these cars can be standardized into different steps (building chassis, engine, interiors) while the specific details of each car type are handled through different concrete builders.

## 4. Chain of Responsibility
**Definition:**
The Chain of Responsibility pattern allows passing a request along a chain of handlers. Each handler decides whether to process the request or pass it to the next handler in the chain.

**Example Usage:**
In a helpdesk system, a support request may pass through different levels of technical support. Each level examines the request and decides whether it can handle it or pass it to the next level. This avoids coupling the request sender with the specific receiver and distributes responsibility among different objects.

## 5. Command
**Definition:**
The Command pattern transforms a request into an independent object that contains all the necessary information to perform the action. This allows parameterizing methods with different requests, delaying or queuing the execution of a request, and supporting undo operations.

**Example Usage:**
In a home automation application, commands such as turning on/off lights or adjusting the thermostat can be encapsulated in command objects. These commands can be sent by different devices, such as smartphones or tablets, and can be scheduled or undone as needed.

## 6. Prototype Pattern
**Definition:**
The Prototype pattern allows copying existing objects without making the code dependent on their classes. Each prototyped class implements the Prototype interface, which provides a method to clone itself.

**Example Usage:**
In a game, instead of creating objects from scratch every time in a scene, a 'prototype' object can be cloned to create identical copies. This is particularly useful in gaming scenarios where creating and destroying many similar objects can be performance-intensive.

## 7. Memento Pattern
**Definition:**
The Memento pattern allows saving and restoring the previous state of an object without revealing the details of its internal implementation. This pattern is useful for implementing features such as undo in applications that require the ability to revert to previous states.

**Example Usage:**
Imagine developing a text editor that allows users to undo text changes. Each time a significant edit is made, the editor's state is saved in a memento object. If the user wishes to undo the changes, the editor can restore the state from one of these memento objects, reverting the text to its previous state.

## 8. Mediator Pattern
**Definition:**
The Mediator pattern defines an object that centralizes complex communication and dependencies between connected objects, promoting loose coupling and preventing objects from referring directly to each other. This allows better handling of complex interactions and improves code maintainability.

**Example Usage:**
Consider an air traffic control application. Instead of allowing each aircraft to communicate directly with all others (creating an extremely complex system), a mediator – in this case, the control tower – handles all communications. Aircraft communicate only with the control tower, which then directs the actions of each aircraft, such as when and where to land.

## 9. Template Method Pattern
**Definition:**
The Template Method pattern defines the skeleton of an algorithm in a method, deferring some steps to be executed by subclasses. This allows redefining certain steps of an algorithm without changing the algorithm's structure.

**Example Usage:**
Think of an automated testing framework. The Template Method can be used to define a standard test structure, where the template method establishes the test execution flow (setup, execution, cleanup). Specific test subclasses can then customize each step by implementing methods for setup, actual test execution, and cleanup operations after the test.

## 10. Observer Pattern
**Definition:**
The Observer pattern establishes a one-to-many relationship between objects so that when one object changes state, all its dependents are notified and updated automatically. This pattern is particularly useful for implementing distributed event notification systems, where changes to one state must be reflected in real-time in other systems or components.

**Example Usage:**
Consider a climate management system in a smart building. Temperature sensors (publishers) continuously monitor the environment and, in case of significant changes, send updates to various devices (observers), such as air conditioners and heating systems, which adjust accordingly to maintain optimal temperature. This way, the climate control system can dynamically react to environmental conditions without direct human intervention, ensuring comfort and energy efficiency.

## 11. State Pattern
**Definition:**
The State pattern allows an object to change its behavior when its internal state changes. It appears as if the object is changing its class. This pattern is useful for handling complex state change situations, reducing the need for branching conditions (if-else or switch) within the code.

**Example Usage:**
Imagine developing an application to manage the lifecycle of an online order. The order can be in various states such as "Processing," "Shipped," "Delivered." Using the State pattern, you can define an abstract OrderState class with methods like process(), ship(), and deliver(). Each concrete state (e.g., ProcessingState, ShippedState, DeliveredState) will implement these methods to handle state transitions appropriately. The context (e.g., the Order class) maintains a reference to the current state and delegates state operations to concrete state objects, thus allowing the behavior of the order to change based on its current state without direct intervention from client code.

## 12. Strategy Pattern
**Definition:**
The Strategy pattern is a behavioral pattern that allows defining a family of algorithms, encapsulating them in a dedicated class, and making objects interchangeable within that context. This approach allows varying algorithms independently of the clients using them.

**Example Usage:**
Imagine an e-commerce application that needs to implement different tax calculation strategies depending on the customer's country. With the Strategy pattern, you can define a TaxStrategy interface with a calculateTax() method and then implement various concrete strategies for different tax contexts, such as USTaxStrategy, EUTaxStrategy, and AsiaTaxStrategy.

## 13. Iterator Pattern
**Definition:**
The Iterator pattern provides a way to access the elements of a sequential aggregate object without exposing its underlying representation. This pattern is particularly useful for managing different traversal modes of a collection.

**Example Usage:**
Consider a collection of data such as a tree or a graph. Using the Iterator pattern, you can provide uniform access to the elements of these complex data structures without the client code having to handle the differences between the various structures. For example, you could have different iterators like DepthFirstIterator and BreadthFirstIterator to traverse a graph.

## 14. Visitor Pattern
**Definition:**
The Visitor pattern allows separating an algorithm from the structure of the objects it operates on. This pattern provides a way to add new operations to existing classes without modifying them.

**Example Usage:**
Imagine having a customer management system in an insurance context. The Visitor pattern allows an object to traverse a list of customers and send them personalized messages regarding insurance.

## 15. Adapter Pattern
**Definition:**
The Adapter pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by transforming the interface of an existing class into another interface expected by clients.

**Example Usage:**
Suppose you have a new interface for rendering charts, but an existing library offers similar functionality with a different interface. Instead of rewriting the existing library, you can use an adapter to make the existing library work with the new rendering interface, thus enabling seamless integration.

## 16. Bridge Pattern
**Definition:**
The Bridge Pattern is a structural pattern that separates an abstraction from its implementation, allowing them to vary independently. It is used to divide a large class or a set of closely related classes into two separate hierarchies - abstraction and implementation - that can be developed and modified independently.

**Example Usage:**
In a pizza delivery application, there are different types of pizzas available, each with its unique taste, and different types of restaurants with different cooking styles. When an order for a pizza is placed, the application uses the bridge pattern to ensure that the pizza is composed according to the customer's preferences and cooked following the specific style of the chosen restaurant. This way, the bridge pattern facilitates integration between the different types of pizzas and the various cooking styles of the restaurants, allowing efficient and personalized delivery.

## 17. Composite Pattern
**Definition:**
The Composite Pattern is a structural pattern that allows treating groups of objects and individual objects uniformly. This pattern organizes objects into a tree structure to represent part-whole hierarchies. It enables users to work with individual objects and object compositions uniformly.

**Example Usage:**
Imagine having a gift box management system containing individual items and other boxes. The client creates a main box and adds some items like books and video games, along with a smaller box containing a book. The total price of all items inside the main box is then calculated. The composite pattern allows treating individual objects and object compositions the same way, simplifying the code and making operations uniform on both individual objects and groups of objects.

## 18. Decorator Pattern
**Definition:**
The Decorator Pattern is a structural pattern that allows adding additional responsibilities to objects dynamically without altering their structure through inheritance. This pattern provides a flexible alternative to deriving extended classes to extend functionality.

**Example Usage:**
Imagine having a notification system. The decorator pattern allows extending the functionality of various social platforms. This way, notifications can be sent through various channels without directly modifying the code.

## 19. Facade Pattern
**Definition:**
The Facade Pattern is a structural pattern that provides a unified interface to a set of interfaces in a subsystem. This pattern defines a high-level interface that makes the subsystem easier to use.

**Example Usage:**
Consider a complex system for managing multimedia devices in a car, which includes subsystems for audio, video, and Bluetooth connectivity. A facade can offer a simple interface to start music, stop video, or manage calls, hiding the complexity and dependencies between subsystems.

## 20. Flyweight Pattern
**Definition:**
The Flyweight Pattern is a structural pattern that uses sharing to support a large number of fine-grained objects efficiently. It is particularly useful when a large part of an object's state can be shared and made external to it.

**Example Usage:**
Imagine having an application to manage types of books. It uses a factory to create and share instances of book types. This way, if the same type of book is requested multiple times, the same object is returned instead of creating a new one each time. This saves memory and improves the overall performance of the application.

## 21. Proxy Pattern
**Definition:**
The Proxy Pattern provides a surrogate or placeholder for another object to control access to it. This pattern is used when you want to impose restrictions on accessing an object, lazy loading, or to provide transparent localization of an object in a distributed environment.

**Example Usage:**
In access control to a file system, a proxy can be used to control user operations on files. The proxy verifies a user's credentials before allowing actual access to the file, providing additional security.

## 22. Singleton
**Definition:**
The Singleton Pattern is a creational pattern that ensures a class has only one instance while providing a global access point to this instance.

**Example Usage:**
In an application, the Singleton pattern can be used to manage the application's configuration. A singleton object can contain all the configurations that remain constant during the application's execution and can be read from various parts of the program.

