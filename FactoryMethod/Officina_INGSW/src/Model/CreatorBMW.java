package Model;

public class CreatorBMW extends Creator
{
	private BMW bmw;
	
	public CreatorBMW() 
	{
		super();
		bmw = new BMW();
		for (int i = 2; i < 6; i++) 
		{
			super.model.add("X" + (i+1));
		}
	}

	@Override
	public Car makeCar() 
	{
		return bmw;
	}

	@Override
	public String makeBrand() 
	{
		return bmw.getCbrand();
	}

	@Override
	public String makeModel(String model) 
	{
		if (super.model.contains(model))
			return model;
		else
			return "Generic BMW";
	}
}
