package Model;

public class FactoryAudi extends FactoryCarGeneric
{
	private String model;
	
	protected FactoryAudi(String req) 
	{
		this.model = req;
	}
	
	@Override
	public String getBrand() {
		return "Audi";
	}

	@Override
	public Model getModel() 
	{
		return new AudiModel(model);
	}
	
	@Override
	public String toString() {
		return "FactoryAudi " + getModel().toString() + "," + getBrand();
	}
}
