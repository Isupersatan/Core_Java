package jsp.opps.methods;
//this is the example of static method and non static method
public class A {

	int i;//non static data member,it will be created whenever a object is created 
	static int j;//static data member,it will be created only one time ,
				//when the class is created
	
	//Non static method
	public void m1() {
		//it can access both static and non-static data members 
		System.out.println(i+" "+j);
	}
	
	//static method
	public static void m2() {
		//it can only access static data members
		//System.out.println(i+" "+j);//CTE
	}
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();//default value for both is 0
		a1.i=10;
		j=20;// there is no variable with same name so we can access it directly
		a1.m1();// 10 20
		
		A a2 = new A();
		a2.m1();//0 20
		//a static variable always store a common value for all objects
		//a non-static variable always store unique value for all objects
	}
}
