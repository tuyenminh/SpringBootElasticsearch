package com.example.DocumentaryProject.configuration;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages = "com.example.DocumentaryProject")
@ComponentScan(basePackages = { "com.example.DocumentaryProject.service" })
public class Config extends AbstractElasticsearchConfiguration {

    @Bean
    @Override
    public RestHighLevelClient elasticsearchClient() {
        ClientConfiguration clientConfiguration = ClientConfiguration.builder()
//                .connectedTo("10.82.24.117:31363")
//                .withBasicAuth("elastic", "Vl9z7O88rbpc1GJ87096ZfTE")
                .connectedTo("localhost:9200")
                .withBasicAuth("elastic", "aNeQZIooym7kOrS0iioj")
                .build();
        return RestClients.create(clientConfiguration)
                .rest();
    }
}
