### Description

- works as a one way linked list data structure 
- define separate handlers that will be executed one after another
- one handler has information of the next handler
- only one handler (not necessary the first) needs to be invoked by client(Main code), the rest will be triggered by each successor handler from chain
- client can invoke any handler, the other triggered handlers are transparent to client
- each handler decides if and when to call next handler
- works same as Servlets and Spring Security
- differs from middleware. In middleware, a separate registry is holding the order.
 