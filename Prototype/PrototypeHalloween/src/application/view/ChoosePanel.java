package application.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import application.Settings;
import application.controller.ControllerChoose;

public class ChoosePanel extends JPanel
{
	private static final long serialVersionUID = 1L;
	private Image bat;
	private Image zombie;
	private Image pupkin;
	private JButton batButton;
	private JButton zombieButton;
	private JButton pupkinButton;
	
	public ChoosePanel() 
	{
		Dimension preferredSize = new Dimension(Settings.weightP2, Settings.height);
		super.setPreferredSize(preferredSize);
		super.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.loadImage();
		this.setButton();
		super.add(this.batButton);
		super.add(this.zombieButton);
		super.add(this.pupkinButton);
		super.setBackground(Color.ORANGE);
	}
	
	private void modifybutton(JButton button, String type, Image img)
	{
		button.setIcon(new ImageIcon(img));
		button.setOpaque(false);
		button.setContentAreaFilled(false);
		button.setBorderPainted(false);
		
		button.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) 
				{
					ControllerChoose.addImageToPanel(type);
				}
			});
	}
	
	private void setButton()
	{
		this.batButton = new JButton();
		this.zombieButton = new JButton();
		this.pupkinButton = new JButton();
		
		modifybutton(this.batButton, Settings.bat, this.bat);
		modifybutton(this.pupkinButton, Settings.pumpkin, this.pupkin);
		modifybutton(this.zombieButton, Settings.zombie, this.zombie);
	}
	
	private void loadImage()
	{
		try
		{
			this.bat = ImageIO.read(new FileInputStream(Settings.images + "bat.png")).getScaledInstance(Settings.weightButton, Settings.heightButton, Image.SCALE_SMOOTH);
			this.pupkin = ImageIO.read(new FileInputStream(Settings.images + "pupkin.png")).getScaledInstance(Settings.weightButton, Settings.heightButton, Image.SCALE_SMOOTH);
			this.zombie = ImageIO.read(new FileInputStream(Settings.images + "zombie.png")).getScaledInstance(Settings.weightButton, Settings.heightButton, Image.SCALE_SMOOTH);
		}
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println("Errore riconoscimento img");
		}
	}

}
