package application.view;

import java.awt.Image;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import application.Settings;

public class ViewHandler 
{
	//map mob with relative sprite
	
	private Map<String, Image> sprites;
	private static ViewHandler vh = null;
	private Image bat;
	private Image zombie;
	private Image pupkin;
	
	private ViewHandler()
	{
		sprites = new HashMap<String, Image>();
		this.loadImage();
		this.isertImage();		
	}
	
	public static ViewHandler getView()
	{
		if (vh == null)
			vh = new ViewHandler();
		
		return vh;
	}
	
	public Image getImage(String type)
	{
		try
		{
			Image img = this.sprites.get(type);
			if (img == null)
				throw new Exception("Error get img");
			
			return img;
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			return null;
		}
	}
	
	private void isertImage()
	{
		this.sprites.put(Settings.bat, this.bat);
		this.sprites.put(Settings.pumpkin, this.pupkin);
		this.sprites.put(Settings.zombie, this.zombie);
	}
	
	private void loadImage()
	{
		try
		{
			this.bat = ImageIO.read(new FileInputStream(Settings.images + "bat.png")).getScaledInstance(Settings.weightImg, Settings.heightImg, Image.SCALE_SMOOTH);
			this.pupkin = ImageIO.read(new FileInputStream(Settings.images + "pupkin.png")).getScaledInstance(Settings.weightImg, Settings.heightImg, Image.SCALE_SMOOTH);
			this.zombie = ImageIO.read(new FileInputStream(Settings.images + "zombie.png")).getScaledInstance(Settings.weightImg, Settings.heightImg, Image.SCALE_SMOOTH);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Errore riconoscimento img");
		}
	}


	
}
