# Spring REST training
<!-- TOC START min:2 max:2 link:true asterisk:false update:true -->
- [HTTP](#http)
- [Important concepts](#important-concepts)
- [Create custom Exceptions](#create-custom-exceptions)
- [Swagger (now Open Api)](#swagger-now-open-api)
- [Persitence](#persitence)
- [Working with APIs](#working-with-apis)
- [Testing](#testing)
- [Generate Code with Swagger2](#generate-code-with-swagger2)
- [HATEOAS](#hateoas)
<!-- TOC END -->

## HTTP
### Messages
* Request
 * URL
   * Address of the resource
   * Optional parameters
 * Method: POST, PUT, DELETE, GET, ...
 * Headers
   * Accept (content type)
   * Authentication
 * Body (for PUT and POST operations)
* Response
 * Status Code
 * Headers: content type, date, ...
 * Body (for most request)
### Verbs  

| Verb        | Action           | Should be Idempotent<br>(always same result) |Should be safe <br> (don't change resources)|
| ------------- |-------------|-----|-----|
| **GET**      | fetch <br> an existing resource | yes | yes |
| **POST**      | create <br> a new resource | no | no |
| **PUT**      | update <br> an existing resource | yes | no |
| **DELETE**      | delete <br> an existing resource | yes | no |
| **HEAD**      | fetch headers of <br> an existing resource | yes | yes |
| **OPTIONS**      | fetch methods of <br> an existing resource | yes | yes |
| **PATCH**      | modify <br> an existing resource | no | no |

### Status


## Important concepts  
https://start.spring.io/ → create spring boot project from scratch.

* REST Clients
  * HTTPie
  * Postman
* @RestController  
* @GetMapping  

## Create custom Exceptions


## Swagger (now Open Api)
* Add dependencies to **pom.xml**

```xml
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger2</artifactId>
  <version>2.4.0</version>
</dependency>
<dependency>
  <groupId>io.springfox</groupId>
  <artifactId>springfox-swagger-ui</artifactId>
  <version>2.4.0</version>
</dependency>
```

* Add config class  

```java
package com.adiaz;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	private static final Contact CONTACT = new Contact ("a_name", "http://www.contact_url.org", "contact@email.com");

	private static final ApiInfo MY_API_INFO = new ApiInfo("My awesonme API Documentation",
				"This is an  getting started proof of concept API", "1.0.1",
				"https://en.wikipedia.org/wiki/MIT_License",
				CONTACT, "MIT", "https://opensource.org/licenses/MIT");

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(MY_API_INFO);
	}
}
```

* Ask for urls  
	http://localhost:8080/swagger-ui.html  
  http://localhost:8080/v2/api-docs  

## Persitence
1. Add dependencies JPA and H2
  * JPA: persistence standard for Java.
  * H2: database in memory for development purpose.

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>
<dependency>
  <groupId>com.h2database</groupId>
  <artifactId>h2</artifactId>
  <scope>runtime</scope>
</dependency>
```
2. Add annotations:
  * @Entity
  * @Id
  * @GenerateValue


3. H2 console:  
http://localhost:8080/h2-console  
Default database name: *jdbc:h2:mem:testdb*

## Working with APIs
* Swagger
* RAML
* API BluePrint
* OpenAPI 2 (Swagger2)
* Swagger Tools
  * Swagger Editor
  * Swagger UI
  * Swagger Codegen

* YAML: http://www.yamllint.com/

https://editor.swagger.io

## Testing
http://dredd.org

1. Generate yaml with swagger Editor (https://editor.swagger.io/)
2. Save locally
3. Start server
4. Call **dredd** to test
> dreed api-description-hellobean.yml http://localhost:8080

```yaml
swagger: "2.0"
info:
  version: "1.0"
  title: "Example API"
basePath: /
schemes:
  - http
paths:
  /helloBean:
    get:
      produces:
        - application/json;charset=utf-8
      responses:
        '200':
          description: 'OK'
          schema:
            type: object
            properties:
              message:
                type: string
            required:
              - message
```

* CodeFirst  
* Contract or API or design FIRST  

## Generate Code with Swagger2
* From Swagger Editor generate server, select spring  
* Extract zip  
* Import project as: "Existing maven project"


## HATEOAS
Add links with resources to response.  
Example:

```json
{
    "id": 2,
    "name": "antonio",
    "birthDate": "2019-02-27T14:20:22.994+0000",
    "_links": {
        "all-users": {
            "href": "http://localhost:8080/users"
        }
    }
}
```
1. Add library to pom.xml.  

```xml
<dependency>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-starter-hateoas</artifactId>
</dependency>
```
2. Add code to Controller

```java
@GetMapping("/users/{id}")
public Resource<User> usersRetrieve(@PathVariable int id) throws UserNotFoundException {
  User user = serviceUser.findUser(id);
  if (user==null) {
    throw new UserNotFoundException("No existe listillo");
  }
  Resource<User> resource = new Resource<>(user);
  ControllerLinkBuilder linkTo = linkTo(methodOn(this.getClass()).usersRetrieve());
  resource.add(linkTo.withRel("all-users"));
  return resource;
}
```
