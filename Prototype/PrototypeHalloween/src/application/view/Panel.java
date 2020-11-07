package application.view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import application.Settings;

public class Panel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private static List<ImageLocation> sprites;
	private Image bgImage;
	
	public Panel() 
	{
		super();
		try {
			this.bgImage = ImageIO.read(new FileInputStream(Settings.images + "background.jpg")).getScaledInstance(Settings.weightP, Settings.height, Image.SCALE_SMOOTH);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sprites = new ArrayList<ImageLocation>();
		Dimension preferredSize = new Dimension(Settings.weightP, Settings.height);
		super.setPreferredSize(preferredSize);
	}
	
	public static void addImage(ImageLocation img)
	{
		sprites.add(img);
	}
	
	public void update()
	{
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) 
	{
		super.paintComponent(g);

		g.drawImage(this.bgImage, 0, 0, null);
		for (ImageLocation elem: sprites)
		{
			g.drawImage(elem.getImg(), elem.getJ(), elem.getI(), Settings.weightImg, Settings.heightImg, null);
		}
	}

}
