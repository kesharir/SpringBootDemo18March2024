## Spring Security: 

- Whenever we send a request, SpringSecurity intercept the request. 
- There are series of checks done in Filter Chains:
  - All requests should be authenticated
  - If the request is not authentiated, a web page is shown. 
  - CSRF Check introduced as part of filter chain -> POST, PUT

Note: In SpringSecurity we will be overiding the filter chain. 

## Configuration: 

- Bean : FilterChain