/**
*Inherit usage demo
*/

public class Inherit{
	public static void main(String[] args){
		Car car1 = new SmallCar("BenZ",100,20);
		System.out.println("BenZ:" + car1.getPrice());

		Car car2 = new Car("BMW",80);
		System.out.println("BMW:" + car2.getPrice());

	}
}

class Car{
	private String name;
	private int price;

	public Car(){
	}

	public Car(String name,int price){
		this.name = name;
		this.price = price;
	}

	public String getName(){
		return this.name;
	}

	public int getPrice(){
		return this.price;
	}
}

class SmallCar extends Car{
	private int insurance;

	public SmallCar(String name,int price,int insurance){
		super(name,price);
		this.insurance = insurance;
	}

	public int getPrice(){
		return super.getPrice()+insurance;
	}
}