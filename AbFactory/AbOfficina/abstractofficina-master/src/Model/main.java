package Model;
import javax.swing.JFrame;

import View.choose;

public class main 
{
	// reference to: https://it.wikipedia.org/wiki/Abstract_factory
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame("Choose Car");
		frame.add(new choose());
		
		
		
		frame.setSize(300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
