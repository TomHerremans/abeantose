package spring.abeantose.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import spring.abeantose.Car;

@Configuration
public class ProjectConfiguration {

	@Primary
	@Bean(name = "car")
	Car car() {
		Car car = new Car();
		car.setName("Beantley");
		return car;
	}
	
}
