## Customizing REST API Responses - Filtering and more....

- Serialization: Convert object into Stream
  - Most popular Serialization library in java is Jackson
- How about customizing the REST API response returned by Jackson framework?
    - 1. Customize field names in response
      - @JSONProperty
    - 2. Return only selected fields
      - Filtering 
      - Example: Filter out passwords
      - Two Types:
        - Static Filtering: Same filtering for a bean across differnt REST API
          - @JsonIgnoreProperties, @JsonIgnore
        - Dynamic Filtering: Customize filtering for a bean for specific REST API
          - @JsonFilter with FilterProvider
        - Example: 
            localhost:8080/filtering
            {
                "field1": "value1",
                "field2": "value2",
                "field3": "value3"
            }
        
            localhost:8080/filering-list
            {
                "field2": "value2",
                "field3": "value3"
            }

