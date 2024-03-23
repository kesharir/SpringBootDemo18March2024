## HATEOAS

- Hypermedia as the Engine of Application State (HATEOAS). 
- Website allows you to: 
  - See Data and perform actions (Using Links)
- How about enhancing your REST AI to tell consumers how to perform subsequent actions? --> HATEOAS
- Implementation Options: 
  - 1. Custom Format and Implementation
    -Difficult to maintain
  - 2. Use Standard Implementation
    - HAL (JSON Hypertext Application Language): Simple format that gives a consistent and easy way to hyperlink between
        resources in your API
    - SPRING HATEOAS: Generate HAL responses with hyperlinks to resources
    - Example: 
    {
        "name" : "Adam",
        "birthDate" : "2022-08-16",
        "_links" : {
                    "all-users" : {
                                    "href" : "http://localhost:8080/users"
                                  }
                    }
    }