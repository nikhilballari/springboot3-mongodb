package com.dailypractise.demo.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot Mongo CRUD API",
                description = "Spring Boot demo project for Mongo DB CRUD operations",
                summary = "This API will perform CRUD operations on Mongo DB",
                termsOfService = "T&C",
                contact = @Contact(
                        name = "DailyPractise",
                        email = "dailypractise@test.com"
                ),
                license = @License(
                        name = "Test License"
                ),
                version = "v1"
        ),
        servers = {
                @Server(
                        description = "Dev",
                        url = "http://localhost:8090"
                ),
                @Server(
                        description = "Test",
                        url = "http://localhost:8090"
                )
        }

)
public class SwaggerConfig {

    /**
     * With Spring Boot 3 Open API Library, we do not need to create the method logic that was required for Swagger2

     * Therefore,
     *   - no need to create getDocket() method & no need to mention the API Info details
     *   - no need to add @Component annotation on SwaggerConfig class
     *   - no need to add & @EnableSwagger2 annotation on main Spring Boot application class

     * Just create a simple SwaggerConfig class and add all required details
     * in the @OpenAPIDefinition annotation as mentioned above.
     * Please explore more options at - https://springdoc.org/#Introduction

     * Commenting the old code and keeping it for reference
     */

    /*@Bean
    public Docket getDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("public-api")
                .apiInfo(getApiInfo())
                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.dailypractise.demo.controller"))
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .build();
    }

    public ApiInfo getApiInfo() {
        return new ApiInfoBuilder().title("Spring Boot Integration with Mongo DB")
                .description("APIs created to show Mongo DB Functionality")
                .version("1")
                .build();
    }*/
}
