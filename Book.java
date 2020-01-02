public class Book extends Item{

	public String author;
	public String title;
	private int year; 		//should be positive and less or equal current year
	public int currentYear=2019;


	//constructor
	Book(String author,String title,int year,String Title,int quantity,double price)
	{
		super(quantity,Title,price,author);
		this.author=author;
		this.title=title;
		setYear(year);
	}

	//Getter and Setter for year
	public void setYear(int year)
	{
		if(year >0 || year <= currentYear)
		{	
			this.year=year;
		}
	}

	
	public void Display(){

		System.out.println("The title of the book is: "+title+" and it published in the "+year+" by "+author);

	}	


	public void Purchase(int id)
	{
		


	}

} 

	
