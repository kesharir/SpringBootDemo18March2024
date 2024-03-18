## Social Media Application REST API:
1. Build a REST API for a social media application
2. Key Resources: 
    - Users
    - Posts
3. Key Details: 
    - User: id, name, birthDate
    - Post: id, description

### Reqyest Methods for REST API:
- GET - Retrieve details of  a resource 
- POST - Create a new resource 
- PUT - Update an existing resource 
- PATCH - Update a part of the resource 
- DELETE - Delete a resource 

### REST API's: 

1. Users REST API
    - Retrieve all Users
      - GET /users
    - Create a User
      - POST /users
    - Retrieve one User
      - GET /users/{id} -> /users/1
    - Delete a User
      - DELETE /users/{id} -> /users/1
    - Posts REST API
      - Retrieve all posts for a User
        - GET /users/{id}/posts
      - Create a post for a User
        - POST /users/{id}/posts
      - Retrieve details of a post
        - GET /users/{id}/posts/{post_id}

#### PLURALS:

/users
/users/1
/users/1/posts
/users/1/posts/2

#### WITHOUT PLURALS:

/user
/user/1
/user/1/post
/user/1/post/2

- REST API Best Practice : Use Plurals where resource are being fetched and posted
- 