package spring.abeantose;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import spring.abeantose.configuration.ProjectConfiguration;
import spring.abeantose.configuration.ProjectConfigurationStereotype;

public class Main {

	public static void main(String[] args) {
		
		//1
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		
		Car car1 = context.getBean("car", Car.class);
		System.out.println(car1.getName());
		
		//2
		AnnotationConfigApplicationContext contextStereotype = new AnnotationConfigApplicationContext(ProjectConfigurationStereotype.class);
		
		CarStereotype carStereotype = contextStereotype.getBean(CarStereotype.class);
		System.out.println(carStereotype);
		
		// 3
		AnnotationConfigApplicationContext programmaticContext = new AnnotationConfigApplicationContext(CarProgrammatic.class);
		
		CarProgrammatic carProgrammatic = new CarProgrammatic();
		
		System.out.println(carProgrammatic);
		
		// List
		List<CarProgrammatic> cars = new ArrayList<>();
		cars.add(new CarProgrammatic("Beantley", "Red"));
		cars.add(new CarProgrammatic("Mercebeans", ""));
		cars.add(new CarProgrammatic("Beantrick", "Blue"));
		
		// Heinz Beanz
		System.out.println("==========================================");
		
		int i = 1;
		
		for (CarProgrammatic car : cars) {
			
			if (!car.getColor().isEmpty()) {
				programmaticContext.registerBean("car" + i, CarProgrammatic.class, car);
				System.out.println("car" + i);
			}
			
			i++;
		}
		


	}
	
}
