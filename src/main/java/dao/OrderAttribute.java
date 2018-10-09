package dao;

public class OrderAttribute {

	private String name;
	
	private String value;
	
	private String type;

	public OrderAttribute () {
		super();
	}
	
	public OrderAttribute(String t) {
		super();
		if(t != null && !t.isEmpty()) {
			this.name = t;
		}
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
	
}
