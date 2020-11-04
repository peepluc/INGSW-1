package Model;

public class BMWModel extends Model
{
	public BMWModel(String model) 
	{
		super(model);
		for (int i = 2; i < 6; i++) 
		{
			models.add("X"+(i+1));
		}
	}

	@Override
	public String toString() 
	{
		if (models.contains(model))
			return model;
		else
			return "Generic BMW";
	}

}
