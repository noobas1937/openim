package com.openim.analysis.configuration;

import com.openim.analysis.service.IRelationService;
import com.openim.analysis.service.impl.JerseyNeo4jRelationServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by shihuacai on 2015/7/29.
 */
@Configuration
public class BeanConfiguration {
    @Bean
    IRelationService relationService(){
        return new JerseyNeo4jRelationServiceImpl();
    }
}
