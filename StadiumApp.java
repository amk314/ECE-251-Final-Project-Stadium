import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class StadiumApp extends JFrame {
	
	JButton btn;
	JList selectedSeatsList;
	Stadium s = new Stadium();
	
	
	public StadiumApp(String title)
	{
		super(title);
		s.assignSeatsNumbers();
	//	Jpanel mainPanel	= new JPanel();
	//	buttonPanel.setLayout(new GridLayout(0,2,5,5));
		JPanel buttonPanel 	= new JPanel();
		JPanel seatsPanel	= new JPanel();
		JPanel upperPanel	= new JPanel();
		JPanel midPanel		= new JPanel();
		JPanel lowerPanel	= new JPanel();
		
		upperPanel.setLayout(new GridLayout(4,1,5,5));
		JLabel 	label			= new JLabel("Please, select seats desired..");
		JButton addButton 		= new JButton("Select");
		JButton removeButton	= new JButton("Remove");
		JButton resetButton		= new JButton("Reset");
		upperPanel.add(label);upperPanel.add(addButton);
		upperPanel.add(removeButton);upperPanel.add(resetButton);
		
	
		midPanel.setLayout(new GridLayout(2,1));
		JLabel selectedSeats	= new JLabel("Seats Selected");
		selectedSeatsList		= new JList();
   //   selectedSeatsList.setPrototypeCellValue("xxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        JScrollPane scrollPane 	= new JScrollPane(selectedSeatsList,
            ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
            ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        midPanel.add(BorderLayout.NORTH, selectedSeats);
		midPanel.add(BorderLayout.CENTER, scrollPane);
	//	midPanel.add(selectedSeats);
	//	midPanel.add(scrollPane);
		
		lowerPanel.setLayout(new GridLayout(3,1));
		JLabel totalPriceLabel		= new JLabel("   Total Price");
		JList totalPriceList		= new JList();
		JButton listOfPrices 		= new JButton("Seats Prices");
	//	listOfPrices.setPreferredSize(new Dimension());
		lowerPanel.add(totalPriceLabel);
		lowerPanel.add(totalPriceList);
		lowerPanel.add(listOfPrices);

		
		buttonPanel.setLayout(new GridLayout(3,1));
		buttonPanel.add(upperPanel);
		buttonPanel.add(midPanel);
		buttonPanel.add(lowerPanel);
		
		seatsPanel.setLayout(new GridLayout(27,35));
		
		
		for (int i=0;i<27;i++)
			{
				for (int j=0;j<35;j++)
					{
						btn = new JButton();
						if(s.seats[i][j].getSection()==1) 
							{
								btn.setBackground(Color.RED);
								seatsPanel.add(btn); 
							}
						else if(s.seats[i][j].getSection()==2) 
							{
								btn.setBackground(new Color(34,139,34));
								seatsPanel.add(btn); 
							}
						else if(s.seats[i][j].getSection()==3) 
							{
								btn.setBackground(new Color(0,0,205));
								seatsPanel.add(btn); 
							}
						else if(s.seats[i][j].getSection()==4) 
							{
								btn.setBackground(new Color(218,165,32));
								seatsPanel.add(btn); 
							}
						else
							{
								btn.setBackground(new Color(220,220,220));
								seatsPanel.add(btn); 
							}
							btn.addActionListener(new ActionListener() {
        					public void actionPerformed(ActionEvent e) 
        					{
                				if (s.seats[i][j].getClicked()==-1)
                					{
                						selectedSeatsList.add(btn);
                						s.seats[i][j].setClicked(1);
                					}
                					else
                					{
                						selectedSeatsList.remove(btn);
                						s.seats[i][j].setClicked(-1);
                					}
        					}
    					});
					}
			}
		
		//setLayout(new GridLayout(35,27));
		add(BorderLayout.WEST, buttonPanel);
        add(BorderLayout.CENTER, seatsPanel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
	}
	
	public static void main(String args[])
	{
		StadiumApp frame = new StadiumApp("Satdium Seats");
		frame.setVisible(true);
	}
}
