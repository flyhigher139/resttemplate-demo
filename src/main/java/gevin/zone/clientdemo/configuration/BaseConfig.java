package gevin.zone.clientdemo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author gevin
 */
@Configuration
public class BaseConfig {
    @Bean
    RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
