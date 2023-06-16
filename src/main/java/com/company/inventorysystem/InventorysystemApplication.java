package com.company.inventorysystem;

import org.springdoc.core.SwaggerUiConfigParameters;
import org.springdoc.core.SwaggerUiConfigProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;



@SpringBootApplication
//@EnableSwagger
@Import({SwaggerUiConfigParameters.class, SwaggerUiConfigProperties.class})
public class InventorysystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorysystemApplication.class, args);
		System.out.println("hola mundo");
	}

}
