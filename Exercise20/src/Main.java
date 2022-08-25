import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int yearOfManufacture = 0;
		float valueOfCar = 0.0f;
		char wantToRepeat = 'Y';
		float percentageDiscount = 0.0f;
		float valueDiscount = 0.0f;
		
		int totalSemiNewCars = 0;
		int totalCars = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(wantToRepeat == 'Y' || wantToRepeat == 'y') {
			System.out.println("Enter value of car: ");
			valueOfCar = scanner.nextFloat();
			System.out.println("Enter year of manufacture: ");
			yearOfManufacture = scanner.nextInt();
			
			if(yearOfManufacture <= 2000) {
				valueDiscount = valueOfCar * 0.12f;
			} else {
				valueDiscount = valueOfCar * 0.07f;
				totalSemiNewCars++;
			}
			
			totalCars++;
			
			System.out.println("Value of discount is: " + valueDiscount);
			System.out.println("Total amount of the car payable is "+ (valueOfCar - valueDiscount));
			
			System.out.println("Want to do more entries? Y - Yes / N - No");
			wantToRepeat = scanner.next().charAt(0);	
		}
		
		System.out.println("Total semi new cars: "+ totalSemiNewCars);
		System.out.println("Total cars: "+ totalCars);
	}

}
