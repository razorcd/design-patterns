### Description

```
  Observable   ----(addObserver)---->   Observer
.addObserver()                          update()
      |                                    |
      V                                    V
 MyObservable                          MyObserver1
                                       MyObserver2
```


- pub sub model (one-to-many broadcast)
- used for decoupled communication
- java has built in Observable and Observer impl.