
public class Main {

	public static void main(String[] args) {

		// overloaded methods => methods that share the same name but have different parameters
		// 						 method name + parameters = method signature
	
		int a = sum(1,2,3,4);
		double b = sum(1.0,2.0,3.0,4.0);
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	static int sum(int a, int b) {
		System.out.println("This is overloaded method 1#");
		return a + b;
	}
	static int sum(int a, int b, int c) {
		System.out.println("This is overloaded method 2#");
		return a + b + c;
	}
	static int sum(int a, int b, int c, int d) {
		System.out.println("This is overloaded method 3#");
		return a + b + c + d;
	}

	static double sum(double a, double b) {
		System.out.println("This is overloaded method 4#");
		return a + b;
	}
	static double sum(double a, double b, double c) {
		System.out.println("This is overloaded method 5#");
		return a + b + c;
	}
	static double sum(double a, double b, double c, double d) {
		System.out.println("This is overloaded method 6#");
		return a + b + c + d;
	}
}
