# Prototype pattern

- Avoids costly creation
- Avoids subclassing

- Typically doesn't use `new`
  - First instance is `new`, rest is **cloned**


- Implement with Registry. That is objects are created and put in Registry. Objects are then cloned for use.


Java API examples
- `java.long.Objects` : Not necessary a prototype pattern, but close enoguh.


## Design Considerations
  
- Implements `Clone` or `Cloneable`interface. Avoid using `new`

- ? Opposite to `Builder` pattern

### Shallow vs Deep Copy

1. Shallow Copy: Copies immediate properties
2. Deep Copy: Copies immediate properties + Object references


## Pitfalls 

1. Don't know when to use.

2. Used in conjuction with other pattern

3. Shallow vs Deep copy is complicated.

## Compared to other design patterns


| Prototype                         | Factory                             |
|-----------------------------------|-------------------------------------|
| Lighter wight construction         | Flexible Objects           |
| Copy Constructor or Clone         | Multile constructors |
| Shallow or Deep                       | Concrete Instance                   |
| Copy of itself                   | Fresh Instance                 | 