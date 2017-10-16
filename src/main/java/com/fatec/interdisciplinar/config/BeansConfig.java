package com.fatec.interdisciplinar.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.fatec.interdisciplinar.service.FuncionarioServiceImplementation;

@Configuration
@ComponentScan(basePackages = {"com.fatec.interdisciplinar"})
public class BeansConfig {
	
	@Bean(name="funcionarioService")
	public FuncionarioServiceImplementation funcionarioService() {
		return new FuncionarioServiceImplementation();
	}
	
}
