Install rabbit image: `docker run -it --rm --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:3.9-management`

The two-phase commit protocol (2PC) is a widely used pattern to implement distributed transactions. 

https://microservices.io/patterns/data/saga.html

Saga Pattern. Saga Execution Coordinator is the central component to implement a Saga flow.
In the event of a failure, the microservice reports the failure to SEC, and it is the responsibility of the SEC to invoke the relevant compensation transactions.

Enterprise Integration Patterns (EIP) and builds on top of Spring Integration (SI)

