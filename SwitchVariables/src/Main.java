
public class Main {

	public static void main(String[] args) {
		
		String x = "refrigerante";
		String y = "suco";
		String temp;
		
		temp = x;	
		x= y;
		y = temp;
		
		System.out.println("x: " + x);
		System.out.println("y: " + y);

	}

}
