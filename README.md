# Spring REST training



https://start.spring.io/ → create spring boot project from scratch.

* REST Clients
  * HTTPie
  * Postman

## Important concepts  
* @RestController  
* @GetMapping  

## Swagger (now Open Api)
* Add dependency to **pom.xml**

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
