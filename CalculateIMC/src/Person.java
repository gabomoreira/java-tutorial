
public class Person {
	
	private double height;
	private double weight;
	
	public Person(double height, double weight) {
		this.height = height;
		this.weight = weight;
	}
	
	public double calculateBMI(double height, double weight) {
		double imc = weight / (height * height);
		return imc;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
}
