## Content Negotiation: 

- Same Resource - Same URI
  - However different representations are possible
    - Example: Different Content Type - XML or JSON or ....
    - Example: Different Language - English or Dutch or .....
- How can consumer tell the REST API provider what they want?
  - Content Negotiation
- Example: Accept header (MIME types - application/xml, application/json .....)
- Example: Accept-Language header (en, nl, fr...)

## Internationalization - i18n

- Your REST API might have consumers from around the world.
- How do ou customize it to users around the world?
  - Internationalization - i18n
- Typically HTTP Request Header - Accept-Language is used
  - Accept-Language - indicated natural language and locale that the consumer prefers
  - Example: en - English (Good Morning)
  - Example: nl - Dutch(Goedemorgen)

