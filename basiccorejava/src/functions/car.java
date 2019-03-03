package functions;

public class car {
	
	String name;
	String model;
	int wheels;
	String colour;
	
	public car(String name, String model, int wheels, String colour)
	
	{
		this.name=name;
		this.model=model;
		this.wheels=wheels;
		this.colour=colour;
	}
	//constuctor overloding
	public car()
	{
		
	}
	
	
	public static void drive() 
	
	{
		//System.out.println("The "+name+" car of model "+model+" have "+wheels+" wheels and in "+colour+" colour");
	}
public void transport()
{
	System.out.println("The "+name+" car transports passengers from Pune to Mumbai");
}

public void specificaton()
{
	System.out.println("The "+name+" car of model "+model+" have "+wheels+" wheels and in "+colour+" colour");
}
}
