package com.es;


import java.io.IOException;

import org.elasticsearch.node.NodeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

@Configuration
@EnableElasticsearchRepositories(basePackages="com.es.repository")
public class EsConfig {
	
	@Bean
	public NodeBuilder nodebuilder() {
		return new NodeBuilder();
	}
	
	@Bean
	public ElasticsearchOperations ElasticsearchTemplate() throws IOException{
		return new ElasticsearchTemplate(nodebuilder().local(true).node().client());				
	}
}
