package Model;

public class CreatorAudi extends Creator 
{
	private Audi audi;
	
	public CreatorAudi() 
	{
		super();
		audi = new Audi();
		
		for (int i = 0; i < 6; i++) 
		{
			super.model.add("A" + (i+1));
		}
	}
	
	@Override
	public Car makeCar() {
		return audi;
	}

	@Override
	public String makeBrand() {
		return audi.getCbrand();
	}

	@Override
	public String makeModel(String model) 
	{
		if (super.model.contains(model))
			return model;
		else
			return "generic Audi";
	}
	
}
