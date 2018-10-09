package dao;

public class OrderItem {

	private String itemName;
	
	private int quantity;
	
	private String quality;
	
	public OrderItem () {
		super();
	}
	
	public OrderItem(String t) {
		super();
		if(t != null && !t.isEmpty()) {
			this.itemName = t;
		}
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getQuality() {
		return quality;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	
	
}
