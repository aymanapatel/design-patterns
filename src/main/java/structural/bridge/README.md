# Pattern

> Decouple abstract and implementation

- Changes Abstraction won't affect client
- Keeps design for future use in mind.
- Encapsulation, inheritance, composition


Examples:
  - Driver: JDBC


## Design Considerations

- Interface and abstract class
- Expect change from both sides
- Composition over inheritance


## Pitfalls


1. Careful plan required. (Not agile)
2. Complex

## Contrast to other patterns

| State                      | Strategy                            |
|-----------------------------------|-------------------------------------|
 | Focus on transitionary state| Focus on algorithms|
| Transition  | Algorithm per strategy and are independant   |
| Interface based | Interface based |
| Class per State           | Class per alogrithm   |
| Client doesn't know all States |  Client knows all Strategy|


# DID'nt do

1. JDBC example as it has JDBC