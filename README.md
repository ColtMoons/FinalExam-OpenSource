# Final Exam Open Source Applications

This exam was made with Java 17 and Spring Boot 2.7.1

## EndPoint
------
I work with Painting bounded context. The main port in which the API is listened is 8090 the schema ma which has only one endPonint and one table which is ideas.

The main EndPoint is ```/api/v1/ideas``` and just have to get all ideas created, this will response all data but authorId, and create an idea with all the information with no same combination of author id and textQuery. All documentation is created with swagger implemented with Open API, with 8090 default port.
To see Swagger documentation, enter to https://localhost:8090/ma-api-docs-ui.html, the implementation of get is made with Page so needs a pageable.