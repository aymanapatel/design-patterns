
# Singleton Pattern

- [Java API examples](#java-api-examples)
- [TODO](#todo)
- [Pitfalls](#pitfalls)
- [Compared to other patterns](#compared-to-other-patterns)
  * [Confused with factory](#confused-with-factory)

## Java API examples
1. Runtime
2. Logger
3. Spring Beans
4. Graphics APIs

## TODO

1. [Demo:Add database](https://app.pluralsight.com/course-player?clipId=26aa7a97-2943-439e-8b69-d4ac0542fe5f) ; Requires derby DB






## Pitfalls

|Pitfall|Additional Detail|
|----|----|
|Overused. || 
|Difficult to unit test- Because of private constructor.||
|If not careful, not thread-safe.||
|Confused with factory pattern |**ROT:** If there are parameters in `getInstance` method -> It becomes a *Factory* pattern|
|`java.util.Calender` is not Singleton. It is `Protoype` pattern||


## Compared to other patterns


### Confused with factory

| Singleton                         | Factory                             |
|-----------------------------------|-------------------------------------|
| Returns same instance             | Returns multiple instance           |
| One constructor without arguments | Mutiple constructors with arguments |
| No interface                      | Interface driven                    |
|                                   | Adaptible to environment            |

