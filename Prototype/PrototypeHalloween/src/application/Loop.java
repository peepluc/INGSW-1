package application;

import application.view.Panel;

public class Loop extends Thread
{
	private Panel panel;
	
	public Loop(Panel panel) 
	{
		this.panel = panel;
	}
	
	@Override
	public void run() 
	{
		while (true)
		{
			try 
			{
				sleep(50);
				this.panel.update();
			} 
			catch (InterruptedException e) 
			{
				break;
			}
		}
	}
}
