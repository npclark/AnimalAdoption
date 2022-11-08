package adoption.controller;

import org.springframework.context.annotation.Bean;

import adoption.beans.Animal;
import adoption.beans.AnimalAttribute;

/**
 * @author Tony Ehlert - aehlert
 * CIS175 - Fall 2022
 * Nov 8, 2022
 */
public class BeanConfigurator {

	@Bean
	public Animal animal() {
		Animal bean = new Animal();
		return bean;
	}
	
	@Bean
	public AnimalAttribute animalAttribute() {
		AnimalAttribute bean = new AnimalAttribute();
		return bean;
	}
}