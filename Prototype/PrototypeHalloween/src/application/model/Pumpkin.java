package application.model;

import application.Settings;

public class Pumpkin extends HalloweenShape
{
	private static final long serialVersionUID = 1L;
	
	public Pumpkin() 
	{
		super();
		super.type = Settings.pumpkin;
	}
	
}
