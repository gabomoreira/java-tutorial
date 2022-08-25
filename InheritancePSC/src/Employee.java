import java.sql.Date;
import java.time.LocalDate;

public class Employee {

	private String name;
	private String cpf;
	private float salary;
	private LocalDate birthDate;
	
	public Employee(String name, String cpf, float salary, LocalDate birthDate) {
		this.name = name;
		this.cpf = cpf;
		this.salary = salary;
		this.birthDate = birthDate;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setSalary(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public String toString() {
		return name + "\n" + cpf + "\n" + salary + "\n" + birthDate + "\n";
	}
}
