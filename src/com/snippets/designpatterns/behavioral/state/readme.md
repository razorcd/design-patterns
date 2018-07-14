### Description

- simplifies cyclomatic complexity by replacing IFs spaggety
- adding new states is easy
- couples state class with object class


```

    Fan <-------(holds)-------> State
increaseSpeed()          handleIncreaseSpeed()
decreaseSpeed()          handleDecreaseSpeed()                  
                                  ^
                      ____________|____________
                      |                       |
               ConcreteStateA           ConcreteStateA
            handleIncreaseSpeed()    handleIncreaseSpeed()
            handleDecreaseSpeed()    handleDecreaseSpeed()  
```


This coupling between Fan and it's state is not clean.