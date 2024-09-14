Factory Design Pattern :
When there is a super class and multiple subclass and we want to get object of subclass based on input and requirement ,
Then we create factory class which takes the responsibility of creating object of class based on input.
Hide the implementation from client


Advantages :
focus of creating object for interface rather than implementation
Loose coupling, more robust code

Key Concepts of the Factory Pattern
Factory Method: A method in the factory class or interface responsible for creating and returning instances of a particular type.
Product: The objects that are being created by the factory. These objects usually belong to a common superclass or implement a common interface.
Decoupling: The pattern promotes loose coupling by delegating the instantiation process, making the client code independent of the exact types of objects it needs to create.