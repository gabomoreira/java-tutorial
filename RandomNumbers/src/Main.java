import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		// random => pseudo-random values
		// random.nextDouble() => number 0 < number > 1
		
		Random random = new Random();
		
		// int x = random.nextInt(6) + 1;
		//double y = random.nextDouble();
		boolean z = random.nextBoolean();
		
		System.out.println(z);
	}

}
