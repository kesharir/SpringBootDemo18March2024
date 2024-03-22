## Versioning: 

- You have built an amazoing REST API
  - You have 100s of consumers
  - You need to implement a breaking change
    - Example: Split name into firstName and lastName
  - Solution: Versioning REST API
    - Example: V1: 
    localhost:8080/v1/person
    {
        "name": "Ritanshu Keshari"
    }
    - Example: V2: 
    localhost:8080/v2/person
    {
        "name": {
            "firstName": "Bob",
            "lastName": "Charlie"
        }
    }
  - Variety Of Options:
    - URL
    - Request Parameter
    - Header
    - Media Type
    