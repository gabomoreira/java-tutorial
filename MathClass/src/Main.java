import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Math.abs => transform in positive number
		// Math.round => round the number 
		// Math.ceil => round up the number 
		// Math.floor => round down the number
		// Math.sqrt => square root of the number

		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x:");
		x = scanner.nextDouble();
		System.out.println("Enter side y:");
		y = scanner.nextDouble();
		
		z = Math.sqrt((x * x) + (y * y));

		System.out.println("The hipotenuse of the "+ x +" and "+y+" sides is: " + z);
		
		scanner.close();
	}

}
