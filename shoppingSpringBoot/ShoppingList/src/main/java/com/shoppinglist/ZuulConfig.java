package com.shoppinglist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.shoppinglist.filters.*;

@Configuration
public class ZuulConfig {
	
	@Bean
	public PreFilter makePre() {
		return new PreFilter();
	}
	@Bean
	public PostFilter makePost() {
		return new PostFilter();
	}

}
