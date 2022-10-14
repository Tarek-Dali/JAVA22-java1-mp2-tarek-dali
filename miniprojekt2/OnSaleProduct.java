package miniprojekt2;

class OnSaleProduct extends Product{
	private double discount = 0.90;
	
	OnSaleProduct(String name, int price, int amount){
		super(name, price, amount);
	}
	
	
	
	void discountedProduct() {
		this.setPrice((int) (this.getPrice() * this.discount));
	}
	
	
	
	
}
