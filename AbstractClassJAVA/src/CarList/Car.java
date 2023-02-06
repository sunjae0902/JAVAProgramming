package CarList;


public abstract class Car {
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	public abstract void Washcar();
	
	
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
		Washcar();
	}

}
