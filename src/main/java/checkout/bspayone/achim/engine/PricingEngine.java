package checkout.bspayone.achim.engine;

import java.util.Map;

import checkout.bspayone.achim.model.CheckoutBasket;
import checkout.bspayone.achim.model.Item;

public class PricingEngine {
	
	CheckoutBasket cb;
	
	public PricingEngine(CheckoutBasket cb) {
		
		this.cb = cb;
		
	}
	
	public Integer calculateTotal() {
		Integer result = 0;

		Map <Item, Integer> itemMap = cb.getItemMap();
		if(itemMap != null) {
			for(Item item : itemMap.keySet()) {

				int quantity = itemMap.get(item);

				result = result + calcItemPrize(item, quantity);

			}
		}
		return result;
	}
	
	private int calcItemPrize(Item item, int quantity ) {
		
		int result = 0;
		
		int singlePrice = item.getPrice();
		int extraPrice = item.getExtraPrice();
		int teiler = item.getExtraQuantity();
		
		int a = quantity % teiler ;
		
		if(a == 0 ) {
			int b = wieOft(quantity, teiler);
			result = b * extraPrice;
		} else if(quantity > teiler) {
			
			int c = quantity - a;
			int d = wieOft(c, teiler);
			result =  (d * extraPrice) + (a * singlePrice);
			
		} else {
			result = a * singlePrice;
		}
		System.out.println("Item " + item.getName() + " kostet " + result);
		return result;
	}
	
	private int wieOft(int zaehler, int teiler) {
		return zaehler/teiler;
	}

}
