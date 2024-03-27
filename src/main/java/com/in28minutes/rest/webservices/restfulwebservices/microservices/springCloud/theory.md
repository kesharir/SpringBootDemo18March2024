## Introduction: 

- projects.spring.io/spring-cloud/
- Important Projects: 
  - Spring Cloud Netflix (Wureka, Hysterix, Zuul)
  - Spring Cloud Bus (Config Server, API Gateway)

Challenges & Solutions with Spring Cloud: 

- Configuration Management : Spring Cloud Config Server --> Store all configurations in a git repository
- Dynamic Scale Up and Scale down : Ribbon Load Balancing
  - Naming Server (Eureka) --> Service Registration & Discovery 
  - Ribbon (Client Side Load Balancing)
  - Feign (Easier REST Clients)
- Visibility And Monitoring
  - Zipkin Distributed Tracing (Trace a )
  - Netflix API Gateway
- Fault Tolerance [Hystrix]
