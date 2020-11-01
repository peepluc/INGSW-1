package Model;

public abstract class AbstractCarFactory
{	
	public static AbstractCarFactory getAbstractCarFactory(String brand, String model)
	{	
		if (brand.equalsIgnoreCase("bmw"))
			return new FactoryBMW(model);
		else if (brand.equalsIgnoreCase("audi"))
			return new FactoryAudi(model);
		return null;
	}
	
	abstract public String getBrand();

	abstract public Model getModel();

	@Override
	abstract public String toString();
}
