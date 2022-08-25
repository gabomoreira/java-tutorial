
public class Main {

	public static void main(String[] args) {
		
		// static = modifier. A single copy of a variable/method is created and shared.
		//			The class "owns" the static member
		
		Friend friend = new Friend("gabo");
		Friend friend2 = new Friend("anya");
		Friend friend3 = new Friend("zoe");
		
		Friend.displayFriends();
	}

}
