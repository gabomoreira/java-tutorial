
public class Main {

	public static void main(String[] args) {
		
		Human human = new Human("gabo", 19, 70);
		Human human2 = new Human("anya", 5, 48);
		
		System.out.println(human.name);
		System.out.println(human2.name);
		
		human2.eat();
		human.drink();
	}

}
