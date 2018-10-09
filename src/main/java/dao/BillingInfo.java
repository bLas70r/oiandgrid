package dao;

public class BillingInfo {

	private long id;
	
	private String billingType;
	
	private String creditCardType;
	
	private String creditCardID;
	
	private double paymentAmmount;
	public BillingInfo () {
		super();
	}
	
	public BillingInfo(String t) {
		super();
		if(t != null && !t.isEmpty()) {
			this.billingType = t;
		}
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBillingType() {
		return billingType;
	}

	public void setBillingType(String billingType) {
		this.billingType = billingType;
	}

	public String getCreditCardType() {
		return creditCardType;
	}

	public void setCreditCardType(String creditCardType) {
		this.creditCardType = creditCardType;
	}

	public String getCreditCardID() {
		return creditCardID;
	}

	public void setCreditCardID(String creditCardID) {
		this.creditCardID = creditCardID;
	}

	public double getPaymentAmmount() {
		return paymentAmmount;
	}

	public void setPaymentAmmount(double paymentAmmount) {
		this.paymentAmmount = paymentAmmount;
	}
	
	
}
