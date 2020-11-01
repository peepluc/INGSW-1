package Model;

public class AudiModel extends Model
{
	public AudiModel(String model)
	{
		super(model);
		for (int i = 0; i < 6; i++) 
		{
			models.add("a"+(i+1));
		}
	}

	@Override
	public String toString() 
	{
		if (super.models.contains(model))
			return model;
		else
			return "Generic Audi";
	}
	
}
