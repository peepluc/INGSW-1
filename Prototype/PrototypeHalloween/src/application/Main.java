package application;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JSplitPane;

import application.view.ChoosePanel;
import application.view.Panel;

public class Main 
{

	public static void main(String[] args) 
	{
		JFrame f = new JFrame();
		Panel p = new Panel();
		ChoosePanel cp = new ChoosePanel();
		Loop l = new Loop(p);
		
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, p, cp);
		split.setDividerLocation(Settings.weightP);
		split.setEnabled( false );
		f.add(split);
		Dimension preferredSize = new Dimension(Settings.weight, Settings.height);
		f.setMinimumSize(preferredSize);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		l.start();
	}

}
