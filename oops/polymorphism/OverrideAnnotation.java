//@Override is annotation present in java.lang package.
//We use this annotation while overriding super class method in sub class
package oops.polymorphism;

class RBI{
	public int rateOfInt() {
		return 5;
	}
}
class SBI extends RBI{
	//this is help to avoid method mismatch while overloading
	@Override
	public int rateOfInt() {
		return 10;
	}
}
class Axis extends RBI{
//if any method mismatch will happen instead of creating method
	@Override			//it will throw compile time error.
	public int rateOfInt() {
		return 8;
	}
}
// It is not mandatory to use but highly recommended.
public class OverrideAnnotation {
	public static void main(String[] args) {
		System.out.println(new SBI().rateOfInt());
		System.out.println(new Axis().rateOfInt());
	}
}
