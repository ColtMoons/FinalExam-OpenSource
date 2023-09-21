# Final Exam Open Source Applications

This exam was made with Java 17 and Spring Boot 2.7.1

## EndPoint
------
I work with Painting bounded context. The main port in which the API is listened is 8090 the schema ma which has only one endPonint and one table which is ideas.

The main EndPoint is ```/api/v1/ideas``` and just have to get all ideas created, this will response all data but authorId, and create an idea with all the information with no same combination of author id and textQuery. All documentation is created with swagger implemented with Open API, with 8090 default port.
To see Swagger documentation, enter to https://localhost:8090/ma-api-docs-ui.html, the implementation of get is made with Page so needs a pageable.







sequenceDiagram
    participant browser
    participant server

    browser->>server: GET https://studies.cs.helsinki.fi/exampleapp/notes
    activate server
    server-->>browser: HTML document
    deactivate server

    browser->>server: GET https://studies.cs.helsinki.fi/exampleapp/main.css
    activate server
    server-->>browser: the css file
    deactivate server

    browser->>server: GET https://studies.cs.helsinki.fi/exampleapp/main.js
    activate server
    server-->>browser: the JavaScript file
    deactivate server

    Note right of browser: The browser starts executing the JavaScript code that fetches the JSON from the server

    browser->>server: GET https://studies.cs.helsinki.fi/exampleapp/data.json
    activate server
    server-->>browser: [{ "content": "HTML is easy", "date": "2023-1-1" }, ... ]
    deactivate server

    Note right of browser: The browser executes the callback function that renders the notes
