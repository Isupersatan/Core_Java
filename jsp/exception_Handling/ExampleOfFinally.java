package jsp.exception_Handling;

public class ExampleOfFinally {
	public static void main(String[] args) {
		System.out.println("Mains Starts");
		System.out.println("DB opens");
		try {
			System.out.println("Data Transfer");
			System.out.println(10/0);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
		finally {//finally{} will always execute if exception is occures or not
			System.out.println("DB closed");
		}
		System.out.println("Mains Starts");
	}
}
