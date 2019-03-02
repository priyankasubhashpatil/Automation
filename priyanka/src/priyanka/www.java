package priyanka;

public class www {

	public void fullthrottle() {
		System.out.println("The car is going as fast as it can!");
	}
public void speed(int maxSpeed)
{
	System.out.println("Max speed is: "+ maxSpeed);
	}
public static <Car> void main(String[] args )
{
	Car myCar = new Car();
	myCar.fullThrottle();
	myCar.Speed(200);
}
}
