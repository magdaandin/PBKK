package id.web.moumantai.javaclassconfig;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach() {
		
	}
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}


	public FortuneService getFortuneService() {
		return fortuneService;
	}



	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}



	@Override
	public String getDailyWorkOut() {
		// TODO Auto-generated method stub
		return "Practice again 100 times";
	}

}
