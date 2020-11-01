package Controller;
import Model.AbstractCarFactory;

public class Control 
{	
	private AbstractCarFactory acf = null;
	
	public Control(String b, String m) 
	{
		acf = AbstractCarFactory.getAbstractCarFactory(b, m);
	}
	
	public String start()
	{
		try 
		{
			if (acf == null)
				throw new NullPointerException();
			//System.out.println(cre);
		}
		catch (Exception e) 
		{
			System.out.println("scelta non valida");
			return "generic";
		}
		return acf.toString();
		
	}	
}
