package application;

public class Client {

	public static void main(String[] args) 
	{	
		Director d = new Director();
	
		//car
		BuilderInterface builderCar = new Car();
		d.construct(builderCar);
		Product p1 = builderCar.getVehicle();
		System.out.println(p1);
		
		//motorcycle
		BuilderInterface builderMotorcycle = new MotorCycle();
		d.construct(builderMotorcycle);
		Product p2 = builderMotorcycle.getVehicle();
		System.out.println(p2);
	}

}
