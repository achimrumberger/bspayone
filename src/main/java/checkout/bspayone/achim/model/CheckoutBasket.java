package checkout.bspayone.achim.model;

import java.util.HashMap;
import java.util.Map;

public class CheckoutBasket {

	/*
	 * Item and number of bought items
	 */
	private Map<Item, Integer> itemMap;
	
	public CheckoutBasket() {
		itemMap = new HashMap<Item, Integer>();
	}
	
	public CheckoutBasket(HashMap<Item, Integer> input) {
		this.itemMap = input;
	}
	
	public void putItemInBasket(Item item, Integer quantity ) {
		itemMap.put(item, quantity);
	}
	
	public Map<Item, Integer> getItemMap() {
		return itemMap;
	}
}
