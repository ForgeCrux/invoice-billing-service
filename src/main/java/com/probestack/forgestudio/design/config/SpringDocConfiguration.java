package com.probestack.forgestudio.design.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SpringDocConfiguration {

    @Bean(name = "com.probestack.forgestudio.design.config.SpringDocConfiguration.apiInfo")
    OpenAPI apiInfo() {
        return new OpenAPI()
                .info(
                        new Info()
                                .title("Invoice Billing Service")
                                .description("Microservice for generating invoices, recording payments, and chasing overdue balances. Supports draft and issued invoices, credit notes, and tax breakdowns. ")
                                .contact(
                                        new Contact()
                                                .name("Finance Systems Team")
                                                .email("billing@example.com")
                                )
                                .version("1.0.0")
                )
        ;
    }
}
