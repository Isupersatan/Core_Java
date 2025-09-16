package jsp.exception_Handling;

public class exmplException {
	public static void main(String[] args) {
		System.out.println("Exception Hnadling");
		
		try {
			System.out.println(10/0);
		}
		catch (Exception e) {
			System.out.println("Exception Handled");
		}
	}
}

//Exception: In java exception is a class. its a child class of throwable class.   
