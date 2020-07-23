package cn.wm.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

    //测试

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
