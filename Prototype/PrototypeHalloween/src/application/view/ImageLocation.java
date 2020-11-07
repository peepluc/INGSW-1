package application.view;

import java.awt.Image;
import java.util.Random;

import application.Settings;

public class ImageLocation 
{
	private int i;
	private int j;
	private Image img;
	private Random r;
	
	public ImageLocation(Image img) 
	{
		super();
		this.r = new Random();
		this.img = img;
		this.i = r.nextInt(Settings.height);
		this.j = r.nextInt(Settings.weightP);
	}
	
	public int getI() {
		return i;
	}
	public int getJ() {
		return j;
	}
	public Image getImg() {
		return img;
	}
	
	
}
