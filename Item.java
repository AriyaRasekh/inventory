public abstract class Item{

	public String author;
	private int id;  			 				 //must be unique and positive
	private static int counter=0;    	       	 //used for auto count
	private double price;			 		   	 //non negative number
	private int quantity=0;						 //non negative integer
	protected String Title;

	//constructor
	Item(int quality,String Title,double price)
	{
		setQuantity(quality);
		this.Title=Title;
		setPrice(price);
		id=++counter;
	}

	//getter method for ID
	public int getId()
	{
		return id;
	}


	//getter and Setter for price
	public void setPrice(double price)
	{
		if(price>=0){
			this.price=price;
		}
	}

	public double getPrice()
	{
		return price;
	}

	//Setter and Getter for quantity
	public void setQuantity(int quantity)
	{
		if(quantity>=0) {
			this.quantity = quantity;
		}
	}

	public int getQuantity(){
		return quantity;
	}

	//abstract methods
	public abstract void Display();			    //will Display Item
	public abstract void Purchase(int id);		//will remove item from inventory


}
