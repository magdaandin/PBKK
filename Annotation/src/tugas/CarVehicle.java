package tugas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component("myTenisCoach")

//Default bean ID : tennisCoach
@Component
public class CarVehicle implements Vehicle {
	
	//dependency injection using field directly
	@Autowired
	@Qualifier ("dataBaseWashingService")
	private Washing washing;
	
	public CarVehicle() {
		
		
	}
	
	//dependency injection using constructor
	//@Autowired
	public CarVehicle(Washing washing) {
		this.washing = washing;
	}
	
	public Washing getWashing() {
		return washing;
	}
	
	//dependency injection using setter / mutator
	//@Autowired
	public void setWashing(Washing washing) {
		this.washing = washing;
	}

	@Override
	public String getDailyService() {
		// TODO Auto-generated method stub
		return "Practice your volley";
	}
	

}