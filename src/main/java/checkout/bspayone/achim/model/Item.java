package checkout.bspayone.achim.model;

public class Item {
	
	private String name;
	private double price;
	private double extraPrice;
	private int extraQuantity;
	
	
	
	
	public Item(String name, double price, double extraPrice, int extraQuantity) {
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getExtraPrice() {
		return extraPrice;
	}
	public void setExtraPrice(double extraPrice) {
		this.extraPrice = extraPrice;
	}
	public int getExtraQuantity() {
		return extraQuantity;
	}
	public void setExtraQuantity(int extraQuantity) {
		this.extraQuantity = extraQuantity;
	}
	
	

}
