public class GiftCard extends Item{


	public String label;
	public String manufacturer;

	//constructor
	GiftCard(String label,String manufacturer,String Title,int quality,double price)
	{
		super(quality,Title,price);
		this.label=label;
		this.manufacturer=manufacturer;
	}
	public void Display()
	{
		System.out.println("labal is: " + label + " & manufacturer is "+manufacturer);
	}
	
	public void Purchase(int id)
	{
		


	}

}
