package com.kaanerol.carfactory.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kaanerol.carfactory.entity.concretes.Cabrio;
import com.kaanerol.carfactory.entity.concretes.Hatchback;
import com.kaanerol.carfactory.entity.concretes.Sedan;

/*
 * Singleton implementation of Beans
 * */

@Configuration
public class BeanFactory {

	@Bean
	public Cabrio getCabrio() {
		return new Cabrio();
	}

	@Bean
	public Hatchback getHatchback() {
		return new Hatchback();
	}

	@Bean
	public Sedan getSedan() {
		return new Sedan();
	}
}
