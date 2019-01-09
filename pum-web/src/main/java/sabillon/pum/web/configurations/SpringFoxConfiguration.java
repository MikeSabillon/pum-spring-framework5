package sabillon.pum.web.configurations;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * The Class SpringFoxConfig.
 *
 * @author Miguel Sabillon The Class SpringFoxConfig.
 */
@Configuration
@EnableSwagger2
public class SpringFoxConfiguration {

    /**
     * Api docket.
     *
     * @return the docket
     */
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("sabillon.pum.web.controllers")).paths(PathSelectors.any())
                .build().apiInfo(getApiInfo());
    }

    /**
     * Gets the api info.
     *
     * @return the api info
     */
    private ApiInfo getApiInfo() {
        return new ApiInfo("Photo Upload Manager WS", "A web service that manages photos on a server", "Version 1.0",
                "", new Contact("Miguel Sabillon", "https://github.com/MikeSabillon", "miguelbusinessp@gmail.com"), "",
                "", Collections.emptyList());
    }

}
