import java.util.ArrayList;

public class Test{
	public static void main(String[] args){
		Car car = new Car("Buick",100);
		System.out.println(Car.getSalesNum());

		Car car1  = new Car();
		Car car2  = new Car();
		System.out.println(Car.getSalesNum());

		System.out.println(car2.getSalesNum());
	}
}

class Car{
	private String name;
	private int price;
	private static int salesNum = 0;

	public Car(){
		salesNum ++;
	}

	public Car(String name,int price){
		this.name = name;
		this.price = price;
		salesNum ++;
	}

	public static int getSalesNum(){
		return salesNum;
	}
}