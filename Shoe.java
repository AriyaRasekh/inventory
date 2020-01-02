
public class Shoe extends Item{

	private String colour="noColour"; //should be among certain colours
	private double size=0;			 //should be positive

	//getter and setter for colour

	Shoe(String colour,double size,String Title,int quality,double price)
	{
		super(quality,Title,price);
		setColour(colour);
		setSize(size);
	}

	public void setColour(String colour)
	{
		if(colour.equalsIgnoreCase("white")   ||
			colour.equalsIgnoreCase("silver") ||
			colour.equalsIgnoreCase("red")    ||
			colour.equalsIgnoreCase("beige")  ||
			colour.equalsIgnoreCase("brown")  ||
			colour.equalsIgnoreCase("blue")   ||
			colour.equalsIgnoreCase("black")  ||
			colour.equalsIgnoreCase("pink"))
		{
			this.colour=colour;
		}
	}

	public String getColour()
	{
		return colour;
	}
	
	//getter and Setter for size
	public void setSize(double size)
	{
		if(size>0)
		{
			this.size=size;
		}
	}

	public double getSize()
	{
		return size;
	}
	
	public void Display()
	{
		System.out.println("colour of the shoe is " + colour + " and size is: "+size+" with ID: "+getId());
	}
	
	public void Purchase(int id)
	{
		
	}

}
