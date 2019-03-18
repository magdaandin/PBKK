package tugas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//Create IoT Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("notationxml.xml");
		
		// Get Bean
		Vehicle coach = context.getBean("carVehicle", Vehicle.class);
		//TenisCoach happy = context.getBean("tenisCoach", TenisCoach.class);
		
		System.out.println(coach.getDailyService());
		//System.out.println(happy.getFortuneService().getFortune());
		
		
		context.close();

	}

}