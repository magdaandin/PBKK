package tugas;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		//IoC itu menjelaskan gimana cara buat objeknya
		//Polimorfisme di java menggunakan konsep dinamik binding
		//Create IoC Container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("vehiclexml.xml");
		//Get bean 
		Vehicle vehicle = context.getBean("myVehicle", Vehicle.class);
		vehicle.getDailyService();
		
		
		CarVehicle car = (CarVehicle) vehicle;
		System.out.println(car.getFrees().getFree());
		System.out.println(car.getNopol());
		System.out.println(car.getType());
		
		//SCOPE SINGLETON
		//secara default akan dibuat scr singleton
		//scope singleton, dimana kalo ada objek yang dibuat lagi lalu dipanggil hasilnya sama
		CarVehicle vehicle2 = context.getBean("myVehicle", CarVehicle.class);
		CarVehicle vehicle3 = context.getBean("myVehicle", CarVehicle.class);
		
		System.out.println("vehicle2: " + vehicle2);
		System.out.println("vehicle3: " + vehicle3);
		
		vehicle2.setType("Diganti");
		System.out.println("vehicle2: " + vehicle2.getType());
		System.out.println("vehicle3: " + vehicle2.getType());
		
		//PROTOTYPE SCOPE
//		BaseballCoach coach4 = context.getBean("myCoachProto", BaseballCoach.class);
//		BaseballCoach coach5 = context.getBean("myCoachProto", BaseballCoach.class);
//		
//		coach5.setName("Kita");
//		System.out.println("coach4: " + coach4.getName());
//		System.out.println("coach5: " + coach5.getName());
//		
		
		
		//Close container
		context.close();
	}

}
