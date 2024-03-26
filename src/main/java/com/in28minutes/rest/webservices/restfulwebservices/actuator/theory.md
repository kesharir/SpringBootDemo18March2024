## Get Production-ready with Spring Boot Actuator: 

- Spring Boot Actuator: Provides Spring Boot's production-ready features. 
  - Monitor and manage your application in your production
- Spring Boot Starter Actuator: Starter to add Spring Boot Actuator to your application
- Provides a number of endpoints: 
  - beans - Complete list of Spring beans in your app
  - health - Application health information
  - metrics - Application metrics 
  - mappings - Details around Request Mappings
- URLs: 
    - Request: http://localhost:8080/actuator
      Response:
      {
      "_links": {
      "self": {
      "href": "http://localhost:8080/actuator",
      "templated": false
      },
      "health": {
      "href": "http://localhost:8080/actuator/health",
      "templated": false
      },
      "health-path": {
      "href": "http://localhost:8080/actuator/health/{*path}",
      "templated": true
      }
      }
      }
    - Request: http://localhost:8080/actuator/health
      Response:
      {
      "status": "UP"
      }
- Note: The only thing that actuator exposes is the health of your application. If you want to expose any other details then make
  changes to application.properties
- http://localhost:8080/actuator/env --> Get Details about the environment your application is running on. 
- http://localhost:8080/actuator/metrics --> Get list of all metrics being emitted from actuator
- http://localhost:8080/actuator/metrics/http.server.requests --> Get http request latency/tps metrics 
- http://localhost:8080/actuator/mappings --> Check Request Method, URI & Controller 