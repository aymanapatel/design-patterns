# Pattern

> 1:M:N mapping
- Loose coupling of well defined but complex application
- Reusable component
- Hub/Router

Java API examples
  1. `java.util.Timer`
  2. `java.lang.reflect.Method.invoke()`
  
  
## Design Considerations

1, Interface-based with Concrete class
2. Mediator knows about colleagues instead of usual opposite case


### UML

## Pitfalls

1. Deity object.
2. Limits subclassing
3. Confusion with `Command` pattern



## Contrast to other patterns


| Observer                         | Mediator                            |
|-----------------------------------|-------------------------------------|
| 1:M            | 1:1:M; Defines interaction         |
| Object Decoupled | Object Decoupling |
| Broadcast communication           | Complex communication                    |
|Generic in terms of ?| Specific in  terms of ?|