## Explore REST API using HAL Explorer: 

- 1. HAL (JSON HyperText Application Language)
    - Simple format that gives a consistent and easy way to hyperlink between resources in your API. 
- 2. HAL Explorer
    - An API explorer for RESTful Hypermedia APIs using HAL
    - Enables your non-technical teams to play with APIs
- 3. Spring Boot HAL Explorer
    - Auto configures HAL Explorer for Spring Boot Projects. 
    - spring-data-rest-hal-explorer

#### Note: If your APIs are compliant with HAL then you can use the HAL explorer to experiment and test the API. 
URL for exploring the HAL explorer: http://localhost:8080/explorer/index.html

- Sample API with links to be explored with HAL explorer: http://localhost:8080/explorer/index.html#uri=http://localhost:8080/users/1
#### Response:
{
"id": 1,
"user_name": "Adam",
"birth_date": "1994-03-26",
"_links": {
"all-users": {
"href": "http://localhost:8080/users"
}
}
}