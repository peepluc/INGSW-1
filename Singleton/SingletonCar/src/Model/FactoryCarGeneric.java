package Model;
public abstract class FactoryCarGeneric 
{
	private static String className = "Model.FactoryAudi";
	private static FactoryCarGeneric instance = null;
	private static String model;
	
	protected FactoryCarGeneric() {}
	
	public static void init(String className, String m)
	{
		FactoryCarGeneric.className = className;
		model = m;
	}

	
	public static FactoryCarGeneric getInstance() 
	{	
		try
		{
			instance = (FactoryCarGeneric) Class.forName(className).getDeclaredConstructor(String.class).newInstance(model);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
			
		return instance;
	}

		
	abstract public String getBrand();

	abstract public Model getModel();

	@Override
	abstract public String toString();
	
}
