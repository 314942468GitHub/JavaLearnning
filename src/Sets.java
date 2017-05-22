import java.util.LinkedList;
import java.util.Iterator;

public class Sets{
	public static void main(String[] args){
		Car car1 = new Car("Buick",100);
		Car car2 = new Car("BMW",200);
		Car car3 = new Car("BenZ",300);
		Car car4 = new Car("Ford",50);

		CarSet carSet = new CarSet();
		carSet.add(car1);
		carSet.add(car2);
		carSet.add(car3);
		carSet.add(car4);
		System.out.printf("Count=%d\n",carSet.getCount());

		Car val = carSet.find("BenZ");
		System.out.printf("name=%s,price=%d\n",val.getName(),val.getPrice());

		carSet.remove("BenZ");
		System.out.printf("Count=%d\n",carSet.getCount());

		val = carSet.find("BenZ");
		if(val == null){
			System.out.println("No BenZ Found!");
		}else{
			System.out.printf("name=%s,price=%d\n",val.getName(),val.getPrice());
		}
		
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

class CarSet{
	private LinkedList <Car> cars = new LinkedList <Car>();

	public void add(Car newCar){
		cars.add(newCar);
	}

	public Car find(String name){
		for(Car car : cars){
			if(car.getName().equals(name))
				return car;
		}
		return null;
	}

	public void remove(String name){
		Iterator<Car> iterator = cars.iterator();
		while(iterator.hasNext()){
			Car car = iterator.next();
			if(car.getName().equals(name))
				cars.remove(car);
		}
	}

	public int getCount(){
		return cars.size();
	}
}