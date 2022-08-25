import java.sql.Date;
import java.time.LocalDate;

public class Seller extends Employee{

	private int totalItemsSold;
	private float commissionPerItem;
	
	public Seller(String name, String cpf, float salary, LocalDate birthDate, int totalItemsSold, float commissionPerItem) {
		super(name,cpf,salary,birthDate);
		this.totalItemsSold = totalItemsSold;
		this.commissionPerItem = commissionPerItem;
	}
	
	@Override
	public String toString() {
		return super.toString() + totalItemsSold + "\n" + commissionPerItem;
	}
	
	
}
