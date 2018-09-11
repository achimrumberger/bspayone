package checkout.bspayone.achim;

import checkout.bspayone.achim.engine.PricingEngine;
import checkout.bspayone.achim.model.CheckoutBasket;
import checkout.bspayone.achim.model.Item;

public class Checkout {
	
	public Checkout() {
		
	}
	
	public Integer makecheckout(CheckoutBasket cb) {
		
		PricingEngine pe = new PricingEngine(cb);
		Integer totalsum = pe.calculateTotal();
		return totalsum;
	}
	

	public static void main(String[] args) {
		
		Checkout checkout = new Checkout();

		Item itemA = new Item("A", 3, 12, 4);
		Item itemB = new Item("B", 2, 3, 2);
		Item itemC = new Item("C", 3, 10, 4);
		
		CheckoutBasket cb = new CheckoutBasket();
		cb.putItemInBasket(itemA, 0);
		cb.putItemInBasket(itemB, 3);
		cb.putItemInBasket(itemC, 1);
		
		
		Integer result = checkout.makecheckout(cb);
		System.out.println("and the grand total is: " + result + " euros");
	}

}
