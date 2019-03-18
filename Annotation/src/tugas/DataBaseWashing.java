package tugas;

import org.springframework.stereotype.Component;

@Component
public class DataBaseWashing implements Washing {
		
		@Override
		public String getFree() {
			return "Database";
		}

	
}