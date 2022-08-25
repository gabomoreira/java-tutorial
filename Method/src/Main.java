
public class Main {

	public static void main(String[] args) {
		
		// method => a block of code that is executed whenever it is called upon
	
		int x = 3;
		int y = 4;
		
		int z = sum(x,y);
		
		System.out.println(z);
	}
	
	static int sum(int x, int y) {
		
		int z = x + y;
		return z;
	}

}
