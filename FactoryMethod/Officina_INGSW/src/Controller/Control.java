package Controller;

import java.util.HashMap;
import java.util.Map;

import Model.Car;
import Model.Creator;
import Model.CreatorAudi;
import Model.CreatorBMW;

public class Control 
{
	private  Map<String, Creator> carType = new HashMap<String, Creator>();
	private  String brand;
	private  String model;
	
	public Control() 
	{
		carType.put("Audi", new CreatorAudi());
		carType.put("BMW", new CreatorBMW());
	}
	
	public  String start()
	{
		Creator cre = null;
		try 
		{
			System.out.println(brand);
			cre = carType.get(brand); // in automatico possediamo la tipologia di creator
			if (cre == null)
				throw new NullPointerException();
			//System.out.println(cre);
		}
		catch (Exception e) 
		{
			cre = new Creator(); // make a generic creator
		}
		Car c = cre.createCar(model);
		//System.out.println(c);
		return c.toString();
		
	}

	public  String getBrand() {
		return brand;
	}

	public  void setBrand(String b) {
		brand = b;
	}

	public  String getModel() {
		return model;
	}

	public  void setModel(String m) {
		model = m;
	}
	
	
}
