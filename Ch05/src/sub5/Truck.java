package sub5;

public class Truck extends Car {
	
	public Truck(String name, String color, int speed, int capacity ) {
		super(name, color, speed);
		this.capacity = capacity;
	}



	private int capacity;
	
	
	
	public void load(int capacity) {
		this.capacity+=capacity;
	}
	@Override
	public void speedDown(int speed) {
	   this.speed -= speed -10;
		super.speedDown(speed);
	}
	
	public void show() {
		super.show();
		System.out.println("적재량 : " + this.capacity);
	}
	

}
