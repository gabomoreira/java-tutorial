import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> groceryList = new ArrayList();
		
		ArrayList<String> bakeryList = new ArrayList();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");
		
		ArrayList<String> produceList = new ArrayList();
		produceList.add("tomatoes");
		produceList.add("zucchini");
		produceList.add("peppers");
		
		ArrayList<String> drinksList = new ArrayList();
		drinksList.add("water");
		drinksList.add("milk");
		
		groceryList.add(produceList);
		groceryList.add(bakeryList);
		groceryList.add(drinksList);
		
		System.out.println(groceryList.get(1).get(1));
	}

}
