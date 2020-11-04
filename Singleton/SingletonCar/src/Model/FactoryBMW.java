package Model;
public class FactoryBMW extends FactoryCarGeneric
{
	private String model;
	public FactoryBMW(String req) 
	{
		this.model = req;
	}
	
	@Override
	public String getBrand() {
		return "BMW";
	}

	@Override
	public Model getModel()
	{
		return new BMWModel(model);
	}

	@Override
	public String toString() {
		return "FactoryBMW " + getModel().toString() + "," + getBrand();
	}
}
