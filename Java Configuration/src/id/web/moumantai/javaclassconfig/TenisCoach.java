package id.web.moumantai.javaclassconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myTenisCoach")

//Default bean ID : tennisCoach
@Component
public class TenisCoach implements Coach {
	
	//dependency injection using field directly
	@Autowired
	@Qualifier ("dataBaseFortuneService")
	private FortuneService fortuneService;
	
	public TenisCoach() {
		
		
	}
	
	//dependency injection using constructor
	//@Autowired
	public TenisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}
	
	//dependency injection using setter / mutator
	//@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice your volley";
	}
	

}