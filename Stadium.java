import java.io.*;
import java.io.BufferedReader;

public class Stadium
{
	public Seat[][] seats;
	
	public Stadium()
		{
			seats = new Seat[27][35];
			//assignSeatsNumbers();	
		}
		
	public void assignSeatsNumbers() 					//throws java.io.IOException
		{
			try {
				FileReader in1 = new FileReader("sections.txt");
				FileReader in2 = new FileReader("rows.txt");
				FileReader in3 = new FileReader("numbers.txt");			
			
				
				BufferedReader br = new BufferedReader(in1);				
					for(int i=0;i<27;i++)
						{
							for(int j=0;j<35;j++)
								{
									
									int sec = br.read();
									seats[i][j]=new Seat();

											if(Character.isDigit(sec))
											{
												seats[i][j].setSection(Character.getNumericValue(sec));
											}
											else
												seats[i][j].setSection(0);
								}
								br.skip(2);
						}
						
				br = new BufferedReader(in2);	
					for(int x=0;x<27;x++)
						{
							for(int y=0;y<35;y++)
								{	
									int row = br.read();
									
											if(Character.isAlphabetic(row))
											{
												seats[x][y].setRow((char)row);
											}
											else
												seats[x][y].setRow('*');
								}
								br.skip(2);
						}
						
				br = new BufferedReader(in3);	
						for(int u=0;u<27;u++)
						{
							for(int v=0;v<35;v++)
								{	
									int num = br.read();
									
											if(Character.isDigit(num))
											{
												seats[u][v].setNumber(Character.getNumericValue(num));
											}
											else
												seats[u][v].setNumber(0);
								}
								br.skip(2);
						}
				in1.close();
				in2.close();
				in3.close();
				}
				catch(IOException e)
					{
						System.out.println(e.getMessage());
					} 
		}
//	public Seat[][] getSeats(){return seats;}
//	public Seat getSeats(int i, int j){return seats[i][j];}

	public static void main(String args[])
	{
		Stadium s = new Stadium();
		s.assignSeatsNumbers();
		for(int i=0;i<27;i++)
			{
				for(int j=0;j<35;j++)
					{
						System.out.println(s.seats[i][j]);
					}
					System.out.println("###############");	
			}
			
	}
}

