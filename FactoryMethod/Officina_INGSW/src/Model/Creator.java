package Model;

import java.util.ArrayList;

public class Creator 
{
	protected ArrayList<String> model = new ArrayList<String>();
	
	public Car createCar(String model)
	{
		Car c = makeCar();
		c.setCbrand(makeBrand());
		c.setCmodel(makeModel(model));
		return c;
	}
	
	//factory method
	public Car makeCar() {
		return new Car();
	}
	
	public String makeBrand() {
		return "generic b";
	}
	
	public String makeModel(String model) 
	{
		return "generic m";
	}
	
}
