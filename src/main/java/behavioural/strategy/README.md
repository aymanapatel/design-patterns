# Pattern

- Eliminates conditional statements
- Behaviour is encapsulated in classes
- Client is aware of all strategies, and chooses strategy according to her need.

Java API example

  - `java.util.Comparator`


## Design Considerations

- Abstract base class -> Concrete class per strategy

- Remove if/else

- Strategies are independant.

### UML

1. Context
2. Strategy
3. ConcreteStrategy<variable>



## Pitfalls
1. Client should be awar of all strategies
2. Number of classes increases.



## Contrast to other patterns

| State                      | Strategy                            |
|-----------------------------------|-------------------------------------|
 | Focus on transitionary state| Focus on algorithms|
| Transition  | Algorithm per strategy and are independant   |
| Interface based | Interface based |
| Class per State           | Class per alogrithm   |
| Client doesn't know all States |  Client knows all Strategy|