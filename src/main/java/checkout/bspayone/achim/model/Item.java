package checkout.bspayone.achim.model;

public class Item {
	
	private String name;
	private int price;
	private int extraPrice;
	private int extraQuantity;
	
	
	
	
	public Item(String name, int price, int extraPrice, int extraQuantity) {
		super();
		this.name = name;
		this.price = price;
		this.extraPrice = extraPrice;
		this.extraQuantity = extraQuantity;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getExtraPrice() {
		return extraPrice;
	}
	public void setExtraPrice(int extraPrice) {
		this.extraPrice = extraPrice;
	}
	public int getExtraQuantity() {
		return extraQuantity;
	}
	public void setExtraQuantity(int extraQuantity) {
		this.extraQuantity = extraQuantity;
	}
	
	

}
