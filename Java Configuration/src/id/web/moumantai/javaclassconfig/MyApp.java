package id.web.moumantai.javaclassconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// Create IoC 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
		System.out.println(coach.getDailyWorkOut());
		System.out.println(coach.getEmail) + ;
		
		context.close();

	}

}
