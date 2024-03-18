## To Find: 

- Enable debug logging


## How are requests handled ? 
- DispatcherServlet - FrontControllerPattern 
 - Mapping servlets - dispatcherServlet urls=[/]
 - Auto Configuration (DispatcherServletAutoConfiguration)

## How does "HelloWorldBean" object gets converted to a JSON ? 
- @ResponseBody + JacksonHttpMessageConverters
  - Auto Configuration (JacksonHttpMessageConvertersConfiguration)

## Who is configuring error-mapping ? 
- AutoConfiguation (ErrorMvcAutoConfiguration)

## How are all jars available (Spring, Spring MVC, Jackson, Tomcat) ? 
- Spring Boot Started Web (spring-webmvc, spring-web, spring-boot-starter-tomcat, spring-boot-starter-json)