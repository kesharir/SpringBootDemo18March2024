## Defintion: 

Small Autonomous services that work together - Sam Newman

## Micoroservices: 

- REST
- Small Well Chosen Deployable Units
- CloudEnabled


Micorservice1 --> Micorservice2 --> Micorservice3 --> Micorservice4 --> Micorservice5

## Challenges with building Microservices: 

- Bounded Context : Defining right boundaries for microservices. 
- Configuration Management
- Dynamic Scale Up And Scale Down
- Visibility (How do you identify bug, Centralized Logging, Monitoring)
- Pack of Cards (If microservice not well designed)


## Advantages of Microservices Architecture

- Adaption of new technology and processes. 
- Dynamic Scaling
- Faster Release Cycles (Bring new features faster the to the market)

## Microservices Companents : Standardizing Ports And Urls 

#### Ports: 

Example: 
- Limits Service : 8080, 8081 
- Spring Cloud Config Server : 8088
- Currency Excahnge Service : 8000, 8001, 8002, .......
- Currency Conversion Service : 8100, 8101,......

#### Urls: 
