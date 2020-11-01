package View;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Controller.Control;

public class choose extends JPanel 
{
	private static final long serialVersionUID = 1L;
	private JTextField chooseBrand = new JTextField("Choose Brand");
	private JTextField chooseModel = new JTextField("Choose Model");
	private JLabel label = new JLabel("Prova");
	private JButton send = new JButton("Send");
	private Control c = new Control();
	public choose() 
	{
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		add(chooseBrand);
		add(chooseModel);
		add(label);
		add(send);
		
		send.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent arg0) 
			{
				c.setBrand(chooseBrand.getText());
				c.setModel(chooseModel.getText());
				String tmp = c.start();
				//System.out.println(tmp);
				label.setText(tmp);
			}
		});
	}
}
