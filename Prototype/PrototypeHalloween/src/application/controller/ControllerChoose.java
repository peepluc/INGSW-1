package application.controller;

import java.awt.Image;

import application.view.ImageLocation;
import application.view.Panel;
import application.view.ViewHandler;

public class ControllerChoose 
{
	public static void addImageToPanel(String type)
	{
		Image img = ViewHandler.getView().getImage(type);
		ImageLocation il = new ImageLocation(img);
		Panel.addImage(il);
	}
}
