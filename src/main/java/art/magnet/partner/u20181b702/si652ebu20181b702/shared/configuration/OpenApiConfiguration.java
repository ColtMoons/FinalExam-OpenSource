package art.magnet.partner.u20181b702.si652ebu20181b702.shared.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfiguration {

    @Bean(name = "maOpenApi")
    public OpenAPI maOpenApi(){
        return new OpenAPI().components(new Components()).info(new Info().title("Manage Art Application API").description("ManageArt API implemented with Spring Boot REST service and documented using springdoc-open-api and OpenAPI 3.0"));
    }
}
