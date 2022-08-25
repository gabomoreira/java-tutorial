
public class Invoice {
	
	private int itemCode;
	private String description;
	private int quantity;
	private float priceUnit;
	
	public Invoice(int itemCode, String description, int quantity, float priceUnit) {
		this.setItemCode(itemCode);
		this.setDescription(description);
		this.setQuantity(quantity);
		this.setPriceUnit(priceUnit);		
	}
	
	public double getInvoiceAmount() {
		return quantity * priceUnit;
	}

	public int getItemCode() {
		return itemCode;
	}

	public void setItemCode(int itemCode) {
		this.itemCode = itemCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(quantity < 0) {
			this.quantity = 0;			
		} else {
			this.quantity = quantity;
		}
	}

	public float getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(float priceUnit) {
		if(priceUnit < 0) {
			this.priceUnit = 0;
		} else {
			this.priceUnit = priceUnit;
		}
	}
	
	
}
