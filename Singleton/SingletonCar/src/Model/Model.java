package Model;

import java.util.ArrayList;

public abstract class Model
{
	protected ArrayList<String> models = new ArrayList<String>();
	protected String model;
	
	public Model(String model) 
	{
		this.model = model;
	}
	
	public abstract String toString();
}
