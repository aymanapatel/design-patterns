# Factory pattern

> Parameter driven

- Opposite to Singleton pattern
- Does not expose instantiation logic
- Instantiation done by subclasses
- Specified by architecture and fraemwork; implemented by user.

- Examples:
  - Calender
  - ResourceBundle
  - NumerFormat
  
  
## Design Consideration
1. Factory is responsible for lifecycle
2. Common Interface and COncrete class

3. Parameterized create method

## Pitfalls 
1. Complex
2. Creation in subclass
3. Cannot refactor

## Compared to other design patterns 

| Singleton                         | Factory                             |
|-----------------------------------|-------------------------------------|
| Returns same instance             | Returns multiple instance           |
| One constructor without arguments | Mutiple constructors with arguments |
| No interface                      | Interface driven                    |
|                           | Adaptible to environment                    |