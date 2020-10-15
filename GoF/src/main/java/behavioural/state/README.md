# Pattern

- Localize state behaviour.
- Store in State Object instead of variables across the project
- OCP enforcer


Java API example
  - No example
  - Iterator (Opinion-based)


## Design Considerations

1. Abstract class/ Interface
2. State is class-based
3. If/Else condition is externalized to a given state. Hence, each condition is unaware of other states == Context unaware

### UML (Similar to strategy)

1. Context
2. State
3. ConcreteState<variable>



## Pitfalls
1. Client should know all states
2. Number of classes increases.
3. Keeps logic out of Context. (If/Else is better for contexts)
4. Cannot know State-based triggers



## Contrast to other patterns

| State                      | Strategy                            |
|-----------------------------------|-------------------------------------|
| Focus on transitionary state| Focus on algorithms|
| Transition  | Algorithm per strategy and are independant   |
| Interface based | Interface based |
| Class per State           | Class per alogrithm   |
| Client doesn't know all States |  Client knows all Strategy|