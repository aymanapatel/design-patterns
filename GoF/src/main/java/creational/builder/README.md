
# Builder pattern

> Successor to static factory in Effective Java


## Design Considerations 

Helps in choosing constructors (flexible telescoping constructors)
Static Inner Class (Item 1)
Class calls appropriate constructor
Negates the need for exposed setters. (Enforcing immutability)



## Features
Handles complex constructors

Large number of parameters 

Ensures immutability after object creation

Java Libraries
1. StringBuilder
2. DocumentBuilder: Used in Abstract Factory Pattern as `DocumentBuilderFactory`
3. Locale.Builder




## Pitfalls 

1. It is immutable and static class. Remember it.
2. Cannot refactored.


## Compared to other design patterns

| Prototype                         | Builder                             |
|-----------------------------------|-------------------------------------|
| Handle complex constructors       | Handle complex constructors        |
| Implemented around a clone      | No interface |
|     | Can be separate class                 |
| Difficult to work with legacy code | Works with legacy code              |  



