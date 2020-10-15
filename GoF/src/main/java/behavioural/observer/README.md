# Pattern

> Decoupling pattern. 

- One to many relation of objects
- Decouple objects.
- Event handling
- Pub/Sub comparison
  - Pub/Sub is async.
  - Observer pattern is sync.


Java API
- `java.util.Observer`
- `java.jms.Topic`
- `java.util.EventListener`


## Design Considerations

- Subject that needs to observed.
  - *Subject: Concrete implementations of defined interface or abstract class.* 

- Java world, *subject* implements the `Observable interface`


### UML


## Pitfalls

- Unexpected changes: Subject cannot know observers changes
- Ambiguity on what changed
- Debugging is difficult



## Contrast to other patterns

| Observer                         | Mediator                            |
|-----------------------------------|-------------------------------------|
| 1:M            | 1:1:M         |
| Decoupled | Decoupled |
| Broadcast communication           | Complex communication                    |

Twitter application -> Mediator -> Observer