package com.fermi4.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.fermi4.springcloud.filter.CustomFilter;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulProxyServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulProxyServerApplication.class, args);
	}
	
	/*
	 * Zuul automatically picks up this filter
	 */
	@Bean
	public CustomFilter getFilter() {
		return new CustomFilter();
	}

}
