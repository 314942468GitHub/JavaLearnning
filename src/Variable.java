import java.util.Scanner;

public class Variable {

    public static void main(String[] args) {
    	
    	Engine engine = new Engine(250);
    	//Car myCar = new Car(10,100,engine);
		Car myCar = new Car();
		Car myCar2 = new Car();
    	System.out.println("myCar:"+myCar.getSpeed()+myCar.getColor());
    	myCar.startup();
    	myCar.run(500);

    	System.out.println("myCar:"+myCar);
		System.out.println("myCar2:"+myCar2);
    }
}

class Car {
    private int color;
    private int speed;
    private Engine engine;
    
    public Car() {
    	System.out.println("Car():1");
    }

    public Car(int color, int speed){ 
        this.color = color;
        this.speed = speed;
        System.out.println("Car():2");
    }

    public Car(int color, int speed, Engine engine) {
    	this(color,speed);
        this.engine = engine;
        System.out.println("Car():3");
    }

    public int getColor(){
    	return this.color;
    }

     public int getSpeed(){
    	return this.speed;
    }

    void startup() {
        System.out.println("startup");
    }
    
    void run(int speed) {
        startup();
        System.out.println("speed:" + speed);
    }
}

class Engine {
    public double power;
    
    public Engine(double power) {
        this.power = power;
        System.out.println("Engine():1");
    }
}