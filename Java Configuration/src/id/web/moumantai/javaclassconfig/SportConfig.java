package id.web.moumantai.javaclassconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;

//Config job : IoC + Dependency Injection

@Configuration
@PropertySources("classpath:sport.properties")
public class SportConfig {
	
	//IoC
	//Create object
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach();
		return mySwimCoach;
	}
	
	@Bean
	public Coach swimCoach(FortuneService fortuneService) {
		SwimCoach mySwimCoach2 = new SwimCoach(happyFortuneService());
		return mySwimCoach2;
	}

}
