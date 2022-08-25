import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		// for-each = less steps, more readable, less flexible
		
		//String[] animals = {"rat", "dog", "cat", "bird"};
		ArrayList<String> animals = new ArrayList<String>();
		animals.add("rat");
		animals.add("dog");
		animals.add("cat");
		animals.add("bird");
		
		for(String i : animals) {
			System.out.println(i);
		}
	}

}
