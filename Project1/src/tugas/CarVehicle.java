package tugas;

import tugas.Vehicle;
import tugas.Washing;

public class CarVehicle implements Vehicle {

	private Washing frees;
	private String type;
	private String nopol;
	
	public void getDailyService() {
		// TODO Auto-generated method stub
		System.out.println("RUN RUN RUN");
	}

	public CarVehicle() {};
	
	public CarVehicle(Washing frees) {
		this.frees = frees;
	}

	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNopol() {
		return nopol;
	}

	public void setNopol(String nopol) {
		this.nopol = nopol;
	}

	public Washing getFrees() {
		return frees;
	}

	public void setFress(Washing frees) {
		this.frees = frees;
	}
	
	

}
