### Description

- IoC on other method, not constructor

- adds functionality to existing classes 
- extends existing classes with a `accept(obj)` method. This will call `obj.visit(this)`. 
- preserves open close principle
- uses IoC to send object inside old class that will call `obj.visit(this)` 
- adds too much complexity. Consider Adapter or Strategy pattern.
