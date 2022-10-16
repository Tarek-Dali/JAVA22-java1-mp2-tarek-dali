package miniprojekt2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		Customer c = new Customer();
		Product p = new Product("Pringles", 42, 10);
		Product p2 = new Product("Chocolates", 20, 50);
		OnSaleProduct osp = new OnSaleProduct("Balloons", 30, 15);
		osp.discountedProduct();
		

		int input;

		do {
			System.out.println("\n1. Buy " + p.getName() + ", " + p.getPrice() + " SEK, " + p.getAmount());
			System.out.println("2. Buy " + p2.getName() + ", " + p2.getPrice() + " SEK, " + p2.getAmount());
			System.out.println("3. Buy " + osp.getName() + ", " + osp.getPrice() + " SEK, " + osp.getAmount());
			System.out.println("4. Quit");
			System.out.print("Choose your option: ");
			input = scan.nextInt();
			
			switch (input) {
			
			case 1:
				if(p.getAmount() == 0) {
					break;
				}
				c.updatePT(p.getPrice());
				p.setAmount();
				break;
			case 2:
				if(p2.getAmount() == 0) {
					break;
				}
				c.updatePT(p2.getPrice());
				p2.setAmount();
				break;
			case 3:
				if(osp.getAmount() == 0) {
					break;
				}
				c.updatePT(osp.getPrice());
				osp.setAmount();
				break;
			}
		} 
		while (input != 4);
		c.printThem();
		
		scan.close();

	}

}
