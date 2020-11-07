package application.model;

import application.Settings;

public class Bat extends HalloweenShape
{
	private static final long serialVersionUID = 1L;
	
	public Bat() 
	{
		super();
		super.type = Settings.bat;
	}
	
}
