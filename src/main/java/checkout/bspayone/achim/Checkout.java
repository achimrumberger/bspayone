package checkout.bspayone.achim;

import checkout.bspayone.achim.engine.PricingEngine;
import checkout.bspayone.achim.model.CheckoutBasket;
import checkout.bspayone.achim.model.Item;

public class Checkout {
	
	public Checkout() {
		
	}
	
	public Double makecheckout(CheckoutBasket cb) {
		
		PricingEngine pe = new PricingEngine(cb);
		Double totalsum = pe.calculateTotal();
		return totalsum;
	}
	

	public static void main(String[] args) {
		
		Checkout checkout = new Checkout();

		Item itemA = new Item("A", 3.0, 12.0, 4);
		Item itemB = new Item("B", 2.0, 3.0, 2);
		Item itemC = new Item("C", 3.0, 10.0, 4);
		
		CheckoutBasket cb = new CheckoutBasket();
		cb.putItemInBasket(itemA, 0);
		cb.putItemInBasket(itemB, 3);
		cb.putItemInBasket(itemC, 1);
		
		
		Double result = checkout.makecheckout(cb);
		System.out.println("and the grand total is: " + result + " euros");
	}

}
