# SpringRestDocs
Spring Rest Docs using Spring Boot


Drawbacks of swagger

- Lot of annoying annotations which increase the number of lines of code
- In case of circular dependencies between model objects, swagger wont work


Spring Rest Docs

- Inbuilt in Spring framework
- Produces accurate and concise document
- Document will be written during unit test case
- No additional configuration required
- The API documentation is generated after the successful run of test case
- Generated API document also displays the test data

Dependency

1. spring-restdocs-mockmvc - to generate api document

2. asciidoctor-maven-plugin - to generate html for the api document

3. Spring Auto Rest Docs - To automate API documentation
