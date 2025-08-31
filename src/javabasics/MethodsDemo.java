package javabasics;

public class MethodsDemo {

	public static void main(String[] args) {
		
		MethodsDemo my = new MethodsDemo();
		my.myMethod();
		my.myStr();
		my.myInt();
		myBoolen();
		
		
	}
	public void myMethod() {
		System.out.println("Method Demo");
	}
	
	public String myStr(){
		System.out.println("String Method");
		return "Siva";
	}
	
	public int myInt() {
		System.out.println("My Int Method");
		return 1;
	}
	
	public static boolean myBoolen() {
		System.out.println("My boolean method");
		return true;
		
	}

}
