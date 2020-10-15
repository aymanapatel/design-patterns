# Pattern

> Code reuse. 

- Used Commonly in libraries/frameworks
- IoC uses this pattern mainstream
- Algorithm emphasis


- Java API
  1. `java.util.Collections.sort()`
  2. `java.util.AbstractList.indexOf()`




## Design Considerations


## Pitfalls
1. Remember to Restrict access
2. Confusing hierarchy: Usually patterns do not change algorithm in multiple objects



## Contrast to other patterns

| Template Method                         | Strategy                            |
|-----------------------------------|-------------------------------------|
| Same algorithm; different implementation        | Algorithm per strategy      |
| Class based | Interface based |
| Compile method           | Run time   |