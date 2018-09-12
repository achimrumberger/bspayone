package checkout.bspayone.achim.engine;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import checkout.bspayone.achim.model.CheckoutBasket;
import checkout.bspayone.achim.model.Item;

@RunWith(Parameterized.class)
public class PricingEngineTest {
	
	private static Item itemA = new Item("A", 3, 12, 4);	
	
	private static HashMap<Item, Integer> hm1 = new HashMap<Item, Integer>();
	private static HashMap<Item, Integer> hm2 = new HashMap<Item, Integer>();
	private static HashMap<Item, Integer> hm3 = new HashMap<Item, Integer>();
	private static HashMap<Item, Integer> hm4 = new HashMap<Item, Integer>();
	
	@Parameters
    public static Collection<Object[]> data() {
    	hm1.put(itemA, 0);
    	hm2.put(itemA, 1);
    	hm3.put(itemA, 4);
    	hm4.put(itemA, 5);
        return Arrays.asList(new Object[][] {  
        	  { new CheckoutBasket(null), 0 } ,
                 { new CheckoutBasket(hm1), 0 } ,
                 { new CheckoutBasket(hm2), 3 } ,
                 { new CheckoutBasket(hm3), 12 } ,
                 { new CheckoutBasket(hm4), 15 }
           });
    }

	PricingEngine pe;

	
	private CheckoutBasket input;
	private Integer expected;
	
	public PricingEngineTest(CheckoutBasket cb, Integer expected) {
		
		this.input = cb;
		this.expected = expected;
	}

	
	@Test
	public void calculateTotalTest2() {
		
		pe = new PricingEngine(input);
		assertTrue(expected == pe.calculateTotal());
	}
}
