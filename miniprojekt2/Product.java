package miniprojekt2;

class Product {
	private String name;
	private int price;
	private int amount;

	Product(String name, int price, int amount) {
		this.name = name;
		this.price = price;
		this.amount = amount;
	}
	
	String getName() {
		return name;
	}
	
	int getPrice() { 
		return price;
	}
	
	int getAmount() {
		return amount;
	}
	
	void setAmount() {
		this.amount = this.amount - 1;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}
