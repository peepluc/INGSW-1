package application.model;

import application.Settings;

public class Zombie extends HalloweenShape
{
	private static final long serialVersionUID = 1L;
	
	public Zombie() 
	{
		super();
		super.type = Settings.zombie;
	}
}
