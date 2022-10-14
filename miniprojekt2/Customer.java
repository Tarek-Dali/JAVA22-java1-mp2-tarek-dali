package miniprojekt2;

class Customer {
	private int productsBought;
	private int totalPrice;
	
	void printThem() {
		System.out.println("You purchased a total of " + productsBought + " products. The total cost was " + totalPrice + " SEK");
	}
	
//	void callPrintThem() {
//		printThem();
//	}
//	
//	int getProductsBought() {
//		return productsBought;
//	}
//	
//	int getTotalPrice() {
//		return totalPrice;
//	}
//	
	
	void updatePT(int price) {
		this.productsBought = this.productsBought + 1;
		this.totalPrice = this.totalPrice + price;
	}
}
