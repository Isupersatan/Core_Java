//connecting a method to its implementation at runtime by JVM
//based on instance creation is known as Late Binding
package oops.typecasting;

class Vehicle{
	public void start() {}
	public void accl() {}
	public void stop() {}
}
//non static ,non private, non final methods are binded at runtime.
class BMW extends Vehicle{
	@Override
	public void start() {
		System.out.println("BMW starting...");
	}
	@Override
	public void accl() {
		System.out.println("BMW speeding...");
	}
	@Override
	public void stop() {
		System.out.println("BMW stoping...");
	}
}

class Thar extends Vehicle{
	@Override
	public void start() {
		System.out.println("Thar starting...");
	}
	@Override
	public void accl() {
		System.out.println("Thar speeding...");
	}
	@Override
	public void stop() {
		System.out.println("Thar stoping...");
	}
}

public class LateBinding {
	public static void driver(Vehicle v) {
//when overridden methods are called , late binding will take places.
		v.start();
		v.accl();
		v.stop();
	}
	
	public static void main(String[] args) {
		driver(new BMW());
		driver(new Thar());
	}
	//late binding also known as runtime binding or dynamic method dispatched.
}
