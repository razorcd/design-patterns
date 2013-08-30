### Description

- it is an abstract class with defined functionality or an interface.
- example of template is Comparable interface (with compareTo method). then we can call `listOfObjects.sort`.
If we would inject the comparator at runtime it would be Strategy pattern: `listOfObjects.sort(comparatorinstance)`. 
- also called the Hollywood principle: don't call us, we'll call you. 


```
  AbstractBase  -----------------> ConcreteClass
templateMethod()                    methodOne() 
   methodOne()                      methodTwo()
   methodTwo()
```