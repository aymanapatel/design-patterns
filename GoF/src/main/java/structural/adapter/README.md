# Pattern

> Convert interface of a class to another interface that client expects

- Connect new code to legacy
- Legacy code
- MOE: Adapter can have multiple adapters
- Translate request
- Client, Adapter, Adaptee


Java Examples
  - `Arrays.toList()` Array: Legacy. List: Newer
  - Collections

## Design Considerations

- Client-centric
- Integrate new with old


### UML

- Client (Newer)
- Adapter (Interface)
- Legacy class

## Pitfalls

- Mutiple adapter
- MOE: Doesn;t add functionality.

## Contrast to other patterns
| Bridge                 | Adapter                            |
|-----------------------------------|-------------------------------------|
| Abstraction and Implementation vary| Provides different interface to legacy code|
| Designed upfront Retrofitted for Legacy code|
|Built in advance| Works after code is designed|