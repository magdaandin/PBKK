package id.web.moumantai.javaclassconfig;

import org.springframework.stereotype.Component;

@Component
public class DataBaseFortuneService implements FortuneService {
	
	@Override
	public String getFortune() {
		return "Database";
	}

}
