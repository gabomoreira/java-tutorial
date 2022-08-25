
public class Main {

	public static void main(String[] args) {
		
		String [] cars = {"Camaro", "Fusca", "Polo"};

		cars[0] = "Palio";
		
		for(int i = 0; i< cars.length; i++) {
			System.out.println(cars[i]);
		}

	}
}
