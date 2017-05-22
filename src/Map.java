import java.util.HashMap;

public class Map{
	public static void main(String[] args){
		Car car1 = new Car("Buick",100);
		Car car2 = new Car("BMW",200);
		Car car3 = new Car("BenZ",300);
		Car car4 = new Car("Ford",50);

		CarSet carSet = new CarSet();
		carSet.add(1,car1);
		carSet.add(2,car2);
		carSet.add(3,car3);
		carSet.add(4,car4);
		System.out.printf("Count=%d\n",carSet.getCount());

		Car val = carSet.find(3);
		System.out.printf("name=%s,price=%d\n",val.getName(),val.getPrice());

		carSet.remove(3);
		System.out.printf("Count=%d\n",carSet.getCount());

		val = carSet.find(3);
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
	private HashMap <Integer,Car> cars = new HashMap <Integer,Car>();

	public void add(Integer key,Car newCar){
		cars.put(key,newCar);
	}

	public Car find(Integer key){
		return cars.get(key);
	}

	public void remove(Integer key){
		cars.remove(key);
	}

	public int getCount(){
		return cars.size();
	}
}