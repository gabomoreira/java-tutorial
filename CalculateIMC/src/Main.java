import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person(170, 75);
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your height: ");
			person.setHeight(scanner.nextDouble());
			System.out.println("Enter your weight: ");
			person.setWeight(scanner.nextDouble());
		}
		
		System.out.println("Your BMI is " + person.calculateBMI(person.getHeight(), person.getWeight()));
		
		
	}

}
