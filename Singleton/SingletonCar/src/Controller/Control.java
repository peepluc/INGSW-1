package Controller;

import Model.FactoryCarGeneric;

public class Control 
{	
	private FactoryCarGeneric fcg = null;
	public Control(String b, String m) 
	{
		String className = null;
		
		if (b.equalsIgnoreCase("audi"))
			className = "Model.FactoryAudi";
		else if (b.equalsIgnoreCase("bmw"))
			className = "Model.FactoryBMW";
		
		FactoryCarGeneric.init(className, m);
		fcg = FactoryCarGeneric.getInstance();
	}
	
	public String start()
	{
		try 
		{
			if (fcg == null)
				throw new NullPointerException();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		
		
		return fcg.toString();
		
	}	
}
