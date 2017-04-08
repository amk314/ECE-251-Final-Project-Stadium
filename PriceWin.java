
import java.awt.*;
import javax.swing.*;

public class PriceWin extends JFrame {
	public PriceWin()
	{
		super("Seats Prices");
		
		JPanel upperPanel	=	new JPanel();
		JPanel lowerPanel	=	new JPanel();
		//JPanel 
		
		JButton oK			=	new JButton("OK");
	//	oK.setBackground(Color.RED);
	//	oK.setBounds(50, 50, 50, 50);
		lowerPanel.add(oK);
		
		add(BorderLayout.CENTER, upperPanel);
        add(BorderLayout.SOUTH, lowerPanel);
			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
	}
	public static void main(String args[])
	{
		PriceWin p = new PriceWin();
		p.setVisible(true);
	}
}