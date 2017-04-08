public class Seat
{
	private int  section;
	private char row;
	private int number;
	private int clicked;
	private double price;
	
	public Seat()
		{
			section	= 0;
			row		= '0';
			number	= 0;
			clicked = -1;
		}
	public Seat(int s, char r, int n)
		{
			section	= s;
			row		= r;
			number	= n;
			clicked = -1;
		}
	
	public void setSection(int s)	{ section = s; }
	public void setRow(char r)		{ row = r; }	
	public void setNumber(int n)	{ number = n; }
	public void setClicked(int c)	{ clicked = c; }
	public void setPressed(double p){ price = p; }
		
	public int 		getSection(){ return section; }
	public char 	getRow()	{ return row; }
	public int 		getNumber()	{ return number; }
	public int 		getClicked(){ return clicked; }
	public double 	getPrice(){ return price; }

	
	public String toString()
		{
			return ("S:"+section+"		R:"+row+"		N:"+number);
		}
		
}